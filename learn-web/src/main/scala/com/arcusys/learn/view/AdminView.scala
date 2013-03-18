package com.arcusys.learn.view

import com.arcusys.scala.scalatra.mustache.MustacheSupport
import javax.portlet._
import org.scalatra.ScalatraFilter
import com.arcusys.learn.view.liferay.LiferayHelpers
import java.io.FileNotFoundException

class AdminView extends GenericPortlet with ScalatraFilter with MustacheSupport with i18nSupport with ConfigurableView {
  override def destroy() {}

  override def doView(request: RenderRequest, response: RenderResponse) {
    val userUID = request.getRemoteUser
    val themeDisplay = LiferayHelpers.getThemeDisplay(request)
    val userID = themeDisplay.getUser.getUserId
    val courseID = themeDisplay.getScopeGroupId //theme.getLayout.getGroupId
    val out = response.getWriter
    val language = LiferayHelpers.getLanguage(request)
    if (userManagement.isAdmin(userID, courseID)) {
      val groupID = themeDisplay.getScopeGroupId
      //val pagePlid = theme.getLayout.getPlid
      // ThemeDisplay themeDisplay = (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);
      // PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();
      // String portletId = portletDisplay.getId();
      // val groups = GroupLocalServiceUtil.search(PortalUtil.getCompanyId(request), null, null,
      //   null, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

      //val pageID = theme.getLayout.getPrimaryKey
      //val portletID = theme.getPortletDisplay.getId
      val translations = getTranslation("admin", language)
      val data = Map("contextPath" -> request.getContextPath, "userID" -> userUID, "groupID" -> groupID, "isAdmin" -> true,
        "language" -> language, "courseID" -> courseID, "isPortlet" -> true) ++ translations
      out.println(generateResponse(data, "scorm_admin.html"))
    }
    else {
      val translations = getTranslation("error", language)
      val data = Map("contextPath" -> request.getContextPath, "language" -> language) ++ translations
      out.println(generateResponse(data, "scorm_nopermissions.html"))
    }
  }

  def generateResponse(data: Map[String, Any], templateName: String) = {
    mustache(data, templateName)
  }

  private def getTranslation(view: String, language: String): Map[String, String] = {
    try {
      getTranslation("/i18n/" + view + "_" + language)
    } catch {
      case e: FileNotFoundException => getTranslation("/i18n/" + view + "_en")
      case _ => Map[String, String]()
    }
  }
}