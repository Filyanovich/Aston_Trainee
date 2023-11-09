package lessons;

public class Lesson2 {

    /* 1.—оздайте метод printThreeWords(),
     * которыий при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.*/
    public static void printThreeWords() {
        String s1 = "Orange", s2 = "Banana", s3 = "Apple";
        System.out.println(s1 + "\n" + s2 + "\n" + s3);
    }

    /* 2.—оздаи?те метод checkSumSign(), в теле которого объ€вите две int переменные a и b,
     и инициализируийте их любыми значени€ми, которыми захотите.
     ƒалее метод должен просуммировать эти переменные, и если их сумма больше или
     равна 0, то вывести в консоль сообщение У—умма положительна€Ф,
     в противном случае - У—умма отрицательна€Ф;*/
    public static void checkSumSign() {
        int a = 5, b = -8;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("—умма положительна€");
        } else System.out.println("—умма отрицательна€");
    }

    /* 3.—оздаи?те метод printColor() в теле которого задаите int переменную value
    и инициализируйте ее любым значением. ≈сли value меньше 0 (0 включительно),
    то в консоль метод должен вывести сообщение У расныи?Ф,
    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
    то У∆елтыи?Ф, если больше 100 (100 исключительно) - У«еленыи?Ф;*/
    public static void printColor() {
        int value = 500;
        if (value <= 0) {
            System.out.println(" расный");
        } else if (value > 0 && value <= 100) {
            System.out.println("∆елтый");
        } else {
            System.out.println("«еленый");
        }
    }

    /*—оздайте метод compareNumbers(), в теле которого объ€вите две int переменные a и b,
     и инициализируйте их любыми значени€ми, которыми захотите.
     ≈сли a больше или равно b, то необходимо вывести в консоль сообщение Уa >= bФ, в противном случае Уa < bФ;
    */
    public static void compareNumbers() {
        int a = 8, b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        System.out.println("«адание є1:");
        printThreeWords();
        System.out.println("\n«адание є2:");
        checkSumSign();
        System.out.println("\n«адание є3:");
        printColor();
        System.out.println("\n«адание є4:");
        compareNumbers();
    }
}
