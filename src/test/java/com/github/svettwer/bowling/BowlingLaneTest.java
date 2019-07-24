package com.github.svettwer.bowling;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BowlingLaneTest {

    private BowlingGame bowlingGameMock = mock(BowlingGame.class);
    private Scoreboard scoreboardMock = mock(Scoreboard.class);

    private BowlingLane bowlingLane = new BowlingLane(bowlingGameMock, scoreboardMock);

    @Test
    void TestRollIsPassedToBowlingGame(){

        //GIVEN
        final int pins = 5;

        //WHEN
        bowlingLane.roll(pins);

        //THEN
        verify(bowlingGameMock).roll(pins);
    }
}
