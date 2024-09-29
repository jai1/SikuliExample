package org.example;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Utils {
    static Random r = new Random();

    public static void sleepRandom(int min, int max) throws InterruptedException {
        int timeInMillis = r.nextInt(min, max);
        Thread.sleep(timeInMillis);
    }

    public static void clickRandom(Robot robot, int x, List<Integer> yList) throws InterruptedException {
        sleepRandom(200,1000);

        // Move mouse and click
        int index = r.nextInt(0, yList.size());
        robot.mouseMove(x, yList.get(index));
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        sleepRandom(200,1000);
    }

    public static void click(Robot robot, int x, int y) throws InterruptedException {
        sleepRandom(200,1000);

        // Move mouse and click
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        sleepRandom(200,1000);
    }

    public static void displayCoordinates() throws IOException {
        while (true) {
            System.out.println("Move your mouse to the desired location and press Enter...");
            System.in.read(); // Wait for user input

            Point coordinates = MouseInfo.getPointerInfo().getLocation();
            System.out.println("Coordinates: x = " + coordinates.x + ", y = " + coordinates.y);
        }
    }

    public static void pressEnter(Robot robot) throws InterruptedException {
        sleepRandom(200,1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        sleepRandom(200,1000);
    }

    public static void openSearch(Robot robot) throws InterruptedException {
        sleepRandom(200,1000);

        // Open Spotlight Search
        robot.keyPress(KeyEvent.VK_META); // Command key on Mac
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_META);

        sleepRandom(200,1000);
    }

    public static void typeString(Robot robot, String text) throws InterruptedException {
        sleepRandom(200,1000);

        for (char c : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (Character.isUpperCase(c)) {
                robot.keyPress(KeyEvent.VK_SHIFT);

            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            if (Character.isUpperCase(c)) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
        }

        sleepRandom(200,1000);
    }
}
