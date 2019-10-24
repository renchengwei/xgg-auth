package com.xgg.auth.oauth2.captcha;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @Author: renchengwei
 * @Date: 2019-08-11
 * @Description: TODO
 */
public interface CaptchaRepository {
    /**
     * 保存验证码
     * @param request
     * @param code
     * @param captchaType
     */
    void save(ServletWebRequest request, CaptchaVO code, CaptchaTypeEnum captchaType);

    /**
     * 获取验证码
     * @param request
     * @param captchaType
     * @return
     */
    CaptchaVO get(ServletWebRequest request, CaptchaTypeEnum captchaType);

    /**
     * 移除验证码
     * @param request
     * @param captchaType
     */
    void remove(ServletWebRequest request, CaptchaTypeEnum captchaType);
}
