package JavaJungSuk3_Study.Exercise;

class Product
{
  int price; // 제품의 가격
  int bonusPoint; // 제품구매 시 제공하는 보너스점수
  Product(int price) {
    this.price = price;
    bonusPoint =(int)(price/10.0);
  }
}
class Tv extends Product1 {
  Tv() {
    super(1000);
  }
  public String toString() {
    return "Tv";
  }
}
class Exercise7_5 {
  public static void main(String[] args) {
    Tv t = new Tv();
  }
}
