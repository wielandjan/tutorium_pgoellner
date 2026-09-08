public class Hummingbird extends Bird implements Flying, CarnivoreEatable, Herbivore {

    public Hummingbird(String nameDesNeuenHummingbirds) {
        setName(nameDesNeuenHummingbirds);
    }

    public void fly() {
        flapWing(7);
        System.out.println(getName() + " is flying now");
    }
    
    public void eat(HerbivoreEatable food) {
        System.out.println(getName() + " is eating " + food.getClass().getSimpleName());
    }
}
