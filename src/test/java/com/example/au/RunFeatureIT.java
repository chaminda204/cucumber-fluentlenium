package com.example.au;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.fluentlenium.adapter.junit.FluentTest;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = {"src/test/resources"})

public class RunFeatureIT{


}
