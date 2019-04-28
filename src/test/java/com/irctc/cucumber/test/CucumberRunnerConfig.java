package com.irctc.cucumber.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/src/main/resources/features/irctcLogin.feature"
)
public class CucumberRunnerConfig {

}
