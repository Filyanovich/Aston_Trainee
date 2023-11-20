package lessons.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    private String name;
    private int maxDistanceSwim;
    private int maxDistanceRun;
    private static int count;

    public Animals(String name, int maxDistanceSwim, int maxDistanceRun) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void swim(int distance) {
        if (distance >= maxDistanceSwim) {
            System.out.println(name + " �������: " + distance + " �");
        } else {
            System.out.println(name + " �� ����� �������� " + distance + " �");
        }

    }

    public void run(int distance) {
        if (distance <= maxDistanceRun) {
            System.out.println(name + " ��������: " + distance + " �");
        } else {
            System.out.println(name + " �� ����� ��������� " + distance + " �");
        }
    }


}
