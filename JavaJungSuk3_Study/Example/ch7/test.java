package JavaJungSuk3_Study.Example.ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
  public static void main(String[] args) {
    Button b = new Button("Star");
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent Occurred");
      }
    });
  }
}

