public class Hummingbird {
    private String name = "?";
    private int age = 0;

    public Hummingbird(String nameDesNeuenDucks) {
        name = nameDesNeuenDucks;
    }

    public void flapWing(int flapCount) {
        for (int i = 0; i < flapCount; i++) {
            System.out.println("Flap");
        }
    }

    public void sayName() {
        System.out.println("Hi my name is " + name);
    }

    public void setName(String neuerName) {
        if (neuerName.length() > 2) {
            name = neuerName;
        } else {
            System.err.println("Name must be at least 3 characters long");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int neuesAlter) {
        if (neuesAlter < 0) {
            System.err.println("Age must be greater than or equal 0");
        }
        age = neuesAlter;
    }
}
