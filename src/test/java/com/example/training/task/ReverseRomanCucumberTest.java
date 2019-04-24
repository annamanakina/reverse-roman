package com.example.training.task;

import com.example.training.task.roman.ReverseRomanTask;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/reverseroman.features",
        //reverseroman.features
        //C:\Users\Hanna_Manakina\IdeaProjects\CucumberTestProject\src\test\resources\reverseroman.features
        glue = "com.example.training.task" //todo clarify it src/java/
        //tags = "@all",
        //dryRun = false,
        //strict = false,
       // snippets = SnippetType.UNDERSCORE
//        name = "^Успешное|Успешная.*"
)

public class ReverseRomanCucumberTest {
}
