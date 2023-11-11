package lessons;

public class Lesson3 {

    /*1.Ќаписать метод, принимающий на вход два целых числа и провер€ющий что их сумма лежит в пределах от 10 до 20
     (включительно), если да Ц вернуть true, в противном случае Ц false.*/
    public static boolean chekSumRange(int a, int b){
        boolean sum= a + b >= 10 && a + b <= 20;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(chekSumRange(5,5));
    }
}
