package JavaJungSuk3_Study;

class Parent {
  void parentMethod() {
  }
}

class Child extends Parent {
  @Override
  @Deprecated
  void parentMethod() {
  }
}

@FunctionalInterface // 함수형인터페이스는 하나의 추상메서드만
interface Testable {
  void test();
  // void check();
}

public class Ex12_7 {
  public static void main(String[] args) {

  }
}
