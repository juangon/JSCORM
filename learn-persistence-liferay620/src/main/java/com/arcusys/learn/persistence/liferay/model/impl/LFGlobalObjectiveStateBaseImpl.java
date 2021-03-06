package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFGlobalObjectiveState;
import com.arcusys.learn.persistence.liferay.service.LFGlobalObjectiveStateLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFGlobalObjectiveState service. Represents a row in the &quot;Learn_LFGlobalObjectiveState&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFGlobalObjectiveStateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFGlobalObjectiveStateImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFGlobalObjectiveState
 * @generated
 */
public abstract class LFGlobalObjectiveStateBaseImpl
    extends LFGlobalObjectiveStateModelImpl implements LFGlobalObjectiveState {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f global objective state model instance should use the {@link LFGlobalObjectiveState} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFGlobalObjectiveStateLocalServiceUtil.addLFGlobalObjectiveState(this);
        } else {
            LFGlobalObjectiveStateLocalServiceUtil.updateLFGlobalObjectiveState(this);
        }
    }
}
