public class Duck extends Bird implements Flying, Omnivore, CarnivoreEatable {
    public static String speciesDescription = "It walks, swims and quaks like a duck";

    public Duck(String nameDesNeuenDucks) {
        setName(nameDesNeuenDucks);
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

    public void eat(Eatable food) {
        System.out.println(getName() + " (quak) is eating " + food.getClass().getSimpleName());
    }

    public String toString() {
        return "Hi (quak) my name is " + getName() + " and I am " + getAge() + " years old";
    }
}
