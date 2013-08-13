package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link LFPackageCommentLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       LFPackageCommentLocalService
 * @generated
 */
public class LFPackageCommentLocalServiceWrapper
    implements LFPackageCommentLocalService,
        ServiceWrapper<LFPackageCommentLocalService> {
    private LFPackageCommentLocalService _lfPackageCommentLocalService;

    public LFPackageCommentLocalServiceWrapper(
        LFPackageCommentLocalService lfPackageCommentLocalService) {
        _lfPackageCommentLocalService = lfPackageCommentLocalService;
    }

    /**
    * Adds the l f package comment to the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageComment the l f package comment
    * @return the l f package comment that was added
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageComment addLFPackageComment(
        com.arcusys.learn.persistence.liferay.model.LFPackageComment lfPackageComment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.addLFPackageComment(lfPackageComment);
    }

    /**
    * Creates a new l f package comment with the primary key. Does not add the l f package comment to the database.
    *
    * @param id the primary key for the new l f package comment
    * @return the new l f package comment
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageComment createLFPackageComment(
        long id) {
        return _lfPackageCommentLocalService.createLFPackageComment(id);
    }

    /**
    * Deletes the l f package comment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f package comment
    * @return the l f package comment that was removed
    * @throws PortalException if a l f package comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageComment deleteLFPackageComment(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.deleteLFPackageComment(id);
    }

    /**
    * Deletes the l f package comment from the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageComment the l f package comment
    * @return the l f package comment that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageComment deleteLFPackageComment(
        com.arcusys.learn.persistence.liferay.model.LFPackageComment lfPackageComment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.deleteLFPackageComment(lfPackageComment);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfPackageCommentLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageComment fetchLFPackageComment(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.fetchLFPackageComment(id);
    }

    /**
    * Returns the l f package comment with the primary key.
    *
    * @param id the primary key of the l f package comment
    * @return the l f package comment
    * @throws PortalException if a l f package comment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageComment getLFPackageComment(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.getLFPackageComment(id);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f package comments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f package comments
    * @param end the upper bound of the range of l f package comments (not inclusive)
    * @return the range of l f package comments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageComment> getLFPackageComments(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.getLFPackageComments(start, end);
    }

    /**
    * Returns the number of l f package comments.
    *
    * @return the number of l f package comments
    * @throws SystemException if a system exception occurred
    */
    public int getLFPackageCommentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.getLFPackageCommentsCount();
    }

    /**
    * Updates the l f package comment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfPackageComment the l f package comment
    * @return the l f package comment that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageComment updateLFPackageComment(
        com.arcusys.learn.persistence.liferay.model.LFPackageComment lfPackageComment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.updateLFPackageComment(lfPackageComment);
    }

    /**
    * Updates the l f package comment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfPackageComment the l f package comment
    * @param merge whether to merge the l f package comment with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the l f package comment that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPackageComment updateLFPackageComment(
        com.arcusys.learn.persistence.liferay.model.LFPackageComment lfPackageComment,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.updateLFPackageComment(lfPackageComment,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _lfPackageCommentLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfPackageCommentLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfPackageCommentLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPackageComment createLFPackageComment()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.createLFPackageComment();
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageComment> findBySocialPackageID(
        java.lang.Integer packageID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageCommentLocalService.findBySocialPackageID(packageID);
    }

    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfPackageCommentLocalService.removeAll();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public LFPackageCommentLocalService getWrappedLFPackageCommentLocalService() {
        return _lfPackageCommentLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedLFPackageCommentLocalService(
        LFPackageCommentLocalService lfPackageCommentLocalService) {
        _lfPackageCommentLocalService = lfPackageCommentLocalService;
    }

    public LFPackageCommentLocalService getWrappedService() {
        return _lfPackageCommentLocalService;
    }

    public void setWrappedService(
        LFPackageCommentLocalService lfPackageCommentLocalService) {
        _lfPackageCommentLocalService = lfPackageCommentLocalService;
    }
}
