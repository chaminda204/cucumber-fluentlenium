package com.example.au;


import com.example.au.config.TestConfig;
import cucumber.api.java8.En;
import org.fluentlenium.adapter.junit.FluentTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = TestConfig.class)
public class BaseTestSteps extends FluentTest implements En{



}
