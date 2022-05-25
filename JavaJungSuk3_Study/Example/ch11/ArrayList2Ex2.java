package JavaJungSuk3_Study.Example.ch11;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayList2Ex2 {
  public static void main(String[] args) {


    final int LIMIT = 10;
    String souce = "0123456789abcdefghij";
    int lenght = souce.length();

    List list = new ArrayList(lenght / LIMIT + 10);

    for (int i = 0; i < lenght; i++) {
      if (i + LIMIT < lenght) {
        list.add(souce.substring(i, i + LIMIT));
      } else {
        list.add(souce.substring(i));
      }
    }

    for (int i = 0; i < list.size(); i += LIMIT) {
      System.out.println(list.get(i));
    }
  }

}