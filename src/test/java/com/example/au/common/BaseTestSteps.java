package com.example.au.common;


import com.example.au.config.BrowserConfig;
import com.example.au.config.BrowserConfigProperties;
import com.example.au.config.TestConfig;
import cucumber.api.java.Before;
import cucumber.api.java8.En;
import org.fluentlenium.adapter.junit.FluentTest;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = TestConfig.class)
public class BaseTestSteps extends FluentTest implements En{


    @Autowired
    private BrowserConfigProperties config;


    @Override
    public WebDriver newWebDriver() {
        BrowserConfig browserConfig = getBrowserConfig();
        return browserConfig.resolveDriver(browserConfig);
    }

    @Override
    public String getBaseUrl() {
        return config.getPageUrl();
    }

    private BrowserConfig getBrowserConfig() {
        return config.getBrowserConfig();
    }



}
