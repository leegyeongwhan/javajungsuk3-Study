
package JavaJungSuk3_Study;

class SutdaCard {
  int num;
  boolean isKwan = true;

  String info() {
    return num + (isKwan ? "K" : "");
  }

  SutdaCard(int num, boolean isKwan) {
    this.num = num;
    this.isKwan = isKwan;
  }

  SutdaCard() {
    this.num = (int) ((Math.random() * 9) + 1);
    this.isKwan = true;

 //   this(1,true);
  }
}


public class Exercise6_2 {
  public static void main(String args[]) {
    SutdaCard card1 = new SutdaCard(3, false);
    SutdaCard card2 = new SutdaCard();
    System.out.println(card1.info());
    System.out.println(card2.info());
  }
}

