package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String arr[][] = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"1", "1", "1", "1"}, {"2", "2", "2"}};
        System.out.println(arr.length);
        for (String[] row : arr) {
            System.out.println("Размер " + Arrays.toString(row) + " = " + row.length);
        }

        try {
            AppException.checkArraySize(arr);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }


}
