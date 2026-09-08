public class Creature {
    private int age;

    public void setAge(int neuesAlter) {
        if (neuesAlter < 0) {
            System.err.println("Age must be greater than or equal 0");
        }
        age = neuesAlter;
    }

    public int getAge() {
        return age;
    }
}
