package lessons.lesson5;

public class Cat extends Animals {
    private static int count;

    private String name;
    private boolean hungry;
    private int amountEat;//������� ����� ������� �����

    public Cat(String name) {
        super(name, -1, 200);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int distance) {
        System.out.println("��� �� ����� �������");
    }

    public Cat(String name, int amountEat) {
        this.name = name;
        this.amountEat = amountEat;
        this.hungry = true;
    }

    public void infoHungryCat() {
        String isHungry = !hungry ? "���" : "�������";
        System.out.println(name + ": " + isHungry);
    }

    public void eat(Plate plate) {
        if (hungry && plate.fullPlate(amountEat)) {
            hungry = false;
        }
    }


}
