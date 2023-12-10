package lesson10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public int count() {
        return fruits.size();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void pourTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }
        for (T fruit : fruits) {
            if (anotherBox.fruits.size() > 0 && !fruit.getClass().equals(anotherBox.fruits.get(0).getClass())) {
                // если типы фруктов в коробках не совпадают, то ничего не делаем
                continue;
            }
            anotherBox.addFruit(fruit);
        }
        fruits.clear();
    }
}
