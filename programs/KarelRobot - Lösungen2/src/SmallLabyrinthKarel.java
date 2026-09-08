import com.pgoellner.karel.*;

// Goal: Beat the small labyrinth and reach the room with the beeper.
public class SmallLabyrinthKarel extends Karel {

    public void run() {
        while(!beeperIsPresent()) {
            if (rightIsClear()) {
                turnLeft();
                turnLeft();
                turnLeft();
            }
            if (frontIsClear()) {
                move();
            } else {
                turnLeft();
            }
        }
    }

}
