import com.pgoellner.karel.*;

// Goal: Refactor the code below (e.g. create methods and simplify the code as best as you can)
public class DiamondKarel extends Karel {

    public void run() {

        // Prepare building the diamond by measuring the field
        int width = moveToNextWallAndCountSteps() + 1;
        turnAround();
        moveManySteps(width / 2);
        turnRight();
        int height = moveToNextWallAndCountSteps() + 1;
        turnAround();
        moveToNextWall();
        turnLeft();

        // Build the actual Pyramid
        // Bottom
        buildBottomHalf(height);

        // Middle Part
        for (int i = 1; i < width; i++) {
            move();
            putBeeper();
        }

        turnAround();

        moveManySteps(width / 2);

        if (facingWest()) {
            turnRight();
        } else {
            turnLeft();
        }

        moveToNextWall();

        turnLeft();

        // Top
        buildTopHalf(height);

        // Done
    }

    public void moveToNextWall() {
        while (frontIsClear()) {
            move();
        }
    }

    public int moveToNextWallAndCountSteps() {
        int stepsTaken = 0;

        while (frontIsClear()) {
            move();
            stepsTaken++;
        }

        return stepsTaken;
    }

    public void turnAround() {
        turnLeft();
        turnLeft();
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void moveManySteps(int steps) {
        for (int i = 0; i < steps; i++) {
            move();
        }
    }

    public void buildBottomHalf(int height) {
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < 1 + (i * 2); j++) {
                putBeeper();
                move();
            }
            if (facingEast()) {
                turnLeft();
                move();
                turnLeft();
            } else if (facingWest()) {
                turnRight();
                move();
                turnRight();
            }
        }

        putBeeper();
    }

    public void buildTopHalf(int height) {
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < 1 + (i * 2); j++) {
                putBeeper();
                move();
            }
            if (facingEast()) {
                turnRight();
                move();
                turnRight();
            } else if (facingWest()) {
                turnLeft();
                move();
                turnLeft();
            }

        }
    }

}
