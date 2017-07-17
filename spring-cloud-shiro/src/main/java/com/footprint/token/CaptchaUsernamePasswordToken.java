package com.footprint.token;

import org.apache.shiro.authc.UsernamePasswordToken;

public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {

    /**
     *
     */
    private static final long serialVersionUID = -1121626710103146737L;

    // 验证码字符串
    private String captcha;

    public CaptchaUsernamePasswordToken(String username, String password, boolean rememberMe, String captcha) {
        super(username, password, rememberMe);
        this.captcha = captcha;
    }

    public CaptchaUsernamePasswordToken(String username, String password) {
        super(username, password, false);
        this.captcha = null;
    }

    public CaptchaUsernamePasswordToken(String username, String password, boolean rememberMe, String host, String captcha) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
    }


    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
