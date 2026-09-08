import com.pgoellner.karel.*;

// Goal: Restore the columns by placing beepers in the appropriate spots.
public class DeflectionKarel extends Karel {

    public void run() {
        int stepsTaken = 0;

        while(true) {
            if(frontIsClear()) {
                move();
                stepsTaken++;

                if(beeperIsPresent()) {
                    pickBeeper();
                    turnRandomly();
                } else if (stepsTaken % 10 == 0) {
                    putBeeper();
                }
            } else {
                turnAround();
            }
        }
    }

    public void turnRandomly() {
        if (Math.random() > 0.5) {
            turnLeft();
        } else {
            turnLeft();
            turnLeft();
            turnLeft();
        }
    }

    public void turnAround() {
        turnLeft();
        turnLeft();
    }
}
