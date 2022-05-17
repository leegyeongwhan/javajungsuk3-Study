package JavaJungSuk3_Study.Exercise.ch06;

public class Exercise6_24 {
  /*
(1) abs . 메서드를 작성하시오
*/
  static int abs(int num) {
    int answer = 0;
//     answer = Math.abs(num);
    return num <= 0 ? num *= -1 : num;
  }

  public static void main(String[] args) {
    int value = 5;
    System.out.println(value + " :   의 절대값" + abs(value));

    value = -10;
    System.out.println(value + " :  의 절대값" + abs(value));

  }

}
