package com.github.svettwer.bowling;

class BowlingLane {

    private final BowlingGame bowlingGame;
    private final Scoreboard scoreboard;

    BowlingLane(final BowlingGame bowlingGame, final Scoreboard scoreboard) {
        this.bowlingGame = bowlingGame;
        this.scoreboard = scoreboard;
    }

    void roll(final int pins){
        bowlingGame.roll(pins);
        scoreboard.showScore(bowlingGame.getRolls(), bowlingGame.score());
    }
}
