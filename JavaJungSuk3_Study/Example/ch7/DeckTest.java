package JavaJungSuk3_Study.Example.ch7;

class DeckTest {


  public static void main(String[] args) {
    Deck d = new Deck();
    Card c = d.pick(0);
    System.out.println(c);
  }
}

class Deck {
  final int CARD_NUM = 52;
  Card cardArr[] = new Card[CARD_NUM];

  Deck() {
    int i = 0;

    for (int k = Card.KIND_MAX; k > 0; k--) {
      for (int n = 0; n < Card.NUM_MAX; n++) {
        cardArr[i++] = new Card(k, k + 1);
      }
    }
  }

  Card pick(int index) {
    return cardArr[index];
  }

}

class Card {
  static final int KIND_MAX = 4;
  static final int NUM_MAX = 13;

  static final int SPADE = 4;
  static final int DIAMOND = 3;
  static final int HEART = 2;
  static final int CLOVER = 1;

  int kind;
  int number;

  Card() {
    this(SPADE, 1);
  }

  Card(int kind, int numer) {
    this.kind = kind;
    this.number = numer;
  }
  public String toString(){
    return kind+ "," + number;
  }
}