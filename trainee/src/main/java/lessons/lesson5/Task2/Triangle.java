package lessons.lesson5.Task2;

public class Triangle implements FigureAction {
    private int a, b, c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return trianglePerimetr(a, b, c);
    }

    @Override
    public double getSquare() {
        int p = (int) (getPerimetr() / 2);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
