public class Ostrich extends Bird implements CarnivoreEatable, Herbivore {

    public Ostrich(String nameDesNeuenOstriches) {
        setName(nameDesNeuenOstriches);
    }

    public void eat(HerbivoreEatable food) {
        System.out.println(getName() + " is eating " + food.getClass().getSimpleName());
    }
}
