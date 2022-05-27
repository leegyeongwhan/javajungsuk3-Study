package JavaJungSuk3_Study.Exercise;

class Outer {
  class Inner {
    int iv = 100;
  }

  static class Inner1 {

    int iv = 200;

  }
}

class Exercise7_25 {
  public static void main(String[] args) {
/*
(1) . 알맞은 코드를 넣어 완성하시오
*/
//    Outer o = new Outer();
//    Outer.Inner i = o.new Inner();
//    System.out.println();

    Outer.Inner1 i = new Outer.Inner1();
  }
}
