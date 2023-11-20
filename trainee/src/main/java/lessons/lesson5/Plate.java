package lessons.lesson5;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    //��������� ������
    public boolean fullPlate(int n) {
        int foodEaten = food - n;
        if (foodEaten < 0) {
            return false;
        }

        food -= n;
        return true;

    }

    public void addFood(int amountFood) {
        this.food = food + amountFood;
    }

    void printInfo() {
        System.out.println("� ������� " + food + " ���");
        if (food == 0) System.out.println("����� ������");
    }
}
