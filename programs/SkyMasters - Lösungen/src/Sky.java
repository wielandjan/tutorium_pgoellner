
public class Sky {

	public static void main(String[] args) {
		System.out.println("Teilaufgaben 1 bis 3:");
		teilaufgaben1Bis3();
		System.out.println();
		
		System.out.println("Teilaufgabe 4:");
		teilaufgabe4();
		System.out.println();
		
		System.out.println("Teilaufgabe 5:");
		teilaufgabe5();
		System.out.println();
		
		System.out.println("Teilaufgaben 6 und 7:");
		teilaufgaben6Bis7();
		System.out.println();
	}

	public static void teilaufgaben1Bis3() {
		Airplane airplane1 = new Airplane("Lockheed SR-71 Blackbird", 3_540.0, 25_900.0, 33_000_000.0);
		Airplane airplane2 = new Airplane("Antonov AN-225", 850, 10_750, 225_000_000);
		
		if (airplane1.getMaxSpeed() > airplane2.getMaxSpeed()) {
			System.out.println(airplane1 + " hat gewonnen mit Max Speed: " + airplane1.getMaxSpeed());
		} else {
			System.out.println(airplane2 + " hat gewonnen mit Max Speed: " + airplane2.getMaxSpeed());
		}
	}

	public static void teilaufgabe4() {
		Airplane airplane1 = new Airplane("Lockheed SR-71 Blackbird", 3_540.0, 25_900.0, 33_000_000.0);
		Airplane airplane2 = new Airplane("Antonov AN-225", 850, 10_750, 225_000_000);
		
		String attributName;
		double attributWertAirplane1;
		double attributWertAirplane2;
		
		int zufallsZahl = (int) (Math.random() * 3);
		
		if (zufallsZahl == 0) {
			attributName = "Max Speed";
			attributWertAirplane1 = airplane1.getMaxSpeed();
			attributWertAirplane2 = airplane2.getMaxSpeed();
		} else if (zufallsZahl == 1) {
			attributName = "Max Altitude";
			attributWertAirplane1 = airplane1.getMaxAltitude();
			attributWertAirplane2 = airplane2.getMaxAltitude();
		} else {
			attributName = "Price";
			attributWertAirplane1 = airplane1.getPrice();
			attributWertAirplane2 = airplane2.getPrice();
		}
		
		if (attributWertAirplane1 > attributWertAirplane2) {
			System.out.println(airplane1 + " hat gewonnen mit " + attributName + ": " + attributWertAirplane1);
		} else {
			System.out.println(airplane2 + " hat gewonnen mit " + attributName + ": " + attributWertAirplane2);
		}
	}


	public static void teilaufgabe5() {
		Airplane airplane1 = getRandomAirplane();
		Airplane airplane2 = getRandomAirplane();
		
		String attributName;
		double attributWertAirplane1;
		double attributWertAirplane2;
		
		int zufallsZahl = (int) (Math.random() * 3);
		
		if (zufallsZahl == 0) {
			attributName = "Max Speed";
			attributWertAirplane1 = airplane1.getMaxSpeed();
			attributWertAirplane2 = airplane2.getMaxSpeed();
		} else if (zufallsZahl == 1) {
			attributName = "Max Altitude";
			attributWertAirplane1 = airplane1.getMaxAltitude();
			attributWertAirplane2 = airplane2.getMaxAltitude();
		} else {
			attributName = "Price";
			attributWertAirplane1 = airplane1.getPrice();
			attributWertAirplane2 = airplane2.getPrice();
		}
		
		if (attributWertAirplane1 > attributWertAirplane2) {
			System.out.println(airplane1 + " hat gewonnen mit " + attributName + ": " + attributWertAirplane1);
		} else {
			System.out.println(airplane2 + " hat gewonnen mit " + attributName + ": " + attributWertAirplane2);
		}
	}

