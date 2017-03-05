package com.example.au.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BrowserConfigProperties {

    @Value("${selenium.browser.type ?: CHROME}")
    private BrowserType browserType;

    @Value("${selenium.hub.enabled}")
    private Boolean useHub;

    @Value("${selenium.hub.location}")
    private String hubLocation;

    @Value("${selenium.get.url}")
    private String pageUrl;

    public BrowserConfig getBrowserConfig() {
        return new BrowserConfig(browserType, useHub, hubLocation);
    }

    public String getPageUrl() {
        return pageUrl;
    }
}