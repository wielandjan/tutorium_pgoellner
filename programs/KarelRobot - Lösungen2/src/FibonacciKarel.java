import com.pgoellner.karel.*;

// Goal: Create a Fibonacci sequence of beepers until the right border of the playing field.
public class FibonacciKarel extends Karel {

    public void run() {
        // To determine whether the iterative or the recursive method is used
        boolean iterative = true;

        if (iterative) {
            buildIteratively();
        } else {
            buildRecursively();
        }

        // Get out of the way to see the number on last beeper stack
        turnLeft();
        move();
    }

    // The iterative method (with a loop)
    public void buildIteratively() {
        // Variable to calculate the current number of beepers necessary
        int currentValue = 2;
        int previousValue = 1;

        while (true) {
            putManyBeepers(currentValue);
            if (frontIsClear()) {
                move();

                // Calculate the new Fibonacci number
                int cache = currentValue;
                currentValue = currentValue + previousValue;
                previousValue = cache;

                // Stop the loop if there is a wall
            } else {
                break;
            }
        }
    }

    // The recursive method
    public void buildRecursively() {
        fiboBuild(2, 1);
    }

    // Recursive method to calculate and place beepers
    private void fiboBuild(int currentValue, int previousValue) {
        putManyBeepers(currentValue);

        // End condition, the wall is reached
        if (frontIsBlocked()) {
            return;
        }

        move();
        // Call this same method again with updated Fibonacci number
        fiboBuild(currentValue + previousValue, currentValue);
    }

    // Convenience method to place multiple beepers in one place
    public void putManyBeepers(int number) {
        for (int i = 0; i < number; i++) {
            putBeeper();
        }
    }

}
