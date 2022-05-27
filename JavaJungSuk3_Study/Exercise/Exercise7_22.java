package JavaJungSuk3_Study.Exercise;

abstract class Shape {
  Point p;

  Shape() {
    this(new Point(0, 0));
  }

  Shape(Point p) {
    this.p = p;
  }

  abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

  Point getPosition() {
    return p;
  }

  void setPosition(Point p) {
    this.p = p;
  }
}

class Point {
  int x;
  int y;

  Point() {
    this(0, 0);
  }

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "[" + x + "," + y + "]";
  }
}

class Circle extends Shape {
  double r = 0;

  Circle(double r) {
    this(new Point(0, 0), r);
  }

  public Circle(Point point, double r) {
    super(point);
    this.r = r;
  }

  @Override
  double calcArea() {
    return (r * r) * Math.PI;
  }
}

class Rectangle extends Shape {
  double width = 0;
  double height = 0;

  Rectangle(int width, int height) {
    this(new Point(0, 0), width, height);
  }

  Rectangle(Point point, int width, int height) {
    super(point);
    this.width = width;
    this.height = height;
  }

  boolean isSquare() {
    if (width == height) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  double calcArea() {
    return (width * height);
  }
}

class testShape {
  static double sumArea(Shape[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i].calcArea();
    }
    return sum;
  }

  public static void main(String[] args) {
      Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
    System.out.println(" :" + sumArea(arr));
  }
}
