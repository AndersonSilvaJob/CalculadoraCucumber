package com.tdd.calculadora;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
	format = {"pretty","html:target/cucumber"},
	//aqui definimos onde ficará as features
	features = "src/tests/resource"
)
public class CalcRunner {

}
