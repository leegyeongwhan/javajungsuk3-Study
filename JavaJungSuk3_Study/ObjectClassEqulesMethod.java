package JavaJungSuk3_Study;

public class ObjectClassEqulesMethod {
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
  int value = 0;

  Value(int value) {
    this.value = value;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Value)) {  //object타입이라 형변환 체크를 해줘야함
      return false;
    } else {
      Value v = (Value) obj;
    }
    return this.value == value;
  }
}
