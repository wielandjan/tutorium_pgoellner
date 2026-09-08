import com.pgoellner.karel.*;

// Goal: Build a Pyramid which spans the complete width of the playing field.
public class PyramidKarel extends Karel {

	public void run() {
		int width = getSideSize();

		while (width > 0) {
			for (int i = 0; i < width; i++) {
				putBeeper();
				move();
			}

			putBeeper();

			moveToNextRow();
			width -= 2;
			move();
		}

		putBeeper();

	}

	public int getSideSize() {
		int width = 0;

		while (frontIsClear()) {
			move();
			width++;
		}

		turnLeft();
		turnLeft();

		while (frontIsClear()) {
			move();
		}

		turnLeft();
		turnLeft();

		return width;
	}

	public void moveToNextRow() {
		if (facingEast()) {
			turnLeft();
			move();
			turnLeft();
		} else {
			turnLeft();
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
			turnLeft();
		}
	}
}
