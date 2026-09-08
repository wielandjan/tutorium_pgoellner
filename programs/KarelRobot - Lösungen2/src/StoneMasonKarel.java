import com.pgoellner.karel.*;

// Goal: Restore the columns by placing beepers in the appropriate spots.
public class StoneMasonKarel extends Karel {

	public void run() {
		makeColumn();
		
		while (frontIsClear()) {
			moveToNextColumn();
			makeColumn();
		}
		
	}
	
	public void makeColumn() {
		turnLeft();
		do {
			if (!beeperIsPresent()) {
				putBeeper();
			}
			move();
		} while(frontIsClear());
		
		if (!beeperIsPresent()) {
			putBeeper();
		}

		turnLeft();
		turnLeft();
		
		while(frontIsClear()) {
			move();
		}
		
		turnLeft();
	}


	
	public void moveToNextColumn() {
		move();
		move();
		move();
		move();
	}

	public void walkManySteps(final int anzahl) {
		// ....
	}
}
