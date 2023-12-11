package com.Exito.runner;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/AddProduct.feature",
        glue = "com.Exito.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerExito {

}
