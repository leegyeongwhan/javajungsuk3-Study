package JavaJungSuk3_Study.Example.ch12;

import java.util.ArrayList;

public class Ex12_4 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> frutBox = new FruitBox2<Fruit2>();

        //Fruit2 와 그자손 지넥리스          타입모두가능
        FruitBox2<? extends Fruit2> appleBox = new FruitBox2<Apple2>();


        appleBox = new FruitBox2<Fruit2>();
        appleBox = new FruitBox2<Apple2>();
        appleBox = new FruitBox2<Grape2>();

        FruitBox<? extends Fruit> fbox = new FruitBox<Fruit>();
        FruitBox<? extends Fruit> abox = new FruitBox<Apple>();

        FruitBox<Apple> abox2 = (FruitBox<Apple>) abox;

    }


}

interface Eatable2 {
}

class Fruit2 extends Fruit implements JavaJungSuk3_Study.Example.ch12.Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape";
    }
}

class Toy2 {
    public String toString() {
        return "Toy";
    }
}


class FruitBox2<T extends Fruit> extends Box<T> {
}

class Box2<T> {
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

