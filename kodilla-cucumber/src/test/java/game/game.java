package game;

import io.cucumber.java8.En;
import org.junit.Assert;

public class game implements En {
    private int number;
    private String answer;
    public game() {
        Given("number is {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            this.number = int1;
        });
        When("I ask whether it divided by three or five", () -> {
            // Write code here that turns the phrase above into concrete actions
            GameSolution gameSolution = new GameSolution();
            this.answer = gameSolution.checkIfDivided(this.number);
        });
        Then("I should get {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

}}


