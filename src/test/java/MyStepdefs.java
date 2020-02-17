import cucumber.api.java.en.*;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    @Given("today is {string}")
    public void new_user(String url) {
        System.out.println("test When");
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        System.out.println("test When");
    }

    @Then(value = "I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, "testing");
    }
}