package lessons.lesson5.Task2;

public class Rectangle implements FigureAction {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return rectanflePerimetr(a, b);
    }

    @Override
    public double getSquare() {
        return a * b;
    }
}
