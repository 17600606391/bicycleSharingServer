package org.bicyclesharing.web.API;

import org.bicyclesharing.entities.User;
import org.bicyclesharing.entities.UserFeedback;
import org.bicyclesharing.service.UserFeedbackService;
import org.bicyclesharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by HuiJa on 2017/8/7.
 */
@Controller
public class UserFeedbackApi {
    @Autowired
    private UserFeedbackService userFeedbackService;
    @Autowired
    private UserService userService;

    /**
     * 1.插入一条用户反馈
     */
    @RequestMapping(value = "api-userFeedback-add/{feedbackTitle}/{feedbackContent}/{bicycleId}/{userName}")
    @ResponseBody
    public String addUserfeedback(@PathVariable("userName") String userName, @PathVariable("bicycleId") Integer bicycleId,
                                  @PathVariable("feedbackTitle") String feedbackTitle, @PathVariable("feedbackContent") String feedbackContent)
            throws UnsupportedEncodingException {
        if (userName == null || bicycleId == null || feedbackTitle == null || feedbackContent == null) {
            return "0";
        } else {
            User user = userService.getUserByName(userName);
            //中文参数乱码
            byte title[];
            byte content[];
            title = feedbackTitle.getBytes("ISO-8859-1");
            content = feedbackContent.getBytes("ISO-8859-1");
            feedbackTitle=new String(title,"UTF-8");
            feedbackContent=new String(content,"UTF-8");
            UserFeedback userFeedback = new UserFeedback(feedbackTitle, feedbackContent, user.getUserId(), bicycleId, new Date(), 0);
            if (userFeedback == null) {
                return "0";
            } else {
                boolean addUserFeedback = userFeedbackService.addFeedback(userFeedback);
                if (addUserFeedback) {
                    return "1";
                } else {
                    return "0";
                }
            }
        }
    }
}
