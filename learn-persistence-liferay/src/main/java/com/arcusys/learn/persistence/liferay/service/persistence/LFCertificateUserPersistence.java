package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFCertificateUser;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the l f certificate user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFCertificateUserPersistenceImpl
 * @see LFCertificateUserUtil
 * @generated
 */
public interface LFCertificateUserPersistence extends BasePersistence<LFCertificateUser> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFCertificateUserUtil} to access the l f certificate user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the l f certificate user in the entity cache if it is enabled.
    *
    * @param lfCertificateUser the l f certificate user
    */
    public void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFCertificateUser lfCertificateUser);

    /**
    * Caches the l f certificate users in the entity cache if it is enabled.
    *
    * @param lfCertificateUsers the l f certificate users
    */
    public void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> lfCertificateUsers);

    /**
    * Creates a new l f certificate user with the primary key. Does not add the l f certificate user to the database.
    *
    * @param id the primary key for the new l f certificate user
    * @return the new l f certificate user
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser create(
        long id);

    /**
    * Removes the l f certificate user with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f certificate user
    * @return the l f certificate user that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a l f certificate user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFCertificateUser lfCertificateUser,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f certificate user with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException} if it could not be found.
    *
    * @param id the primary key of the l f certificate user
    * @return the l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a l f certificate user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f certificate user with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f certificate user
    * @return the l f certificate user, or <code>null</code> if a l f certificate user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f certificate users where certificateID = &#63;.
    *
    * @param certificateID the certificate i d
    * @return the matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByCertificateID(
        java.lang.Integer certificateID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f certificate users where certificateID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param certificateID the certificate i d
    * @param start the lower bound of the range of l f certificate users
    * @param end the upper bound of the range of l f certificate users (not inclusive)
    * @return the range of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByCertificateID(
        java.lang.Integer certificateID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f certificate users where certificateID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param certificateID the certificate i d
    * @param start the lower bound of the range of l f certificate users
    * @param end the upper bound of the range of l f certificate users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByCertificateID(
        java.lang.Integer certificateID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f certificate user in the ordered set where certificateID = &#63;.
    *
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser findByCertificateID_First(
        java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f certificate user in the ordered set where certificateID = &#63;.
    *
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f certificate user, or <code>null</code> if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser fetchByCertificateID_First(
        java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f certificate user in the ordered set where certificateID = &#63;.
    *
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser findByCertificateID_Last(
        java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f certificate user in the ordered set where certificateID = &#63;.
    *
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f certificate user, or <code>null</code> if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser fetchByCertificateID_Last(
        java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f certificate users before and after the current l f certificate user in the ordered set where certificateID = &#63;.
    *
    * @param id the primary key of the current l f certificate user
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a l f certificate user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser[] findByCertificateID_PrevAndNext(
        long id, java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f certificate users where userID = &#63;.
    *
    * @param userID the user i d
    * @return the matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByUserID(
        java.lang.Integer userID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f certificate users where userID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userID the user i d
    * @param start the lower bound of the range of l f certificate users
    * @param end the upper bound of the range of l f certificate users (not inclusive)
    * @return the range of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByUserID(
        java.lang.Integer userID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f certificate users where userID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userID the user i d
    * @param start the lower bound of the range of l f certificate users
    * @param end the upper bound of the range of l f certificate users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByUserID(
        java.lang.Integer userID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f certificate user in the ordered set where userID = &#63;.
    *
    * @param userID the user i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser findByUserID_First(
        java.lang.Integer userID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f certificate user in the ordered set where userID = &#63;.
    *
    * @param userID the user i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f certificate user, or <code>null</code> if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser fetchByUserID_First(
        java.lang.Integer userID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f certificate user in the ordered set where userID = &#63;.
    *
    * @param userID the user i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser findByUserID_Last(
        java.lang.Integer userID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f certificate user in the ordered set where userID = &#63;.
    *
    * @param userID the user i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f certificate user, or <code>null</code> if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser fetchByUserID_Last(
        java.lang.Integer userID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f certificate users before and after the current l f certificate user in the ordered set where userID = &#63;.
    *
    * @param id the primary key of the current l f certificate user
    * @param userID the user i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a l f certificate user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser[] findByUserID_PrevAndNext(
        long id, java.lang.Integer userID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f certificate users where userID = &#63; and certificateID = &#63;.
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @return the matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByUserIDAndCertificateID(
        java.lang.Integer userID, java.lang.Integer certificateID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f certificate users where userID = &#63; and certificateID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @param start the lower bound of the range of l f certificate users
    * @param end the upper bound of the range of l f certificate users (not inclusive)
    * @return the range of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByUserIDAndCertificateID(
        java.lang.Integer userID, java.lang.Integer certificateID, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f certificate users where userID = &#63; and certificateID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @param start the lower bound of the range of l f certificate users
    * @param end the upper bound of the range of l f certificate users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findByUserIDAndCertificateID(
        java.lang.Integer userID, java.lang.Integer certificateID, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f certificate user in the ordered set where userID = &#63; and certificateID = &#63;.
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser findByUserIDAndCertificateID_First(
        java.lang.Integer userID, java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f certificate user in the ordered set where userID = &#63; and certificateID = &#63;.
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f certificate user, or <code>null</code> if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser fetchByUserIDAndCertificateID_First(
        java.lang.Integer userID, java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f certificate user in the ordered set where userID = &#63; and certificateID = &#63;.
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser findByUserIDAndCertificateID_Last(
        java.lang.Integer userID, java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f certificate user in the ordered set where userID = &#63; and certificateID = &#63;.
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f certificate user, or <code>null</code> if a matching l f certificate user could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser fetchByUserIDAndCertificateID_Last(
        java.lang.Integer userID, java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f certificate users before and after the current l f certificate user in the ordered set where userID = &#63; and certificateID = &#63;.
    *
    * @param id the primary key of the current l f certificate user
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f certificate user
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException if a l f certificate user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFCertificateUser[] findByUserIDAndCertificateID_PrevAndNext(
        long id, java.lang.Integer userID, java.lang.Integer certificateID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFCertificateUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f certificate users.
    *
    * @return the l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f certificate users.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f certificate users
    * @param end the upper bound of the range of l f certificate users (not inclusive)
    * @return the range of l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f certificate users.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f certificate users
    * @param end the upper bound of the range of l f certificate users (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateUser> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f certificate users where certificateID = &#63; from the database.
    *
    * @param certificateID the certificate i d
    * @throws SystemException if a system exception occurred
    */
    public void removeByCertificateID(java.lang.Integer certificateID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f certificate users where userID = &#63; from the database.
    *
    * @param userID the user i d
    * @throws SystemException if a system exception occurred
    */
    public void removeByUserID(java.lang.Integer userID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f certificate users where userID = &#63; and certificateID = &#63; from the database.
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @throws SystemException if a system exception occurred
    */
    public void removeByUserIDAndCertificateID(java.lang.Integer userID,
        java.lang.Integer certificateID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f certificate users from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f certificate users where certificateID = &#63;.
    *
    * @param certificateID the certificate i d
    * @return the number of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public int countByCertificateID(java.lang.Integer certificateID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f certificate users where userID = &#63;.
    *
    * @param userID the user i d
    * @return the number of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public int countByUserID(java.lang.Integer userID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f certificate users where userID = &#63; and certificateID = &#63;.
    *
    * @param userID the user i d
    * @param certificateID the certificate i d
    * @return the number of matching l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public int countByUserIDAndCertificateID(java.lang.Integer userID,
        java.lang.Integer certificateID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f certificate users.
    *
    * @return the number of l f certificate users
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
