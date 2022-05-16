package JavaJungSuk3_Study.Exercise.ch06;

public class Exercise6_20 {
  /*
(1) shuffle . 메서드를 작성하시오
*/
  static int[] shuffle(int[] arr) {
    int[] answer = new int[arr.length];
    int maxIndex = arr.length - 1;
    int randomNum = 0;
    for (int i = 0; i < arr.length; i++) {
      randomNum = (int) ((Math.random() * 9) + 1);
      answer[i] = randomNum;
      System.out.println("첫번쨰"+i);
      for (int j = 0; j < i; j++) {
        if (answer[i] == answer[j]) {
          System.out.println("두번쨰 "+i);
//          System.out.println("j"+j);
//          System.out.println(answer[j]);
          i--;
          System.out.println("2-2="+i);
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(java.util.Arrays.toString(original));
    int[] result = shuffle(original);
    System.out.println(java.util.Arrays.toString(result));
  }
}
