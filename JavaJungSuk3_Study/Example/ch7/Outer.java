package JavaJungSuk3_Study.Example.ch7;

public class Outer {
  private int outerIv = 0;
  public static int outerCv = 0;

  class InstabceInner {
    int iiv = outerIv;
    int iiv2 = outerCv;
  }

  static class StaticInner {
    static int scv = outerCv;
  }

  void myMethod() {
    int lv = 0;
    final int Lv = 0;
    class LocalInner {
      int liv = outerIv;
      int liv2 = outerCv;
      int liv3 = lv;
      int liv4 = Lv;
    }
  }
}
