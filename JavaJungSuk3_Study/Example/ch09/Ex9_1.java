package JavaJungSuk3_Study.Example.ch09;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        if (v1.equals(v2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }

}


class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Value)) {
            return false;
        }
        Value v = (Value) obj;
        return this.value == v.value;
    }
}