public class Hummingbird extends Bird implements Flying, CarnivoreEatable, Herbivore {
    Hummingbird[] children;

    public Hummingbird(String nameDesNeuenHummingbirds) {
        this(nameDesNeuenHummingbirds, true);
    }

    public Hummingbird(String nameDesNeuenHummingbirds, boolean female) {
        setName(nameDesNeuenHummingbirds);
        setFemale(female);
    }

    public void fly() {
        flapWing(7);
        System.out.println(getName() + " is flying now");
    }

    public void makeNoise() {
        System.out.println("Flapflapflap");
    }

    public void layEggs() {
        if (isFemale()) {
            if (children == null) {
                children = new Hummingbird[6];

                children[0] = new Hummingbird("Hermine");
                children[1] = new Hummingbird("Hermine");
                children[2] = new Hummingbird("Hermine");
                children[3] = new Hummingbird("Hermine");
                children[4] = new Hummingbird("Hermine");
                children[5] = new Hummingbird("Hermine");

                System.out.println(getName() + " has layed 6 eggs");
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
            for (Hummingbird child : children) {
                System.out.println(child.getName());
            }
        }
    }

    public void eat(HerbivoreEatable food) {
        System.out.println(getName() + " is eating " + food.getClass().getSimpleName());
    }
}
