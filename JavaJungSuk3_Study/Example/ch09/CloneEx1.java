package JavaJungSuk3_Study.Example.ch09;

import JavaJungSuk3_Study.Exercise.ObjectClassEqulesMethod;

class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + " ,y =" + y;
    }
    public Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e){
        }
        return obj;
    }
}

public class CloneEx1 {
    public static void main(String[] args) {
        Point orginal = new Point(3,5);
        Point copy = (Point) orginal.clone();
        System.out.println(orginal);
        System.out.println(copy);
    }
}
