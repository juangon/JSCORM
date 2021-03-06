PlayerView = Backbone.View.extend({
    // TODO: multiple organizations
    events:{
        "click #SCORMNavigationExit":"doExit",
        "click #SCORMNavigationSuspend":"doSuspend",
        "click #SCORMNavigationBackward":"doPrevious",
        "click #SCORMNavigationForward":"doContinue",
        "click #SCORMToggleButton":"toggleLeftMenu"
    },

    initialize:function () {
        this.packageID = null;
        this.packageType = null;
        this.render();
    },
    render:function () {
        var language = this.options.language;
        var template = jQuery("#SCORMPlayerContent").html();
        this.$el.html(Mustache.to_html(template, language));
    },

    buildTree:function (data) {
        function addTreeItem(item) {
            var response = "";
            if (item.childActivities.length === 0) {
                if (item.visible) response = "<li id='" + item.id + "'><a href='#'>" + item.title + "</a></li>";
            } else {
                var innerItems = "";
                for (var i = 0; i < item.childActivities.length; i++) {
                    var childItem = addTreeItem(item.childActivities[i]);
                    if (childItem !== "") {
                        innerItems += childItem;
                    }
                }
                if (item.visible) {
                    var innerWrapper = (innerItems === "") ? ("") : ("<ul>" + innerItems + "</ul>");
                    response = "<li id='" + item.id + "'><a href='#'>" + item.title + "</a>" + innerWrapper + "</li>";
                } else {
                    response = innerItems;
                }
            }
            return response;
        }

        var items = "";
        for (var i = 0; i < data.length; i++) {
            items += addTreeItem(data[i]);
        }
        var that = this;
        jQuery("#SCORMTree").html("<ul>" + items + "</ul>");
        jQuery("#SCORMTree").jstree({
            "themes":{
                "url":Utils.getContextPath() + "/css/jstree/style.css",
                "dots":false,
                "icons":false
            },
            "plugins":[ "html_data", "ui", "themes" ]
        }).bind("select_node.jstree",function (event, data) {
                //updateView(data.rslt.obj.attr("id"));
                //updateNavigationButtons();
                //alert(data.inst.get_text(data.rslt.obj) + " - " + data.rslt.obj.attr("id")); // ID - Text
            }).bind("click.jstree", function (event) {
                var jsTree = jQuery.jstree._reference('#SCORMTree');
                var currentNode = jsTree.get_selected();
                if (!jsTree.is_leaf(currentNode)) {
                    if (!jsTree.is_open(currentNode)) {
                        jsTree.open_node(currentNode);
                    } else {
                        jsTree.close_node(currentNode);
                    }
                } else {
                    that.doChoice(currentNode.attr('id'));
                }
            });
        this.jsTreeRef = jQuery.jstree._reference("#SCORMTree");
        this.jsTreeRef.open_all();
    },

    initView:function () {
        window.LearnAjax.setHeader("currentScormPackageID", this.packageID.toString());

        function addOption(element, key, value) {
            jQuery(element).
                append(jQuery("<option></option>").
                    attr("value", key).
                    text(value));
        }

        var organizationsData = window.LearnAjax.syncRequest(Utils.getContextPath() + "/services/organizations/package/" + this.packageID);
        for (var i = 0; i < organizationsData.length; i++) {
            addOption('#SCORMOrganizations', organizationsData[i].id, decodeURIComponent(organizationsData[i].title));
        }
        if (organizationsData.length === 1) {
            jQuery('#SCORMOrganizations').hide("");
        } else if (organizationsData.length === 0) {
            return;
        } else {
            jQuery('#SCORMOrganizations').show("");
        }

        this.organizationID = organizationsData[0].id;
        var activitiesData = window.LearnAjax.syncRequest(Utils.getContextPath() + '/services/activities/package/' + this.packageID + '/organization/' + this.organizationID);
        this.buildTree(activitiesData);
    },

    setName:function (packageName) {
        this.$('#currentPackageName').html(packageName);
    },

    loadView:function (data) {
        function resizeIFrame() {
            var windowHeight = jQuery(window).height() - 150;
            jQuery("#SCORMDataOutput").height(windowHeight);
        }

        function hideNavigationControls(control) {
            switch (control) {
                case "continue":
                    jQuery("#SCORMNavigationForward").hide();
                    break;
                case "previous":
                    jQuery("#SCORMNavigationBackward").hide();
                    break;
                case "exitAll":
                    jQuery("#SCORMNavigationExit").hide();
                    break;
                case "suspendAll":
                    jQuery("#SCORMNavigationSuspend").hide();
                    break;
                default:
                    break;
            }
        }

        function showNavigationControls() {
            jQuery("#SCORMNavigationForward").show();
            jQuery("#SCORMNavigationBackward").show();
            jQuery("#SCORMNavigationExit").show();
            jQuery("#SCORMNavigationSuspend").show();
        }

        jQuery("#SCORMOrganizationsMenu").show();
        jQuery("#SCORMTree").show();

        if (data.endSession) {
            this.trigger('endSession');
            jQuery.ajax({
                type: 'POST',
                url: jQuery("#SCORMContextPath").val()+"/services/sequencing/clearSession"
            });
        }

        if (data.currentActivity && !data.endSession) {
            this.selectNode(data.currentActivity);
            jQuery('#SCORMDataOutput').attr("src", data.activityURL);
            resizeIFrame();
            API_1484_11.setActivity(this.packageID, this.organizationID, data.currentActivity);
            API.setActivity(this.packageID, this.organizationID, data.currentActivity);

            showNavigationControls();
            if (data.hiddenUI) {
                for (var i = 0; i < data.hiddenUI.length; i++) {
                    hideNavigationControls(data.hiddenUI[i]);
                }
            }
        } else {
            if (this.onSuspend) {
                this.onSuspend = false;
                this.trigger('suspend');
            }
            jQuery('#SCORMDataOutput').attr("src", "");
        }
    },

    isTincan:function () {
        return this.packageType == "tincan";
    },

    openTincanPackage:function(launchUrl, endpoint, auth, secret) {
        var actor = {
            mbox:["mailto:"+jQuery("#userEmail").val()],
            name:[jQuery("#userName").val()]
        };

        var src = "{0}/SCORMData/{1}?endpoint={2}&auth={3}&actor={4}"
            .replace("{0}", Utils.getContextPath())
            .replace("{1}", launchUrl)
            .replace("{2}", encodeURIComponent(endpoint))
            .replace("{3}", encodeURIComponent(auth))
            .replace("{4}", encodeURIComponent(JSON.stringify(actor)));

        if(secret){
            var sign = "asdasd"
            src += "&oauth_signature={0}&oauth_signature_method=HMAC-SHA1".replace("{0}", sign)
        }

        jQuery('#SCORMDataOutput').attr("src", src)
    },

    loadTincanPackage:function() {

        jQuery("#SCORMNavigationForward").hide();
        jQuery("#SCORMNavigationBackward").hide();
        jQuery("#SCORMNavigationSuspend").hide();
        jQuery("#SCORMOrganizationsMenu").hide();
        jQuery("#SCORMTree").hide();

        jQuery("#SCORMNavigationExit").show();

        var windowHeight = jQuery(window).height() - 150;
        jQuery("#SCORMDataOutput").height(windowHeight);

        var player = this;
        jQuery.ajax({
            type: 'POST',
            dataType: 'json',
            url: Utils.getContextPath() + "/services/sequencing/Tincan/" + this.packageID + "?scormUserID=" + window.LearnAjax.getHeader("scormUserID"),

            success: function(data) {
                if (data.internal) {
                    var endpoint = document.location.protocol + "//" + document.location.host + Utils.getContextPath() + "/TincanApi/";
                    player.openTincanPackage(data.launchURL, endpoint, data.auth);
                }
                else {
                    if (data.authType == "Basic") {
                        if (data.auth) {
                            player.openTincanPackage(data.launchURL, data.endpoint, data.auth);
                        }
                        else {
                            jQuery("#tincanLaunchUrlCredentialsDialog").val(data.launchURL);
                            jQuery("#tincanEndpointCredentialsDialog").val(data.endpoint);
                            jQuery('#tincanLrsUserCredentials').dialog('open');
                        }
                    } else if (data.authType === "OAuth") {
                        if(data.auth) {
                           /* var endpoint = "{0}//{1}{2}TincanApi/"
                                .replace("{0}", document.location.protocol)
                                .replace("{1}", document.location.host)
                                .replace("{2}", Utils.getContextPath());
*/
                            player.openTincanPackage(data.launchURL,  data.endpoint + "TincanApi/", data.auth, data.clientSecret);
                        }
                    }
                }
            }
        })
    },

    load:function (packageID, packageType) {
        this.packageID = packageID;
        this.packageType = packageType;
        this.initView();
        if (this.isTincan()) {
            this.loadTincanPackage();
        }
        else {
            jQuery('#SCORMDataOutput').attr("src", this.getNavigationRequestURL("start"));
        }
    },

    loadAndResume:function (packageID, packageType) {
        this.packageID = packageID;
        this.packageType = packageType;
        this.initView();
        if (this.isTincan()) {
            this.loadTincanPackage();
        } else {
            jQuery('#SCORMDataOutput').attr("src", this.getNavigationRequestURL("resumeAll"));
        }
    },

    getNavigationRequestURL:function (requestType) {
        return Utils.getContextPath() + "/services/sequencing/NavigationRequest/" + this.packageID + "/" + this.organizationID + "/" + requestType + "?scormUserID=" + window.LearnAjax.getHeader("scormUserID");
    },

    doPrevious:function () {
        if (!this.isTincan()) {
            // SCORM 1.2, ignore auto doContinue on LMSFinish
            window.API.silenceFinish();
            jQuery('#SCORMDataOutput').attr("src", this.getNavigationRequestURL("previous"));
        }
    },

    doContinue:function () {
        if (!this.isTincan()) {
            // SCORM 1.2, ignore auto doContinue on LMSFinish
            window.API.silenceFinish();
            jQuery('#SCORMDataOutput').attr("src", this.getNavigationRequestURL("continue"));
        }
    },

    doExit:function () {
        this.trigger('exit');
        if (this.isTincan()){
            this.trigger('endSession');
            jQuery.ajax({
                type: 'POST',
                url: jQuery("#SCORMContextPath").val()+"/services/sequencing/clearSession"
            });
            jQuery('#SCORMDataOutput').attr("src", "");
        } else {
            // SCORM 1.2, ignore auto doContinue on LMSFinish
            window.API.silenceFinish();
            jQuery('#SCORMDataOutput').attr("src", this.getNavigationRequestURL("exitAll"));
        }
    },

    doSuspend:function () {
        if (!this.isTincan()) {
            // SCORM 1.2, ignore auto doContinue on LMSFinish
            window.API.silenceFinish();
            jQuery('#SCORMDataOutput').attr("src", this.getNavigationRequestURL("suspendAll"));
            this.onSuspend = true;
        }
    },

    doChoice:function (id) {
        // SCORM 1.2, ignore auto doContinue on LMSFinish
        window.API.silenceFinish();
        if (!this.isTincan()) jQuery('#SCORMDataOutput').attr("src", this.getNavigationRequestURL("choice{" + id + "}"));
    },
    doJump:function (id) {
        // SCORM 1.2, ignore auto doContinue on LMSFinish
        window.API.silenceFinish();
        if (!this.isTincan()) jQuery('#SCORMDataOutput').attr("src", this.getNavigationRequestURL("jump{" + id + "}"));
    },

    selectNode:function (id) {
        this.jsTreeRef.deselect_all(); // drop selection from current
        this.jsTreeRef.select_node(jQuery("#" + id));
    },

    toggleLeftMenu:function () {
        if (this.$('#SCORMTogglePanel').is(':visible')) {
            this.$("#SCORMTogglePanel").hide("slide");
            this.$("#SCORMToggleButton").toggleClass("toggle-button-active");
        } else {
            this.$("#SCORMTogglePanel").show("slide");
            this.$("#SCORMToggleButton").toggleClass("toggle-button-active");
        }
    }
});