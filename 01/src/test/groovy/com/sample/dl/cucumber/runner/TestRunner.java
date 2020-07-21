package com.sample.dl.cucumber.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        tags = {"@UI,@steptest"}, // OR
//        tags = {"@UI","@API"},// AND
        tags = {"@steptest"},
        features = {"src/test/groovy/com/sample/dl/cucumber/features"},
//        monochrome = true, // Much more readable
        strict = false, // Mark build success if build contains failed cases
        plugin = {
                "json:target/result.json"
        },
        glue = "com.sample.dl.cucumber.step.definitions"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

// How to run
// mvn test -Dcucumber.filter.tags="@smoke and @fast"
//# Linux / OS X:
//        CUCUMBER_FILTER_TAGS="@smoke and @fast" mvn test
//
//# Windows:
//        set CUCUMBER_FILTER_TAGS="@smoke and @fast"
//        mvn test

// Ex: (@smoke or @ui) and (not @slow)
//
//java -cp "path/to/each/jar:path/to/compiled/.class/files" io.cucumber.core.cli.Main /path/to/your/feature/files --glue hellocucumber
//
//
//mvn exec:java                                         \
//        -Dexec.classpathScope=test                    \
//        -Dexec.mainClass=io.cucumber.core.cli.Main    \
//        -Dexec.args="/path/to/your/feature/files --glue hellocucumber"

// Filter tags
// mvn test -Dcucumber.filter.tags="@smoke"