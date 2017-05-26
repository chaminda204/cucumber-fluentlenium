package com.example.au.common;


import com.example.au.config.BrowserConfigProperties;
import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseTestSteps extends FluentCucumberTest {

    @Autowired
    private BrowserConfigProperties config;

    @Autowired
    private WebDriver webDriver;


    @Override
    public WebDriver newWebDriver() {
        return webDriver;
    }

    @Override
    public String getBaseUrl() {
        return config.getPageUrl();
    }


}
