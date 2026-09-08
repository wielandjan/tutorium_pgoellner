public class Ostrich extends Bird implements CarnivoreEatable, Herbivore {
    Ostrich[] children;

    public Ostrich(String nameDesNeuenOstriches) {
        this(nameDesNeuenOstriches, true);
    }

    public Ostrich(String nameDesNeuenHummingbirds, boolean female) {
        setName(nameDesNeuenHummingbirds);
        setFemale(female);
    }

    public void makeNoise() {
        System.out.println("Wuiiiii");
    }

    public void layEggs() {
        if (isFemale()) {
            if (children == null) {
                children = new Ostrich[1];

                children[0] = new Ostrich("Hermine");

                System.out.println(getName() + " has layed 1 egg");
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
            for (Ostrich child : children) {
                System.out.println(child.getName());
            }
        }
    }

    public void eat(HerbivoreEatable food) {
        System.out.println(getName() + " is eating " + food.getClass().getSimpleName());
    }
}
