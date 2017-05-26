package com.example.au.config;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebDriverService {

    @Autowired
    private BrowserConfigProperties config;

    public WebDriver newWebDriver() {
        return config.getBrowserConfig().resolveDriver(config.getBrowserConfig());
    }

}