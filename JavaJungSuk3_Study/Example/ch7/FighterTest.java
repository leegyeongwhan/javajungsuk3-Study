package JavaJungSuk3_Study.Example.ch7;


abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춥니다");
    }
}

interface Fightable {
    void move(int x, int y);

    void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {

    @Override
    public void move(int x, int y) {
        System.out.println(x + "," + y + "만큼 멈춥니다");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f + "공격");
    }

    Fightable fightable() {
        Fighter fighter = new Fighter();
        return fighter;
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Unit2 u = new Fighter();
        Fightable f = new Fighter();
        Fighter fighter = new Fighter();

        u.move(2, 3);
        u.stop();

        f.attack(new Fighter());
        f.move(100, 200);

        fighter.stop();
        fighter.move(100, 200);
        Fightable fightable = fighter.fightable();
    }


}
