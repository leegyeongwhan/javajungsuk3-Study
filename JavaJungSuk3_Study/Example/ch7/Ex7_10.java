package JavaJungSuk3_Study.Example.ch7;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = new Unit[3];

        group[0] = new Marin();
        group[1] = new Tank();
        group[2] = new DropShip();
    }
}

abstract class Unit {
    int x;
    int y;

    abstract void move(int x, int y);

    void stop() {
    }

    ;
}

class Marin extends Unit {

    @Override
    void move(int x, int y) {

    }
}

class Tank extends Unit {

    @Override
    void move(int x, int y) {

    }
}

class DropShip extends Unit {

    @Override
    void move(int x, int y) {

    }
}