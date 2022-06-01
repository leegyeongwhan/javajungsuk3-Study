package JavaJungSuk3_Study.Example.ch09;

class Cicle implements Cloneable {
    Point p;
    double r;

    Cicle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Cicle shallowCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return (Cicle) obj;
    }

    public Cicle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }

        Cicle c = (Cicle) obj;
        c.p = new Point(this.p.x, this.p.y);
        return c;
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Cicle c1 = new Cicle(new Point(1, 1), 2.0);
        Cicle c2 = c1.shallowCopy();  //c1 과 c2 는 같은 주소를 가진다
        Cicle c3 = c1.deepCopy();

        System.out.println("c1" + c1);
        System.out.println("c2" + c2);
        System.out.println("c3" + c3);

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("변경후");
        System.out.println("c1" + c1);
        System.out.println("c2" + c2);
        System.out.println("c3" + c3);
    }
}
