package lesson7;

public class AppException {
    public static void checkArraySize(String[][] array) throws MyArraySizeException {

        //�������� �� ����������� �������
        for (String[] row : array)
            if (row.length != 4 || array.length != 4)
                throw new MyArraySizeException("�������� ����������� �������");

    }

}
