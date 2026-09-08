public abstract class Bird extends Animal {
    private boolean female;

    public void flapWing(int flapCount) {
        for (int i = 0; i < flapCount; i++) {
            System.out.println("Flap");
        }
    }

    public abstract void layEggs();

    public void procreate() {
        layEggs();
    }

    public void setFemale(boolean isFemale) {
        this.female = isFemale;
    }

    public boolean isFemale() {
        return female;
    }
}
