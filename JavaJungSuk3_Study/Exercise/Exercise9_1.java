package JavaJungSuk3_Study.Exercise;

public class Exercise9_1 {
    public static void main(String[] args) {
        SutdaCard1 c1 = new SutdaCard1(3, true);
        SutdaCard1 c2 = new SutdaCard1(3, true);
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c1.equals(c2):" + c1.equals(c2));
    }
}

class SutdaCard1 {
    int num;
    boolean isKwang;

    SutdaCard1() {
        this(1, true);
    }

    SutdaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
/*
(1) num, isKwang 매개변수로 넘겨진 객체의 과
멤버변수 을 비교하도록 오버라이딩 하시오 num, isKwang .
*/
        if (!(obj instanceof SutdaCard1)) {
            SutdaCard1 sc = (SutdaCard1) obj;
            return this.num == sc.num && this.isKwang == sc.isKwang;
        }
        return false;

    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }

}
