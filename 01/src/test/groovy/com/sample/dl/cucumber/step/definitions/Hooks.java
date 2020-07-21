package com.sample.dl.cucumber.step.definitions;


import com.sample.dl.configuration.AppConfiguration;
import com.sample.dl.report.ReportService;
import io.cucumber.java.*;
import org.springframework.test.context.ContextConfiguration;

import java.util.Arrays;

@ContextConfiguration(classes = AppConfiguration.class)
public class Hooks {
    @Before
    public void setUpScenario(){
        ReportService.resetService();
    }

    @Before("@smoketest")
    public void beforeFirst() {
        System.out.println("This will run only before the @smoketest Scenario");
    }

    @BeforeStep
    public void beforeStep (Scenario scenario) throws Exception {
        System.out.println("======>  This is before step  <======");
//        Assert.fail();
    }

    @AfterStep
    public void afterStep(Scenario scenario) throws Exception {
        System.out.println("======>  This is after step  <======");
        String  currentStepDescr = ReportService.currentStepDescription(scenario);
        String currentStatus = scenario.getStatus().toString();
        int stepIndex = ReportService.getStepIndex();
        String errorMsg = ReportService.getErrorMessage(scenario);
        ReportService.logStepResult(Arrays.asList(stepIndex, currentStatus, currentStepDescr, errorMsg));
    }

    @After(order = 0)
    public void afterScenario(Scenario scenario) {
//        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        String testName = scenario.getName();
//        scenario.embed(screenshot, "image/png");
//        scenario.write(testName);

//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        scenario.embed(screenshot , "image/png");

        System.out.println("------------------------------");
        System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
        System.out.println("------------------------------");
    }
}

