public class Zoo {
    Animal[] allAnimals = new Animal[30];

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        System.out.println("---------------[Create Animals]");
        zoo.createAnimals();

        System.out.println("---------------[Interact with Birds]");
        zoo.interactWithBirds();

        System.out.println("---------------[List Animals]");
        zoo.listAllAnimals();

        System.out.println("---------------[Let all flying Birds fly]");
        zoo.letAllFlyingBirdsFly();

        System.out.println("---------------[Feed Animals]");
        zoo.feedAllAnimals();

        System.out.println("---------------[Breeding Season]");
        zoo.breedingSeason();

        System.out.println("---------------[List children]");
        zoo.listAllChildren();
    }

    public void createAnimals() {
        allAnimals[0] = new Duck("Freddy", false);
        allAnimals[1] = new Duck("Tina");

        allAnimals[2] = new Ostrich("Harry");

        allAnimals[3] = new Hummingbird("Lisa");
        allAnimals[4] = new Hummingbird("Albert");

        allAnimals[5] = createRandomBird();
    }

    public Bird createRandomBird() {
        int randomNumber = (int) (Math.random() * 6); // Math.random() -> gibt eine Zahl zw. 0 und 1 zurück [0;1[

        switch (randomNumber) {
            case 0:
                return new Duck("Herbert");
            case 1:
                return new Duck("Zoe");
            case 2:
                return new Ostrich("Beate");
            case 3:
                return new Ostrich("Arnold");
            case 4:
                return new Hummingbird("Margarethe");
            default:
                return new Hummingbird("Claudio");
        }
    }

    public void interactWithBirds() {
        allAnimals[0].setName("bu");

        ((Bird) allAnimals[0]).flapWing(5);
        allAnimals[0].sayName();
        System.out.println(allAnimals[0]);

        allAnimals[1].sayName();

        allAnimals[2].sayName();

        allAnimals[3].sayName();
    }

    public void listAllAnimals() {
        System.out.println("The animals of the zoo are:");

        for (Animal currentBird : allAnimals) {
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
        for (Animal currentBird : allAnimals) {
            if (currentBird instanceof Flying flyingBird) {
                flyingBird.fly();
            }
        }
    }

    public void feedAllAnimals() {
        for (Animal currentAnimal : allAnimals) {
            if (currentAnimal instanceof Herbivore herbivoreBird) {
                herbivoreBird.eat(new Grass());
            } else if (currentAnimal instanceof Omnivore omnivoreBird) {
                omnivoreBird.eat(new Worm());
            }
        }
    }

    public void breedingSeason() {
        for (Animal animal : allAnimals) {
            if (animal != null) {
                animal.procreate();
            }
        }
    }

    public void listAllChildren() {
        for (Animal animal : allAnimals) {
            if (animal instanceof Duck duck) {
                duck.listAllChildren();
            }
        }
    }
}


















