package com.github.svettwer.bowling;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class BowlingStepDefinitions {

    private BowlingGame bowlingGame;

    @Given("I start a new game")
    public void iStartANewGame() {
        bowlingGame  = new BowlingGame();
    }

    @When("I roll {int} all the time")
    public void iRollAllTheTime(final int scorePerRoll) {
        for (int i = 0; i < 20; i++){
            bowlingGame.roll(scorePerRoll);
        }
    }

    @Then("the score should be {int}")
    public void theScoreShouldBe(final int score) {
        assertEquals(score, bowlingGame.score());
    }
}
