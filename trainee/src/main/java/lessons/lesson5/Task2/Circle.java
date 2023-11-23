package lessons.lesson5.Task2;

public class Circle implements FigureAction {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return circlePerimetr(r);
    }

    @Override
    public double getSquare() {
        return 2 * Math.PI * r;
    }

}
