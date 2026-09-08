import com.pgoellner.karel.*;

/* Goal: Pick up all beepers on the red fields and place all picked up
         beepers on the blue field
 */
public class CalculatorKarel extends Karel {

	public void run() {
		int totalBeepers = 0;

		move();
		move();

		while (beeperIsPresent()) {
			pickBeeper();
			totalBeepers++;
		}

		move();
		move();

		while (beeperIsPresent()) {
			pickBeeper();
			totalBeepers++;
		}

		move();
		move();

		for (int i = 0; i < totalBeepers; i++) {
			putBeeper();
		}

		move();
	}

}
