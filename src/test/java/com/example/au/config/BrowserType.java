package com.example.au.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.DesiredCapabilities.chrome;

public enum BrowserType {

    CHROME {
        @Override
        public WebDriver getWebDriver() {
            System.setProperty("webdriver.chrome.driver", "/usr/local/opt/software/chromedriver");
            return new ChromeDriver();
        }

        @Override
        protected DesiredCapabilities getBrowserCapabilities() {
            return chrome();
        }
    };

    protected abstract WebDriver getWebDriver();

    protected abstract DesiredCapabilities getBrowserCapabilities();

    public WebDriver getRemoteWebDriver(String hubLocation) {
        try {
            return new Augmenter().augment(new RemoteWebDriver(new URL(hubLocation), getBrowserCapabilities()));
        } catch (MalformedURLException e) {
            throw new TestConfigException("Invalid hub location: " + hubLocation, e);
        }
    }


}