	public static void teilaufgaben6Bis7() {
		FlyingMachine flyingMachine1 = getRandomFlyingMachine();
		FlyingMachine flyingMachine2 = getRandomFlyingMachine();
		
		String attributName;
		double attributWert1;
		double attributWert2;
		
		int zufallsZahl = (int) (Math.random() * 3);
		
		if (zufallsZahl == 0) {
			attributName = "Max Speed";
			attributWert1 = flyingMachine1.getMaxSpeed();
			attributWert2 = flyingMachine2.getMaxSpeed();
		} else if (zufallsZahl == 1) {
			attributName = "Max Altitude";
			attributWert1 = flyingMachine1.getMaxAltitude();
			attributWert2 = flyingMachine2.getMaxAltitude();
		} else {
			attributName = "Price";
			attributWert1 = flyingMachine1.getPrice();
			attributWert2 = flyingMachine2.getPrice();
		}
		
		if (attributWert1 > attributWert2) {
			System.out.println(flyingMachine1 + " hat gewonnen mit " + attributName + ": " + attributWert1);
		} else {
			System.out.println(flyingMachine2 + " hat gewonnen mit " + attributName + ": " + attributWert2);
		}
	}
	
	private static Airplane getRandomAirplane() {
		int zufallsZahl = (int) (Math.random() * 5);
		
		if (zufallsZahl == 0) {
			return new Airplane("Lockheed SR-71 Blackbird", 3_540.0, 25_900.0, 33_000_000.0);
		} else if (zufallsZahl == 1) {
			return new Airplane("Antonov AN-225", 850.0, 10_750.0, 225_000_000.0);
		} else if (zufallsZahl == 2) {
			return new Airplane("North American X-15", 7_247.0, 100_000.0, 9_000_000.0);
		} else if (zufallsZahl == 3) {
			return new Airplane("Boeing 777-200LR", 950.0, 11_000.0, 296_000_000.0);
		} else {
			return new Airplane("Northrop Grumman B-2 Spirit", 1_010.0, 15_200.0, 737_000_000.0);
		}
	}
	
	private static FlyingMachine getRandomFlyingMachine() {
		int zufallsZahl = (int) (Math.random() * 12);
		
		if (zufallsZahl == 0) {
			return new Airplane("Lockheed SR-71 Blackbird", 3_540.0, 25_900.0, 33_000_000.0);
		} else if (zufallsZahl == 1) {
			return new Airplane("Antonov AN-225", 850.0, 10_750.0, 225_000_000.0);
		} else if (zufallsZahl == 2) {
			return new Airplane("North American X-15", 7_247.0, 100_000.0, 9_000_000.0);
		} else if (zufallsZahl == 3) {
			return new Airplane("Boeing 777-200LR", 950.0, 11_000.0, 296_000_000.0);
		} else if (zufallsZahl == 4) {
			return new Airplane("Northrop Grumman B-2 Spirit", 1_010.0, 15_200.0, 737_000_000.0);
		}else if (zufallsZahl == 5) {
			return new Helicopter("Sikorsky S-64 Skycrane", 203.0, 2_740.0, 13_000_000.0);
		} else if (zufallsZahl == 6) {
			return new Helicopter("Eurocopter X3", 472.0, 3_810.0, 20_000_000.0);
		} else if (zufallsZahl == 7) {
			return new Airship("Hindenburg", 135.0, 1_700.0, 25_000_000.0);
		} else if (zufallsZahl == 8) {
			return new Airship("Zeppelin NT", 125.0, 2_600.0, 14_500_000.0);
		} else if (zufallsZahl == 9) {
			return new Rocket("Saturn V", 64_500.0, 9_999_999.0, 2_500_000_000.0);
		} else if (zufallsZahl == 10) {
			return new Rocket("Falcon 9", 55_000.0, 9_999_999.0, 61_000_000.0);
		} else if (zufallsZahl == 11) {
			return new UFO("Independence Day Attacker", 2_500.0, 9_999_999.0, 100_000_000_000.0);
		} else {
			return new UFO("Cylon Raider", 200_000.0, 9_999_999.0, 100_000_000_000.0);
		}
	}
}
