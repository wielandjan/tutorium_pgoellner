public class Zoo {
    public static void main(String[] args) {
        Duck freddy = new Duck("Freddy");
        freddy.setName("bu");

        freddy.flapWing(5);
        freddy.sayName();

        Duck tina = new Duck("Tina");
        tina.sayName();

        System.out.println("The animals of the zoo are: " +
            freddy.getName() + " and " +
            tina.getName()
        );
    }
}
