package com.github.svettwer.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameTest {

    @Test
    void testAwfulGame(){

        //GIVEN
        final BowlingGame bowlingGame = new BowlingGame();

        //WHEN
        for(int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }

        //THEN
        assertEquals(0, bowlingGame.score());
    }

}