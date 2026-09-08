import com.pgoellner.karel.*;

// Goal: Reach the end of the spiral (the exit).
//       Pick up all beepers along the way and place them at the exit.
public class SpiralEscapeKarel extends Karel {

    public void run() {
        int collectedBeepers = 0;

        while (!(frontIsBlocked() && leftIsBlocked() && rightIsBlocked())) {
            if (frontIsBlocked()) {
                turnLeft();
            }
            if (beeperIsPresent()) {
                pickBeeper();
                collectedBeepers++;
            }
            move();
        }

        for (int i = 0; i < collectedBeepers; i++) {
            putBeeper();
        }
    }

}
