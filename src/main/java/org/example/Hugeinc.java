package org.example;

import java.awt.*;
import java.io.IOException;

import static org.example.Utils.click;
import static org.example.Utils.openSearch;
import static org.example.Utils.pressEnter;
import static org.example.Utils.sleepRandom;
import static org.example.Utils.typeString;

// https://www.hugeinc.top/#/home
public class Hugeinc {
    static int NUM_REP = 50;

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//        displayCoordinates();

        Robot robot = new Robot();

        openSearch(robot);

        // Type "google chrome"
        typeString(robot, "google chrome");

        pressEnter(robot);

        for (int i = 0; i<NUM_REP; i++) {
            sleepRandom(1000, 2000);
            click(robot, 898, 1027);
            sleepRandom(500, 1000);
            click(robot, 1217, 899);
            sleepRandom(500, 1000);
            click(robot, 877, 1094);
            sleepRandom(500, 1000);
        }
    }
}