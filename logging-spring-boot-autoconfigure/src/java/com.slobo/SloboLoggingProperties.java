package com.slobo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.slobo")
public class SloboLoggingProperties {

    private String loggerName = "SloboAuditLogger";


    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getLoggerName() {

        return loggerName;
    }




}
