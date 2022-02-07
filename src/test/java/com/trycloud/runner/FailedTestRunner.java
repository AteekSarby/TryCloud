package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
                    glue = "com/trycloud/test_Steps",
                    features = "@target/rerun.txt"
//                   ,  tags = "@ui"
                )
public class FailedTestRunner {
}
