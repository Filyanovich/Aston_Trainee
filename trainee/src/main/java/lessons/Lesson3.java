package lessons;

public class Lesson3 {

    /*1.�������� �����, ����������� �� ���� ��� ����� ����� � ����������� ��� �� ����� ����� � �������� �� 10 �� 20
     (������������), ���� �� � ������� true, � ��������� ������ � false.*/
    public static boolean chekSumRange(int a, int b){
        boolean sum= a + b >= 10 && a + b <= 20;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(chekSumRange(5,5));
    }
}
