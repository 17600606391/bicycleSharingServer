package org.bicyclesharing.dao;

import org.bicyclesharing.entities.UserFeedback;

/**
 * Created by HuiJa on 2017/8/4.
 */
public interface UserFeedbackDao {
    /**
     * 1.添加用户反馈
     * @param userFeedback
     * @return
     */
    boolean addUserFeedback(UserFeedback userFeedback);

    /**
     * 2.删除用户反馈
     * @param userFeedbackId
     * @return
     */
    boolean deleteUserFeedbackById(Integer userFeedbackId);

    /**
     * 3.修改用户反馈
     * @param userFeedback
     * @return
     */
    boolean updateUserFeedback(UserFeedback userFeedback);

    /**
     * 4.查询用户反馈
     * @param userFeedbackId
     * @return
     */
    UserFeedback selectUserFeedbackById(Integer userFeedbackId);
}
