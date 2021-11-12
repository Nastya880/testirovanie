package main.test.ru.miet.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/test/ru/miet/testing/features",
        glue = "main.test.ru.miet.testing",
        tags = "@calculator",
        snippets = SnippetType.CAMELCASE
)
public class FeatureTest {
}
