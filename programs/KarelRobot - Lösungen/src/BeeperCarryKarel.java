import com.pgoellner.karel.*;

public class BeeperCarryKarel extends Karel {

    public void run() {
        move();
        pickBeeper();
        move();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        putBeeper();
    }

}
