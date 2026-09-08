public class MaleBirdsCannotLayEggs extends RuntimeException {
    public MaleBirdsCannotLayEggs(Bird birdDerVersuchtHatEierZuLegen) {
        super(birdDerVersuchtHatEierZuLegen.getName() + " cannot lay eggs!");
    }
}
