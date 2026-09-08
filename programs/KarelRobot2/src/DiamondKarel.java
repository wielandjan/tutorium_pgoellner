import com.pgoellner.karel.*;

// Goal: Refactor the code below (e.g. create methods and simplify the code as best as you can)
public class DiamondKarel extends Karel {

	public void run() {
		int width = 1;
		int height = 1;

		while (frontIsClear()) {
			move();
			width++;
		}

		turnLeft();
		turnLeft();

		for (int i = 0; i < width / 2; i++) {
			move();
		}

		turnLeft();
		turnLeft();
		turnLeft();

		while (frontIsClear()) {
			move();
			height++;
		}

		turnLeft();
		turnLeft();

		while (frontIsClear()) {
			move();
		}

		turnLeft();

		for (int i = 0; i < height / 2; i++) {
			for (int j = 0; j < 1 + (i * 2); j++) {
				putBeeper();
				move();
			}
			if (facingEast()) {
				turnLeft();
				move();
				turnLeft();
			} else if (facingWest()) {
				turnLeft();
				turnLeft();
				turnLeft();
				move();
				turnLeft();
				turnLeft();
				turnLeft();
			}
			
		}
		
		putBeeper();
		
		for (int i = 1; i < width; i++) {
			move();
			putBeeper();
		}
		
		turnLeft();
		turnLeft();

		for (int i = 0; i < width / 2; i++) {
			move();
		}
		
		if (facingWest()) {
			turnLeft();
			turnLeft();
			turnLeft();
		} else {
			turnLeft();
		}


		while (frontIsClear()) {
			move();
		}
		
		turnLeft();

		for (int i = 0; i < height / 2; i++) {
			for (int j = 0; j < 1 + (i * 2); j++) {
				putBeeper();
				move();
			}
			if (facingEast()) {
				turnLeft();
				turnLeft();
				turnLeft();
				move();
				turnLeft();
				turnLeft();
				turnLeft();
			} else if (facingWest()) {
				turnLeft();
				move();
				turnLeft();
			}
			
		}
	}

}
