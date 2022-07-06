package JavaJungSuk3_Study.Example.ch7;


class Unit3 {
}

class GroundUnit extends Unit3 {
}

class AirUnit extends Unit3 {
}

class DropShip2 extends AirUnit implements Repairable {
    @Override
    public Repairable repair(Repairable r) {
        return r;
    }
}

class Marin2 extends GroundUnit {
}

class Scv extends GroundUnit implements Repairable {
    @Override
    public Repairable repair(Repairable r) {
        return r;

    }
}

class Tank2 extends GroundUnit implements Repairable {
    @Override
    public Repairable repair(Repairable r) {
        return r;
    }
}

/////관련없는 공중유닛과 지상유닛중 수리 가능 하게만든다.
interface Repairable {
    Repairable repair(Repairable r);
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        Repairable r1 = new Scv();
        Repairable r2 = new DropShip2();
        Repairable r3 = new Tank2();
        System.out.println(r1.repair(new Scv())) ;
        r2.repair(new DropShip2());
        r3.repair(new Tank2());

    }
}
