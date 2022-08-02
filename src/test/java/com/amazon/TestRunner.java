package com.amazon;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src/main/java/com/amazon/features",
        //path of step definition file
        glue = "src/main/java/com/amazon/steps",
        tags = "@amazon"
)
public class TestRunner {
}
