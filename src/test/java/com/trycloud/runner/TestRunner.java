package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                        glue = "com/trycloud/test_Steps",
                        plugin = {"html:target/Reports/cucumber.html",
                                "rerun:target/rerun.txt",
                                "me.jvt.cucumber.report.PrettyReports:target"
                                },
                        dryRun = false
 //                       , tags = "@us_01"
)
public class TestRunner {
}