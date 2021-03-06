package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment;
import com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachmentModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LFTincanLrsAttachment service. Represents a row in the &quot;Learn_LFTincanLrsAttachment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFTincanLrsAttachmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsAttachmentImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment
 * @see com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachmentModel
 * @generated
 */
public class LFTincanLrsAttachmentModelImpl extends BaseModelImpl<LFTincanLrsAttachment>
    implements LFTincanLrsAttachmentModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f tincan lrs attachment model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment} interface instead.
     */
    public static final String TABLE_NAME = "Learn_LFTincanLrsAttachment";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "parentID", Types.INTEGER },
            { "usageType", Types.CLOB },
            { "display", Types.CLOB },
            { "description", Types.CLOB },
            { "contentType", Types.CLOB },
            { "length", Types.INTEGER },
            { "sha2", Types.CLOB },
            { "fileUrl", Types.CLOB }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFTincanLrsAttachment (id_ LONG not null primary key,parentID INTEGER null,usageType TEXT null,display TEXT null,description TEXT null,contentType TEXT null,length INTEGER null,sha2 TEXT null,fileUrl TEXT null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFTincanLrsAttachment";
    public static final String ORDER_BY_JPQL = " ORDER BY lfTincanLrsAttachment.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Learn_LFTincanLrsAttachment.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment"),
            true);
    public static long PARENTID_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment"));
    private static ClassLoader _classLoader = LFTincanLrsAttachment.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LFTincanLrsAttachment.class
        };
    private long _id;
    private Integer _parentID;
    private Integer _originalParentID;
    private boolean _setOriginalParentID;
    private String _usageType;
    private String _display;
    private String _description;
    private String _contentType;
    private Integer _length;
    private String _sha2;
    private String _fileUrl;
    private long _columnBitmask;
    private LFTincanLrsAttachment _escapedModel;

    public LFTincanLrsAttachmentModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return LFTincanLrsAttachment.class;
    }

    @Override
    public String getModelClassName() {
        return LFTincanLrsAttachment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("parentID", getParentID());
        attributes.put("usageType", getUsageType());
        attributes.put("display", getDisplay());
        attributes.put("description", getDescription());
        attributes.put("contentType", getContentType());
        attributes.put("length", getLength());
        attributes.put("sha2", getSha2());
        attributes.put("fileUrl", getFileUrl());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer parentID = (Integer) attributes.get("parentID");

        if (parentID != null) {
            setParentID(parentID);
        }

        String usageType = (String) attributes.get("usageType");

        if (usageType != null) {
            setUsageType(usageType);
        }

        String display = (String) attributes.get("display");

        if (display != null) {
            setDisplay(display);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String contentType = (String) attributes.get("contentType");

        if (contentType != null) {
            setContentType(contentType);
        }

        Integer length = (Integer) attributes.get("length");

        if (length != null) {
            setLength(length);
        }

        String sha2 = (String) attributes.get("sha2");

        if (sha2 != null) {
            setSha2(sha2);
        }

        String fileUrl = (String) attributes.get("fileUrl");

        if (fileUrl != null) {
            setFileUrl(fileUrl);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @Override
    public Integer getParentID() {
        return _parentID;
    }

    @Override
    public void setParentID(Integer parentID) {
        _columnBitmask |= PARENTID_COLUMN_BITMASK;

        if (!_setOriginalParentID) {
            _setOriginalParentID = true;

            _originalParentID = _parentID;
        }

        _parentID = parentID;
    }

    public Integer getOriginalParentID() {
        return _originalParentID;
    }

    @Override
    public String getUsageType() {
        return _usageType;
    }

    @Override
    public void setUsageType(String usageType) {
        _usageType = usageType;
    }

    @Override
    public String getDisplay() {
        return _display;
    }

    @Override
    public void setDisplay(String display) {
        _display = display;
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public String getContentType() {
        return _contentType;
    }

    @Override
    public void setContentType(String contentType) {
        _contentType = contentType;
    }

    @Override
    public Integer getLength() {
        return _length;
    }

    @Override
    public void setLength(Integer length) {
        _length = length;
    }

    @Override
    public String getSha2() {
        return _sha2;
    }

    @Override
    public void setSha2(String sha2) {
        _sha2 = sha2;
    }

    @Override
    public String getFileUrl() {
        return _fileUrl;
    }

    @Override
    public void setFileUrl(String fileUrl) {
        _fileUrl = fileUrl;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFTincanLrsAttachment.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFTincanLrsAttachment toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LFTincanLrsAttachment) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LFTincanLrsAttachmentImpl lfTincanLrsAttachmentImpl = new LFTincanLrsAttachmentImpl();

        lfTincanLrsAttachmentImpl.setId(getId());
        lfTincanLrsAttachmentImpl.setParentID(getParentID());
        lfTincanLrsAttachmentImpl.setUsageType(getUsageType());
        lfTincanLrsAttachmentImpl.setDisplay(getDisplay());
        lfTincanLrsAttachmentImpl.setDescription(getDescription());
        lfTincanLrsAttachmentImpl.setContentType(getContentType());
        lfTincanLrsAttachmentImpl.setLength(getLength());
        lfTincanLrsAttachmentImpl.setSha2(getSha2());
        lfTincanLrsAttachmentImpl.setFileUrl(getFileUrl());

        lfTincanLrsAttachmentImpl.resetOriginalValues();

        return lfTincanLrsAttachmentImpl;
    }

    @Override
    public int compareTo(LFTincanLrsAttachment lfTincanLrsAttachment) {
        long primaryKey = lfTincanLrsAttachment.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFTincanLrsAttachment)) {
            return false;
        }

        LFTincanLrsAttachment lfTincanLrsAttachment = (LFTincanLrsAttachment) obj;

        long primaryKey = lfTincanLrsAttachment.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFTincanLrsAttachmentModelImpl lfTincanLrsAttachmentModelImpl = this;

        lfTincanLrsAttachmentModelImpl._originalParentID = lfTincanLrsAttachmentModelImpl._parentID;

        lfTincanLrsAttachmentModelImpl._setOriginalParentID = false;

        lfTincanLrsAttachmentModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFTincanLrsAttachment> toCacheModel() {
        LFTincanLrsAttachmentCacheModel lfTincanLrsAttachmentCacheModel = new LFTincanLrsAttachmentCacheModel();

        lfTincanLrsAttachmentCacheModel.id = getId();

        lfTincanLrsAttachmentCacheModel.parentID = getParentID();

        lfTincanLrsAttachmentCacheModel.usageType = getUsageType();

        String usageType = lfTincanLrsAttachmentCacheModel.usageType;

        if ((usageType != null) && (usageType.length() == 0)) {
            lfTincanLrsAttachmentCacheModel.usageType = null;
        }

        lfTincanLrsAttachmentCacheModel.display = getDisplay();

        String display = lfTincanLrsAttachmentCacheModel.display;

        if ((display != null) && (display.length() == 0)) {
            lfTincanLrsAttachmentCacheModel.display = null;
        }

        lfTincanLrsAttachmentCacheModel.description = getDescription();

        String description = lfTincanLrsAttachmentCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            lfTincanLrsAttachmentCacheModel.description = null;
        }

        lfTincanLrsAttachmentCacheModel.contentType = getContentType();

        String contentType = lfTincanLrsAttachmentCacheModel.contentType;

        if ((contentType != null) && (contentType.length() == 0)) {
            lfTincanLrsAttachmentCacheModel.contentType = null;
        }

        lfTincanLrsAttachmentCacheModel.length = getLength();

        lfTincanLrsAttachmentCacheModel.sha2 = getSha2();

        String sha2 = lfTincanLrsAttachmentCacheModel.sha2;

        if ((sha2 != null) && (sha2.length() == 0)) {
            lfTincanLrsAttachmentCacheModel.sha2 = null;
        }

        lfTincanLrsAttachmentCacheModel.fileUrl = getFileUrl();

        String fileUrl = lfTincanLrsAttachmentCacheModel.fileUrl;

        if ((fileUrl != null) && (fileUrl.length() == 0)) {
            lfTincanLrsAttachmentCacheModel.fileUrl = null;
        }

        return lfTincanLrsAttachmentCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", parentID=");
        sb.append(getParentID());
        sb.append(", usageType=");
        sb.append(getUsageType());
        sb.append(", display=");
        sb.append(getDisplay());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", contentType=");
        sb.append(getContentType());
        sb.append(", length=");
        sb.append(getLength());
        sb.append(", sha2=");
        sb.append(getSha2());
        sb.append(", fileUrl=");
        sb.append(getFileUrl());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append(
            "com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentID</column-name><column-value><![CDATA[");
        sb.append(getParentID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>usageType</column-name><column-value><![CDATA[");
        sb.append(getUsageType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>display</column-name><column-value><![CDATA[");
        sb.append(getDisplay());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>contentType</column-name><column-value><![CDATA[");
        sb.append(getContentType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>length</column-name><column-value><![CDATA[");
        sb.append(getLength());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sha2</column-name><column-value><![CDATA[");
        sb.append(getSha2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileUrl</column-name><column-value><![CDATA[");
        sb.append(getFileUrl());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
