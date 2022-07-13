package JavaJungSuk3_Study.Example.ch12;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

interface Eatable {
}

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Grape> grapeFruitBox = new FruitBox<>();

        //        Box<Fruit> fruitBox = new Box<Fruit>();
//        Box<Apple> appletBox = new Box<Apple>();
//        Box<Toy> toyBox = new Box<Toy>();
//
//        fruitBox.add(new Fruit());
//        fruitBox.add(new Apple());
//
//        appletBox.add(new Apple());
//        //appletBox.add(new Fruit());  타입불일치

    }

}

class FruitBox<T extends Fruit> extends Box<T> {
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}