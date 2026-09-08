public class Zoo {
    Bird[] allBirds = new Bird[30];

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.createAnimals();
        zoo.interactWithBirds();
        zoo.listAllBirds();
        zoo.letAllFlyingBirdsFly();
    }

    public void createAnimals() {
        allBirds[0] = new Duck("Freddy");
        allBirds[1] = new Duck("Tina");

        allBirds[2] = new Ostrich("Harry");

        allBirds[3] = new Hummingbird("Lisa");
        allBirds[4] = new Hummingbird("Albert");

        allBirds[5] = createRandomBird();
    }

    public Bird createRandomBird() {
        int randomNumber = (int) (Math.random() * 6); // Math.random() -> gibt eine Zahl zw. 0 und 1 zurück [0;1[

        switch (randomNumber) {
            case 0: return new Duck("Herbert");
            case 1: return new Duck("Zoe");
            case 2: return new Ostrich("Beate");
            case 3: return new Ostrich("Arnold");
            case 4: return new Hummingbird("Margarethe");
            default: return new Hummingbird("Claudio");
        }
    }

    public void interactWithBirds() {
        allBirds[0].setName("bu");

        allBirds[0].flapWing(5);
        allBirds[0].sayName();
        System.out.println(allBirds[0]);

        allBirds[1].sayName();
        allBirds[1].layEggs();

        allBirds[2].sayName();

        allBirds[3].sayName();
        allBirds[4].layEggs();
    }

    public void listAllBirds() {
        System.out.println("The animals of the zoo are:");

        for (Bird currentBird : allBirds) {
            if (currentBird != null) {
                System.out.println("- " + currentBird.getName() + " (" + currentBird.getClass().getSimpleName() + ")");
            }
//            if (currentBird instanceof Duck currentDuck) {
//                // Duck currentDuck = (Duck) currentBird;
//                System.out.println("- " + currentDuck.getName() + " (Duck)");
//            }
//            if (currentBird instanceof Ostrich currentOstrich) {
//                System.out.println("- " + currentOstrich.getName() + " (Ostrich)");
//            }
//            if (currentBird instanceof Hummingbird currentHummingbird) {
//                System.out.println("- " + currentHummingbird.getName() + " (Hummingbird)");
//            }
        }
    }

    public void letAllFlyingBirdsFly() {
        for (Bird currentBird : allBirds) {
            if (currentBird instanceof Flying flyingBird) {
                flyingBird.fly();
            }
        }
    }
}
