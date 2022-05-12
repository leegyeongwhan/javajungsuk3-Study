package JavaJungSuk3_Study;

class Product {
  int price;
  int bonusPoint;

  Product(int price) {
    this.price = price;
    bonusPoint = (int) (price / 10.0);
  }
}

class Tv1 extends Product {
  Tv1() {
    super(100);
  }

  public String toStirng() {
    return "Tv";
  }
}

class Computer extends Product {
  Computer() {
    super(200);
  }

  public String toStirng() {
    return "Computer";
  }
}


class Buyer {
  int money = 1000;
  int bonusPoint = 0;

  void buy(Product p) {
    if (money < p.price) {
      System.out.println();
      return;
    }
    money -= p.price;
    bonusPoint += p.bonusPoint;
    System.out.println(p + "을.를 구입하였습니다");
  }
}

public class Ex7_1 {
  public static void main(String[] args) {
    Buyer b = new Buyer();
    b.buy(new Tv1());
    b.buy(new Computer());

    System.out.println("현재남은돈은 " + b.money);
    System.out.println("현재 보너스 점수는 " + b.bonusPoint);
  }


}
