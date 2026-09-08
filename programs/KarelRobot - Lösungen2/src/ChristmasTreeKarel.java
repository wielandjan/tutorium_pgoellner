import com.pgoellner.karel.*;

// Goal: Create a christmas-tree shaped pattern, covering the complete height of the field.
public class ChristmasTreeKarel extends Karel {

    public void run() {
        // The first part is to determine the dimensions of the playing field
        // Based on these values, the tree is scaled
        int width = getSideSize();
        turnAround();
        walkManySteps(width);
        turnRight();

        int height = getSideSize();
        turnAround();
        walkManySteps(height);
        turnLeft();

        // Go to the middle of the playing field and place a beeper (the trunk)
        walkManySteps(width / 2);
        putBeeper();
        turnLeft();

        // Calculate the number of pyramids of which the christmas tree consists
        int pyramidsToBuild = calculateNumberOfPyramids(height);

        // Build every required pyramid using the calculated base width
        for (int i = pyramidsToBuild; i != 0; i--) {
            makePyramid(i * 2 + 1);
        }

    }

    /*
     * Calculates the number of pyramids for a given playing field height.
     * Every additional pyramid level has one height
     * The increasing pyramid heights are subtracted from the total remaining
     * playing field height until no more pyramids fit into the field
     */
    public int calculateNumberOfPyramids(int height) {
        int numberOfPyramids = 0;
        int pyramidLevelHeight = 2;

        while (pyramidLevelHeight <= height) {
            height = height - pyramidLevelHeight;
            numberOfPyramids++;
            pyramidLevelHeight++;
        }

        return numberOfPyramids;
    }

    // Walk to the opposite wall while counting the steps
    public int getSideSize() {
        int width = 0;

        while (frontIsClear()) {
            move();
            width++;
        }

        return width;
    }

    // Convenience method to simply take multiple steps
    public void walkManySteps(int steps) {
        walkManySteps(steps, false);
    }

    // Convenience method for turning Karel around
    public void turnAround() {
        turnLeft();
        turnLeft();
    }

    // Convenience method for taking a right turn
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    // Take multiple steps; if putBeepers is true, place a beeper
    // for every step taken
    public void walkManySteps(int steps, boolean putBeeper) {
        for (int i = 0; i < steps; i++) {
            if (putBeeper) {
                putBeeper();
            }
            move();
        }
    }

    // This method builds a pyramid for a given base width
    public void makePyramid(int width) {

        // Walk to the left end of the pyramid base to start
        move();
        turnLeft();
        walkManySteps(width / 2);
        turnAround();

        /*
         * Run until the width is equal to or smaller then zero
         * As we are building a pyramid, each row to the top becomes smaller
         */
        while (width > 0) {
            walkManySteps(width - 1, true);

            // Put a last beeper before moving on to the next level
            putBeeper();

            /*
             * If Karel is facing West:
             * 1. Turn right
             * 2. Take a step (towards North)
             * 3. Turn right
             * 4. Take a step (towards East)
             *
             * Otherwise (Karel is facing East):
             * 1. Turn left
             * 2. Take a step (towards North)
             * 3. Turn left
             * 4. Take a step (towards West)
             *
             */

            if (width < 2) {
                break;
            }
            if (facingWest()) {
                turnRight();
                move();
                turnRight();
                move();
            } else {
                turnLeft();
                move();
                turnLeft();
                move();
            }

            // Decrease the width of the pyramid's current level by 2 (1 for each side)
            width = width - 2;
        }

        if (facingWest()) {
            turnRight();
        } else {
            turnLeft();
        }
    }

}
