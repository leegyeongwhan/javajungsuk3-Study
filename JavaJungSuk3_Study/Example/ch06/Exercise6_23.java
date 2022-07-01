package JavaJungSuk3_Study.Example.ch06;

import java.util.Arrays;

public class Exercise6_23 {
  static int max(int[] arr) {
    int answer = 0;
    // int[] arr1 = new int[arr.length];
    if (arr == null || arr.length == 0) {
      return -99999;
    }
    int max = arr[0];
    Arrays.sort(arr);
    answer = arr[arr.length - 1];
    return answer;
  }

  public static void main(String[] args) {
    int[] data = {3, 2, 9, 4, 7};
    System.out.println(java.util.Arrays.toString(data));
    System.out.println(" :최대값" + max(data));
    System.out.println(" :최대값" + max(null));
    System.out.println(" :최대값" + max(new int[]{})); // 0 최대값 크기가 인 배열
  }
}
