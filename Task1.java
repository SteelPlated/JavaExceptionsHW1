import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    void obtainStackOverflow() {
        Task1 inner = new Task1();
        inner.obtainStackOverflow();
    }

    long factorial(long a) {
        if (a == 1)
            return 1;
        return a * factorial(a + 1);
    }

    void obtainOutOfMemory() {
        ArrayList<String[]> list = new ArrayList<>();
        while (true) {
            list.add(new String[0]);
        }
    }

    void obtainOutOfMemory2() {
        String[] s = new String[Integer.MAX_VALUE];
    }

    void obtainDivisionByZero() {
        int a = 10 / 0;
    }

    String obtainNullPointerException(Integer[] array) {
        int[] outArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            outArray[i] = array[i];
        }
        return Arrays.toString(outArray);
    }

    void obtainIllegalStateException() {
        Scanner scn = new Scanner(System.in);
        scn.close();
        scn.nextLine();

}
    public static void main(String[] args) {
        Task1 app = new Task1();
    }

}
