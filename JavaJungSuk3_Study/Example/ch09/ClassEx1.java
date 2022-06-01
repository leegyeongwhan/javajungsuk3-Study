package JavaJungSuk3_Study.Example.ch09;

final class Card {
    String kind;
    int num;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}

public class ClassEx1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Card c1 = new Card("HERART",3);
        Card c2 = Card.class.newInstance();

        Class cObj = c1.getClass();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
