package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String arr[][] = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"1", "1", "1", "1"}, {"2", "2", "2", "2"}};
        //Массив для вылавливания ошибки
//        String arr[][] = {{"1", "1", "1", "1"}, {"2", "2", "2", "HELLO"}, {"1", "1","1" ,"1"}, {"2", "2", "2","2"}};

        try {
            int sum = AppException.sumArrayItems(arr);
            System.out.println("Сумма элементов равна: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }


}
