package java.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // tener en cuenta que debe cambiar el path del feature
        features = {"src/test/resources/features/intranet/login.feature"},
        glue = {"StepDefinition/intranet"},
        tags = "@flujoregistro"
)
public class runner
{

}
