# bowling-game-kata
Boilerplate code for my TDD bowling game kata workshop.

The goal of the workshop is to practice TDD and experiment with it. It is not the goal to finish the kata during the
workshop. Take your time to understand the principles of TDD, its benefits and weaknesses.

## TDD workflow

![](https://upload.wikimedia.org/wikipedia/commons/0/0b/TDD_Global_Lifecycle.png)
*Source: [en.wikipedia.org](https://en.wikipedia.org/wiki/File:TDD_Global_Lifecycle.png)* 

## Bowling rules

1. A Game consists of 10 frames.
2. There are 10 pins per frame.
3. A player has two tries per frame to knock down all pins.
4. The score for the frame is the amount of pins plus Bonus.
5. Spare: 10 pins down after two tries.
6. Bonus: Number of pins of the next roll.
7. Strike: 10 pins down on first try.
8. Bonus: Number of pins of the next two rolls.
9. Tenth Frame: Spare or Strike enable third roll.

## CLI commands
- On Linux: `./mvnw clean test` 
- On Windows: `\.mvnw.cmd clean test`
