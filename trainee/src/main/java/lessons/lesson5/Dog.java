package lessons.lesson5;

public class Dog extends Animals {
    private static int count;

    public Dog(String name) {
        super(name, 0, 500);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
