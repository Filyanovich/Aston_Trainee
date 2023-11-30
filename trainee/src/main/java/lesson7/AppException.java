package lesson7;

public class AppException {
    public static int sumArrayItems(String[][] array) throws MyArraySizeException, MyArrayDataException {

        //Проверка на размерность массива
        for (String[] row : array)
            if (row.length != 4 || array.length != 4)
                throw new MyArraySizeException("Неверная размерность массива");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

}
