import com.pgoellner.karel.*;

// Goal: Collect the newspaper, bring it back inside and drop it where you started.
public class CollectNewspaperKarel extends Karel {

    public void run() {
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
    }

}
