public class Worm extends Animal implements CarnivoreEatable {
    public Worm() {
        setName("Worm");
    }

    public void procreate() {
        System.out.println("Lots of worms");
    }

    public void makeNoise() {
        System.out.println("Wiggle wiggle");
    }
}
