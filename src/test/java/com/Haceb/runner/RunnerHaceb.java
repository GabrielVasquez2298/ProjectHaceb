package com.Haceb.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/RegisterInToHaceb.feature",
        glue = "com.Haceb.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerHaceb {

}
