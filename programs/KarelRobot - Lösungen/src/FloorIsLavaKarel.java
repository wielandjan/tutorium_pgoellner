import com.pgoellner.karel.*;

// Goal: follow the path to the blue tile
public class FloorIsLavaKarel extends Karel {

	public void run() {
		while (frontIsClear()) {
			move();
		}

		for (int j = 0; j < 2; j++) {
			turnLeft();
			turnLeft();
			turnLeft();

			for (int i = 0; i < 5; i++) {
				move();
			}
		}
	}
	
}
