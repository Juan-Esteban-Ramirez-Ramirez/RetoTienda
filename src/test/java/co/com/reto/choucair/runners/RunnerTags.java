package co.com.reto.choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features ="src/test/resources/features/automationChoucair.feature",
        tags = "@HU",
        glue = "co.com.reto.choucair.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}