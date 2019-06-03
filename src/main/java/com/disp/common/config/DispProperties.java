package com.disp.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * DispProperties配置
 */
@Configuration
@ConfigurationProperties(prefix = "disp")
public class DispProperties {

   // private ShiroProperties shiro = new ShiroProperties();

    private String timeFormat = "yyyy-MM-dd HH:mm:ss";

    private boolean openAopLog = true;

    //public ShiroProperties getShiro() {
    //    return shiro;
    //}
    //
    //public void setShiro(ShiroProperties shiro) {
    //    this.shiro = shiro;
    //}

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public boolean isOpenAopLog() {
        return openAopLog;
    }

    public void setOpenAopLog(boolean openAopLog) {
        this.openAopLog = openAopLog;
    }
}
