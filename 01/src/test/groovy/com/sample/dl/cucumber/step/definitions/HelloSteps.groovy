package com.sample.dl.cucumber.step.definitions

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.testng.Assert


def insideAStepMethod() {
    println("Method inside A Step to test extended class")
}

//@Given("^I go to home page\$|^I navigate to home page\$")
@Given(/^I go to home page$|^I navigate to home page$/)
def i_go_to_home_page() {
    println("I go to home page")
}

@Given("I am at home page")
def i_am_at_home_page() {
    println("I am at home page")
}

@When("I type valid search")
def i_type_valid_search() {
//    Assert.fail()
//    println("I type valid search")
}

@Then("Home page is displayed properly")
def home_page_is_displayed_properly() {
    println("Home page is displayed properly")
}

@When("I am unable to type valid search")
def i_am_unable_to_type_valid_search() {
    println("I am unable to type valid search")
}

@When("I am not able to type valid search")
def i_am_not_able_to_type_valid_search() {
    println("I am not able to type valid search")
}

@Then("Home page is not displayed at the moment")
def home_page_is_not_displayed_at_the_moment() {
    println("Home page is not displayed at the moment")
}
