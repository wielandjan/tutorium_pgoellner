import com.pgoellner.karel.*;

import javax.swing.*;
import java.io.File;
import java.util.List;

// Goal: Pick up all beepers and place them in the lower-right corner.
public class BeeperCollectingKarel extends Karel {

    public void run() {
        int aufgesammelteBeeper = 0;

        while (frontIsClear()) {
            turnLeft();
            while (frontIsClear()) {
                if (beeperIsPresent()) {
                    pickBeeper();
                    aufgesammelteBeeper++;
                }
                move();
            }

            if (beeperIsPresent()) {
                pickBeeper();
                aufgesammelteBeeper++;
            }
            turnLeft();
            turnLeft();

            while (frontIsClear()) {
                if (beeperIsPresent()) {
                    pickBeeper();
                    aufgesammelteBeeper++;
                }
                move();
            }
            turnLeft();
            move();
        }

        turnLeft();
        while (frontIsClear()) {
            if (beeperIsPresent()) {
                pickBeeper();
                aufgesammelteBeeper++;
            }
            move();
        }

        if (beeperIsPresent()) {
            pickBeeper();
            aufgesammelteBeeper++;
        }
        turnLeft();
        turnLeft();

        while (frontIsClear()) {
            if (beeperIsPresent()) {
                pickBeeper();
                aufgesammelteBeeper++;
            }
            move();
        }
        turnLeft();

        for (int i = 0; i < aufgesammelteBeeper; i++) {
            putBeeper();
        }
    }
}
