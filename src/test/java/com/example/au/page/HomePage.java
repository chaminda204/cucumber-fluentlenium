package com.example.au.page;


import com.example.au.common.ExampleFluentTest;
import com.example.au.config.TestConfig;
import org.assertj.core.api.Assertions;
import org.fluentlenium.core.FluentPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


//@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = TestConfig.class)
public class HomePage extends FluentPage{


    public void goToGoogle() {
        goTo(getBaseUrl());
        Assertions.assertThat(isInGoogle()).isTrue();

    }

    public boolean isInGoogle(){
        return window().title().contains("Google");
    }


}


