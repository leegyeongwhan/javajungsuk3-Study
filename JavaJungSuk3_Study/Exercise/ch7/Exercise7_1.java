package JavaJungSuk3_Study.Exercise.ch7;

class SutdaDeck {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

  SutdaDeck() {
/*
(1) SutdaCard . 배열 를 적절히 초기화 하시오
*/
    for (int i = 0; i < cards.length; i++) {
      int num = 0;
      num += i % 10 + 1;
      boolean iskwang;
      iskwang = i < 10 && (num == 3 || num == 1 || num == 8) ? true : false;
      cards[i] = new SutdaCard(num, iskwang);
    }
  }
}

class SutdaCard {
  int num;
  boolean isKwang;

  SutdaCard() {
    this(1, true);
  }

  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  // info() Object toString() . 대신 클래스의 을 오버라이딩했다
  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}

class Exercise7_1 {
  public static void main(String args[]) {
    SutdaDeck deck = new SutdaDeck();
    for (int i = 0; i < deck.cards.length; i++)
      System.out.print(deck.cards[i] + ",");
  }
}
