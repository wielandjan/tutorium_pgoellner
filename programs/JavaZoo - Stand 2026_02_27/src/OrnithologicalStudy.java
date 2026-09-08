public class OrnithologicalStudy {
    public static void main(String[] args) {

        Duck tina = new Duck("Tina", true, null);
        Duck belinda = new Duck("Belinda", true, tina);
        Duck ute = new Duck("Ute", true, belinda);

        ute.printAncenstors();

        Duck mary = new Duck("Mary", true, belinda);
        Duck freddy = new Duck("Freddy", false, mary);

        Duck ingo = new Duck("Ingo", false, null);

        System.out.println("Ute & Freddy are related? " + Duck.areRelated(ute, freddy)); // -> true
        System.out.println("Ute & Ingo are related? " + Duck.areRelated(ute, ingo)); // -> false
        System.out.println("Ingo & Ingo are related? " + Duck.areRelated(ingo, ingo)); // -> true


        /*
                            Tina
                          /      \
                        Belinda  Mary
                         |        |
                        Ute     Freddy

        * */
    }
}
