package JavaJungSuk3_Study.Example.ch11;

import java.util.ArrayList;

public class VectirEx1 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("1");
    list.add("2");
    list.add("3");
    print(list);
  }

  public static void print(ArrayList list){
    System.out.println(list);
    System.out.println("list size="+list.size());
  }
}
