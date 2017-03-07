package com.example.au.steps;

import com.example.au.config.BrowserConfig;
import com.example.au.config.BrowserConfigProperties;
import com.example.au.config.TestConfig;
import com.example.au.page.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java8.En;
import org.assertj.core.api.Assertions;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = TestConfig.class)
public class LoginSteps extends FluentTest implements En {



    @Page
    private HomePage homePage;

    @Autowired
    private BrowserConfigProperties config;



   public LoginSteps(){


       When("^I go to google$", () -> {
           homePage.goToGoogleHomePage();

       });

       Then("^I should be in the google home page$", () -> {
           Assertions.assertThat(homePage.isInGoogle()).isTrue();
       });
   }

    @Before
    public void beforeTest() {
        this.initFluent(newWebDriver());
    }


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
