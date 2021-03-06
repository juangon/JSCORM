package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LFTincanLrsContextLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsContextLocalService
 * @generated
 */
public class LFTincanLrsContextLocalServiceWrapper
    implements LFTincanLrsContextLocalService,
        ServiceWrapper<LFTincanLrsContextLocalService> {
    private LFTincanLrsContextLocalService _lfTincanLrsContextLocalService;

    public LFTincanLrsContextLocalServiceWrapper(
        LFTincanLrsContextLocalService lfTincanLrsContextLocalService) {
        _lfTincanLrsContextLocalService = lfTincanLrsContextLocalService;
    }

    /**
    * Adds the l f tincan lrs context to the database. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsContext the l f tincan lrs context
    * @return the l f tincan lrs context that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext addLFTincanLrsContext(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext lfTincanLrsContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.addLFTincanLrsContext(lfTincanLrsContext);
    }

    /**
    * Creates a new l f tincan lrs context with the primary key. Does not add the l f tincan lrs context to the database.
    *
    * @param id the primary key for the new l f tincan lrs context
    * @return the new l f tincan lrs context
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext createLFTincanLrsContext(
        long id) {
        return _lfTincanLrsContextLocalService.createLFTincanLrsContext(id);
    }

    /**
    * Deletes the l f tincan lrs context with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan lrs context
    * @return the l f tincan lrs context that was removed
    * @throws PortalException if a l f tincan lrs context with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext deleteLFTincanLrsContext(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.deleteLFTincanLrsContext(id);
    }

    /**
    * Deletes the l f tincan lrs context from the database. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsContext the l f tincan lrs context
    * @return the l f tincan lrs context that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext deleteLFTincanLrsContext(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext lfTincanLrsContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.deleteLFTincanLrsContext(lfTincanLrsContext);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfTincanLrsContextLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsContextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsContextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext fetchLFTincanLrsContext(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.fetchLFTincanLrsContext(id);
    }

    /**
    * Returns the l f tincan lrs context with the primary key.
    *
    * @param id the primary key of the l f tincan lrs context
    * @return the l f tincan lrs context
    * @throws PortalException if a l f tincan lrs context with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext getLFTincanLrsContext(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.getLFTincanLrsContext(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f tincan lrs contexts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsContextModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs contexts
    * @param end the upper bound of the range of l f tincan lrs contexts (not inclusive)
    * @return the range of l f tincan lrs contexts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext> getLFTincanLrsContexts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.getLFTincanLrsContexts(start, end);
    }

    /**
    * Returns the number of l f tincan lrs contexts.
    *
    * @return the number of l f tincan lrs contexts
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLFTincanLrsContextsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.getLFTincanLrsContextsCount();
    }

    /**
    * Updates the l f tincan lrs context in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsContext the l f tincan lrs context
    * @return the l f tincan lrs context that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext updateLFTincanLrsContext(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext lfTincanLrsContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.updateLFTincanLrsContext(lfTincanLrsContext);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _lfTincanLrsContextLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfTincanLrsContextLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfTincanLrsContextLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfTincanLrsContextLocalService.removeAll();
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsContext createLFTincanLrsContext()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsContextLocalService.createLFTincanLrsContext();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LFTincanLrsContextLocalService getWrappedLFTincanLrsContextLocalService() {
        return _lfTincanLrsContextLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLFTincanLrsContextLocalService(
        LFTincanLrsContextLocalService lfTincanLrsContextLocalService) {
        _lfTincanLrsContextLocalService = lfTincanLrsContextLocalService;
    }

    @Override
    public LFTincanLrsContextLocalService getWrappedService() {
        return _lfTincanLrsContextLocalService;
    }

    @Override
    public void setWrappedService(
        LFTincanLrsContextLocalService lfTincanLrsContextLocalService) {
        _lfTincanLrsContextLocalService = lfTincanLrsContextLocalService;
    }
}
