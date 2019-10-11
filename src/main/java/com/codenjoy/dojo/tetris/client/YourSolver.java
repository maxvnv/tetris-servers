package com.codenjoy.dojo.tetris.client;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2016 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.client.AbstractJsonSolver;
import com.codenjoy.dojo.client.WebSocketRunner;
import com.codenjoy.dojo.services.Dice;
import com.codenjoy.dojo.services.Point;
import com.codenjoy.dojo.services.RandomDice;
import org.json.JSONObject;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This is your algorithm for the game. Implement it in order to win.
 * You might also want to look аt {@see SolverTest} - a simple test framework was written for
 * your solver. Also in {@see BoardTest} you can find some methods for the board that
 * might be useful for you.
 */
public class YourSolver extends AbstractJsonSolver<Board> {

    private Dice dice;

    public YourSolver(Dice dice) {
        this.dice = dice;
    }

    @Override
    public String getAnswer(Board board) {
//        This is the starting point of your algorithm. Return a command that should be applied to a figure.
//        There are several commands: LEFT, RIGHT – to move the figure to the left/right;
//        DOWN - to land the figure;
//        ACT - to rotate the figure 90 degrees clockwise;
//        ACT(2) - to rotate the figure 180 degrees;
//        ACT(3) - to rotate the figure 90 degrees counterclockwise;
//        ACT(0,0) - zeroing glass (as well as for its overflow penalty points will be taken).
//        Movement/rotation/landing commands can be combined by separating them with a comma - this means that a given chain of commands will be executed in one tact.
        return "DOWN";
    }

    public static void main(String[] args) {
        WebSocketRunner.runClient(
                // paste here board page url from browser after registration
                "http://codenjoy.com/codenjoy-contest/board/player/etg6a1nc2nd1npcrduqm?code=6536365283495091812",
                new YourSolver(new RandomDice()),
                new Board());
    }

}
