public class ArrayExercises {



    public int head(int[] intArray) {
        return intArray[0];
    }

    public int last(int[] intArray) {
        return intArray[intArray.length - 1];
    }

    public void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        /*
        for (int number : intArray) {
            System.out.println(number);
        }
        * */
    }

    public void printArrayMitZusatz(int[] intArray) {
        System.out.print("[");
        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.print(intArray[intArray.length - 1] + "]");
    }

    public void doubleAll(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] *= 2;
        }
    }

    public void printEveryTwo(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 1) {
                System.out.println(intArray[i]);
            }
        }
    }

    public int[] copyArray(int[] intArray) {
        int[] newArray = new int[intArray.length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = intArray[i];
        }

        return newArray;
    }

    public int sum(int[] intArray) {
        int summe = 0;

        for (int number : intArray) {
            summe += number;
        }

        return summe;
    }

    public int[] init(int[] intArray) {
        int[] newArray = new int[intArray.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = intArray[i];
        }

        return newArray;
    }

    public int[] tail(int[] intArray) {
        int[] newArray = new int[intArray.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = intArray[i + 1];
        }

        return newArray;
    }

    public int[] join(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }

        for (int i = array1.length; i < newArray.length; i++) {
            newArray[i] = array2[i - array1.length];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] meineZahlen = new int[5];
        meineZahlen[0] = 5;
        meineZahlen[1] = 976;
        meineZahlen[2] = -23;
        meineZahlen[3] = 6;
        meineZahlen[4] = 89;

        ArrayExercises ae = new ArrayExercises();
        ae.printArray(meineZahlen);

    }
}
