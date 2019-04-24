package com.example.training.task;

import com.example.training.task.roman.ReverseRomanTask;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ReverseRomanCucumber {
    ReverseRomanTask reverseRomanTask = null;
    int result;

    @Given("^Create object of ReverseRomanTask$")
    public void createObjectOfReverseRomanTask() {
        reverseRomanTask = new ReverseRomanTask();
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    //todo regex?
    //(.+) параметр
    //{roman_number}
    /*@When("^We put string as \"([^\"]*)\" $")
    public void wePutStringAs(String number) {
        System.out.println("number: " + number);
        result = reverseRomanTask.convertRomanToArabic(number);
        assertEquals(result, 1956);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }*/

    /*You can implement missing steps with the snippets below:

@When("^We put string as \"([^\"]*)\"$")
public void we_put_string_as(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
*/

    @When("^We put string as \"([^\"]*)\"$")
    public void wePutStringAs(String number) throws Throwable {
        System.out.println("number: " + number);
        result = reverseRomanTask.convertRomanToArabic(number);
        System.out.println("result: " + result);
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();
    }

    @Then("^We get the determined value as \"([^\"]*)\"$")
    public void weGetTheDeterminedValueAs(int arabicNumber) throws Throwable {
        assertEquals(result, arabicNumber);
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }



    /*@When("^We put string as \"([^\"]*)\"$")
    public void wePutStringAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
