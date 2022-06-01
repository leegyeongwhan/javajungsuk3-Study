package JavaJungSuk3_Study;

class MyPoint {
  int x;
  int y;

  MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }
  double getDistance(int x1, int y1) {
    //Math.abs 절대값 구하는 메서드  제곱할떄 Math.pow도가능
    double dap = Math.abs((this.x - x1) * (this.x - x1)) + Math.abs((this.y - y1) * (this.y - y1));
    dap = Math.sqrt(dap);
    return dap;
  }
}
class _6_7 {
  public static void main(String args[]) {
    MyPoint p = new MyPoint(1,1);
// p (2,2) . 와 의 거리를 구한다
    System.out.println(p.getDistance(2,2));
  }
}
