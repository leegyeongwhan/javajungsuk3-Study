package JavaJungSuk3_Study;

public class _6_6 {
  // (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
  static double getDistance(int x, int y, int x1, int y1) {
    //Math.abs 절대값 구하는 메서드  제곱할떄 Math.pow도가능
    double dap = Math.abs((x - x1) * (x - x1)) + Math.abs((y - y1) * (y - y1));
      dap = Math.sqrt(dap);
      return dap;
  }

  public static void main(String args[]) {
    System.out.println(getDistance(1, 1, 2, 2));
  }
}