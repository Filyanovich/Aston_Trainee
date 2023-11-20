package lessons.lesson5;

public class Cat extends Animals {
    private static int count;

    public Cat(String name) {
        super(name, -1, 200);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
