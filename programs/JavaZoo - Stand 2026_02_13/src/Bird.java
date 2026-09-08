public class Bird extends Animal {

    public void flapWing(int flapCount) {
        for (int i = 0; i < flapCount; i++) {
            System.out.println("Flap");
        }
    }

    public void layEggs() {
        System.out.println(getName() + " has layed some eggs");
    }
}
