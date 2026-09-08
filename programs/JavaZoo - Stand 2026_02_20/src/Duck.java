public class Duck extends Bird implements Flying, Omnivore, CarnivoreEatable {
    private Duck mother;
    private Duck[] children;

    public static String speciesDescription = "It walks, swims and quaks like a duck";

    public Duck(String nameDesNeuenDucks) {
        this(nameDesNeuenDucks, true, null);
//        setName(nameDesNeuenDucks);
//        setFemale(true);
    }

    public Duck(String nameDesNeuenDucks, boolean female) {
        this(nameDesNeuenDucks, female, null);
    }

    public Duck(String nameDesNeuenDucks, boolean female, Duck mother) {
        setName(nameDesNeuenDucks);
        setFemale(female);
        this.mother = mother;
    }

    public static void printSpeciesDescription() {
        System.out.println(speciesDescription);
    }

    public void sayName() {
        System.out.println("Hi (quak) my name is " + getName());
    }

    public void fly() {
        flapWing(5);
        System.out.println(getName() + " is flying now");
    }

    public void makeNoise() {
        System.out.println("Quak!");
    }

    public void layEggs() {
        if (isFemale()) {
            if (children == null) {
                children = new Duck[3];

                children[0] = new Duck("Wanda", true, this);
                children[1] = new Duck("Merlin", false, this);
                children[2] = new Duck("Maria", true, this);

                System.out.println(getName() + " has layed 3 eggs");
            }
        } else {
            System.out.println("[ERROR] " + getName() + " cannot lay eggs!");
        }
    }

    public void listAllChildren() {
        if (children == null) {
            System.out.println(getName() + " does not have any children");
        } else {
            System.out.println(getName() + " has the following children:");
            for (Duck child : children) {
                System.out.println(child.getName());
            }
        }
    }

    public void eat(Eatable food) {
        System.out.println(getName() + " (quak) is eating " + food.getClass().getSimpleName());
    }

    public String toString() {
        return "Hi (quak) my name is " + getName() + " and I am " + getAge() + " years old";
    }

    public void printAncenstors() {
        System.out.println(getName());
        if (mother != null) {
            mother.printAncenstors();
        }
    }

    public static boolean areRelated(Duck oneDuck, Duck anotherDuck) {
        if (oneDuck == anotherDuck) {
            return true;

        } else if (oneDuck.mother != null && anotherDuck.mother != null) {
            return areRelated(oneDuck.mother, anotherDuck.mother);

        } else if (oneDuck.mother == null && anotherDuck.mother != null) {
            return areRelated(oneDuck, anotherDuck.mother);

        } else if (oneDuck.mother != null && anotherDuck.mother == null) {
            return areRelated(oneDuck.mother, anotherDuck);
        }

        return false;
    }
}










