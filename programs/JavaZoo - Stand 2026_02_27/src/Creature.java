public abstract class Creature {
    private int age;

    public void setAge(int neuesAlter) throws AgeCannotBeNegative {
        if (neuesAlter < 0) {
            throw new AgeCannotBeNegative();
        }
        age = neuesAlter;
    }

    public int getAge() {
        return age;
    }
}
