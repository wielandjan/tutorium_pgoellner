import com.pgoellner.karel.*;

// Goal: Jump each hurdle individually (only as high as necessary) and reach the bottom-right corner.
public class HurdleJumpingKarel extends Karel {

    public void run() {
        // If there is no hurdle, this will lead to the next wall
        do {
            goToNextHurdle();

            // Try to jump the hurdle and return whether it actually was one or the right
            // wall
        } while (jumpHurdle());

        // Since Karel is in the upper right corner, turn around and go down to the end
        // lower right corner
        turnLeft();
        turnLeft();

        while (frontIsClear()) {
            move();
        }

        turnLeft();
    }

    // Go straight until there is an obstacle
    public void goToNextHurdle() {
        while (frontIsClear()) {
            move();
        }
    }

    // Try to jump a hurdle, on success return true
    // If the obstacle was a wall and not a hurdle, return false
    public boolean jumpHurdle() {
        turnLeft();

        // Keep going until the obstacle's top is reached
        while (rightIsBlocked()) {
            if (frontIsBlocked()) {
                return false;
            }
            move();
        }

        // Move around the obstacle
        turnRight();
        move();
        turnRight();

        // Go down on the other side
        while (frontIsClear()) {
            move();
        }

        // Turn left to assume the initial position
        turnLeft();
        return true;
    }

    // Convenience method for taking a right turn
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
