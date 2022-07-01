package JavaJungSuk3_Study.Example.ch06;

public class Exercise6_22 {
  /*
(1) isNumber . 메서드를 작성하시오
*/
  static boolean isNumber(String str) {
    final int len = str.length();
    if (str.equals("") || str == null) {
      return false;
    }

    for (int i = 0; i < len; i++) {
      if (str.charAt(i) < '0' || str.charAt(i) > '9') {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "123";
    System.out.println(str + "  는 숫자입니까" + isNumber(str));

    str = "1234o";
    System.out.println(str + "  는 숫자입니까" + isNumber(str));

  }
}
