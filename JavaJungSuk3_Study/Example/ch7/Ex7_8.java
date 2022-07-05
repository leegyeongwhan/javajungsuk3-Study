package JavaJungSuk3_Study.Example.ch7;

import java.sql.PreparedStatement;

public class Ex7_8 {
    public static void main(String[] args) {
        MyBuyer myBuyer = new MyBuyer();
        myBuyer.buy(new MyComputer());
        myBuyer.buy(new MyTv());
    }
}


class MyProduct {
    int price;

    MyProduct(int price) {
        this.price = price;
    }

}

class MyTv extends MyProduct {
    MyTv() {
        super(100);
    }
}

class MyComputer extends MyProduct {
    MyComputer() {
        super(200);
    }
}

class MyBuyer {
    int price;
    int bonusPoint;

    void buy(MyProduct product) {

    }
}