package JavaJungSuk3_Study.Exercise;

import java.util.*;

class SutdaDeck {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

  SutdaDeck() {
    for (int i = 0; i < cards.length; i++) {
      int num = i % 10 + 1;
      boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
      cards[i] = new SutdaCard(num, isKwang);
    }
  }

  void shuffle() {
    for (int i = 0; i < cards.length * 20; i++) {
      int j = (int) Math.random() * cards.length;
      int z = (int) Math.random() * cards.length;

      SutdaCard tmp = cards[j];
      cards[j] = cards[z];
      cards[z] = tmp;

    }
  }


  SutdaCard pick(int index) {
//    SutdaCard st = cards[index];
//    return st;

    if (index < 0 || index >= CARD_NUM) // index . 의 유효성을 검사한다
      return null;
    return cards[index];
  }

  SutdaCard pick() {
//    SutdaCard st = cards[(int) (Math.random() * 20)];
//    return st;

    int index = (int) (Math.random() * cards.length);
    return pick(index); // pick(int index) . 를 호출한다
  }

} // SutdaDeck


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

  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}

class Exercise7_2 {
  public static void main(String args[]) {
    SutdaDeck deck = new SutdaDeck();
//    //suffle전
//    for (int i = 0; i < deck.cards.length; i++) {
//      System.out.print(deck.cards[i] + ",");
//    }
    System.out.println();
    System.out.println(deck.pick(0));
    System.out.println(deck.pick());
    deck.shuffle();
    for (int i = 0; i < deck.cards.length; i++)
      System.out.print(deck.cards[i] + ",");
    System.out.println();
    System.out.println(deck.pick(0));

//    int a[] = new int[5];
//    List<Integer> list = new ArrayList<>();
//    Random r = new Random();
//    for(int i=0;i<=4;i++)
//    {
//      System.out.println("i="+i);
//      a[i] = r.nextInt(10)+1;
//      for(int j=0;j<i;j++)
//      {
//        if(a[i]==a[j])
//        {
//          System.out.println("i==j="+i);
//          i--;
//          System.out.println("i--후="+i);
//        }
//      }
//    }
//    for (int value : a) {
//      list.add(value);
//    }
//    System.out.println(list);
  }
}
