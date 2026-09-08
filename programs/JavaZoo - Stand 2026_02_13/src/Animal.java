public class Animal extends Creature {
    private String name;

    public void sayName() {
        System.out.println("Hi my name is " + name);
    }

    public void setName(String neuerName) {
        if (neuerName != "Fredolbert"
            && neuerName.length() > 2) {
            name = neuerName;
        } else {
            System.err.println("Name must be at least 3 characters long and mustn't be 'Fredolbert'");
        }
    }

    public String getName() {
        return name;
    }
}
