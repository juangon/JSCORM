package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LFSequencingTracking service. Represents a row in the &quot;Learn_LFSequencingTracking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFSequencingTrackingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFSequencingTrackingImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFSequencingTracking
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFSequencingTrackingImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFSequencingTrackingModelImpl
 * @generated
 */
public interface LFSequencingTrackingModel extends BaseModel<LFSequencingTracking> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f sequencing tracking model instance should use the {@link LFSequencingTracking} interface instead.
     */

    /**
     * Returns the primary key of this l f sequencing tracking.
     *
     * @return the primary key of this l f sequencing tracking
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this l f sequencing tracking.
     *
     * @param primaryKey the primary key of this l f sequencing tracking
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this l f sequencing tracking.
     *
     * @return the ID of this l f sequencing tracking
     */
    public long getId();

    /**
     * Sets the ID of this l f sequencing tracking.
     *
     * @param id the ID of this l f sequencing tracking
     */
    public void setId(long id);

    /**
     * Returns the sequencing i d of this l f sequencing tracking.
     *
     * @return the sequencing i d of this l f sequencing tracking
     */
    public Integer getSequencingID();

    /**
     * Sets the sequencing i d of this l f sequencing tracking.
     *
     * @param sequencingID the sequencing i d of this l f sequencing tracking
     */
    public void setSequencingID(Integer sequencingID);

    /**
     * Returns the completion set by content of this l f sequencing tracking.
     *
     * @return the completion set by content of this l f sequencing tracking
     */
    public boolean getCompletionSetByContent();

    /**
     * Returns <code>true</code> if this l f sequencing tracking is completion set by content.
     *
     * @return <code>true</code> if this l f sequencing tracking is completion set by content; <code>false</code> otherwise
     */
    public boolean isCompletionSetByContent();

    /**
     * Sets whether this l f sequencing tracking is completion set by content.
     *
     * @param completionSetByContent the completion set by content of this l f sequencing tracking
     */
    public void setCompletionSetByContent(boolean completionSetByContent);

    /**
     * Returns the objective set by content of this l f sequencing tracking.
     *
     * @return the objective set by content of this l f sequencing tracking
     */
    public boolean getObjectiveSetByContent();

    /**
     * Returns <code>true</code> if this l f sequencing tracking is objective set by content.
     *
     * @return <code>true</code> if this l f sequencing tracking is objective set by content; <code>false</code> otherwise
     */
    public boolean isObjectiveSetByContent();

    /**
     * Sets whether this l f sequencing tracking is objective set by content.
     *
     * @param objectiveSetByContent the objective set by content of this l f sequencing tracking
     */
    public void setObjectiveSetByContent(boolean objectiveSetByContent);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(LFSequencingTracking lfSequencingTracking);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFSequencingTracking> toCacheModel();

    @Override
    public LFSequencingTracking toEscapedModel();

    @Override
    public LFSequencingTracking toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}