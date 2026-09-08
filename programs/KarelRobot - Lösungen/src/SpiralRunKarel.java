import com.pgoellner.karel.*;

// Goal: pick up all beepers with as few instructions as possible
public class SpiralRunKarel extends Karel {

	public void run() {
		while (!(frontIsBlocked() && facingWest())) {
			move();
			if (beeperIsPresent()) {
				pickBeeper();
				turnLeft();
			}
		}
	}
	
}
