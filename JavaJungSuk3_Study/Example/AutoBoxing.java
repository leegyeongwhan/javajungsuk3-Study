package JavaJungSuk3_Study.Example;

import java.util.ArrayList;

public class AutoBoxing {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(new Integer(100)); ///원래는 이게정석 list 에는 객체만 추가가능했음
    list.add((100));  // jdk1.5부터는됨 오토박싱
   // Integer i = list.get(0); //
    int  i = list.get(0).intValue(); // 원래는 integer 를 int로바꿨어여함언박싱

  }
}
