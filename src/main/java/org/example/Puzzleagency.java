package org.example;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.List;

// https://puzzleagency-ui.com/#/start
public class Puzzleagency {
    static int NUM_REP = 100;

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
//        displayCoordinates();

        Robot robot = new Robot();

        Utils.openSearch(robot);

        // Type "google chrome"
        Utils.typeString(robot, "google chrome");

        Utils.pressEnter(robot);

        for (int i = 0; i<NUM_REP; i++) {
            Thread.sleep(2000, 4000);
            Utils.click(robot, 903, 777);
            Thread.sleep(2000, 4000);
            Utils.click(robot, 900, 1080);
            Thread.sleep(2000, 4000);
            Utils.clickRandom(robot, 756, List.of(370, 450, 520, 590, 640));
        }
    }

}