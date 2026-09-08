import com.pgoellner.karel.*;

// Goal: Place beepers in a checkerboard pattern across the complete playing field.
public class CheckerboardKarel extends Karel {

    public void run() {
        boolean shouldPlaceBeeper = true;

        while (!isAtTheEnd()) {
            while (frontIsClear()) {
                if (shouldPlaceBeeper) {
                    putBeeper();
                }
                shouldPlaceBeeper = !shouldPlaceBeeper;
                move();
            }

            moveToNextRow(shouldPlaceBeeper);
        }

        turnLeft();
        turnLeft();
    }

    public boolean isAtTheEnd() {
        return frontIsBlocked() &&
            (
                (rightIsBlocked() && facingWest())
                    || (leftIsBlocked() && facingEast())
            );
    }

    public void moveToNextRow(boolean shouldPlaceBeeper) {
        if (isAtTheEnd()) {
            return;
        }

        if (facingEast()) {
            turnLeft();
        } else {
            turnLeft();
            turnLeft();
            turnLeft();
        }

        if (shouldPlaceBeeper) {
            putBeeper();
            move();
        } else {
            move();
            putBeeper();
        }

        if (rightIsBlocked()) {
            turnLeft();
        } else {
            turnLeft();
            turnLeft();
            turnLeft();
        }

        move();
    }
}
