import com.pgoellner.karel.*;

// Goal: Go along the race track forever.
public class AdvancedRaceTrackKarel extends Karel {

    public void run() {
        while (true) {
            if (frontIsBlocked() && rightIsBlocked()) {
                turnLeft();
            } else if (frontIsBlocked() && leftIsBlocked()) {
                turnLeft();
                turnLeft();
                turnLeft();
            }
            move();
        }
    }
}
