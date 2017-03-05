package com.example.au.steps;

import com.example.au.config.TestConfig;
import com.example.au.page.HomePage;
import cucumber.api.java8.En;
import org.assertj.core.api.Assertions;
import org.fluentlenium.adapter.FluentAdapter;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = TestConfig.class)
public class LoginSteps extends FluentTest implements En {


    @Page
    private HomePage homePage;

//    @cucumber.api.java.Before
//    public void beforeTest() {
//        homePage = newInstance(HomePage.class);
//    }

   public LoginSteps(){


       When("^I go to google$", () -> {
           homePage.goToGoogle();

       });

       Then("^I should be in the google home page$", () -> {
           Assertions.assertThat(homePage.isInGoogle()).isTrue();
       });
   }
}
