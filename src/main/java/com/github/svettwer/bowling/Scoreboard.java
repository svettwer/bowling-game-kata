package com.github.svettwer.bowling;

import java.util.Formatter;
import java.util.List;

class Scoreboard {

    private final String scoreboardTemplate = "||%d,%d|%d,%d|%d,%d|%d,%d|%d,%d|%d,%d|%d,%d|%d,%d|%d,%d|%d,%d,%d|| => %d";

    String showScore(final List<Integer> scores, int score){
        return String.format(scoreboardTemplate, scores, score);
    }
}
