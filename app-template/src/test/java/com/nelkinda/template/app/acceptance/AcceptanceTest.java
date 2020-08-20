package com.nelkinda.template.app.acceptance; // TODO change

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features",
        tags = "not(@wip) and not(@future)"
)
@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.platform.engine.Cucumber
public class AcceptanceTest {
}
