package com.sample.dl.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:ui-endpoints.properties")
public class UIConfiguration {

    @Value("${ui.manage.uri:}")
    private String appEndpoint;

    public String getEndpoint() {
        return appEndpoint;
    }

    public void setEndpoint(String endpoint) {
        this.appEndpoint = appEndpoint;
    }
}
