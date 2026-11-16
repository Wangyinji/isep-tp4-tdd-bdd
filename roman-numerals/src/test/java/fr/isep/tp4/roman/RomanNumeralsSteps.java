package fr.isep.tp4.roman;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsSteps {
    private int number;
    private String result;

    @Given("the integer is {int}")
    public void theIntegerIs(int value) {
        number = value;
    }

    @When("I convert it to a Roman numeral")
    public void convertToRomanNumeral() {
        result = RomanNumerals.convert(number);
    }

    @Then("the Roman numeral should be {string}")
    public void theRomanNumeralShouldBe(String expected) {
        assertEquals(expected, result);
    }
}
