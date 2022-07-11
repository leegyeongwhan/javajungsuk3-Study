package JavaJungSuk3_Study.Example.ch12;


import java.util.ArrayList;
import java.util.List;

class Product {

}

class Tv extends Product {

}

class Audio extends Product {

}

public class Ex12_1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        list.add(new Tv());
        list.add(new Audio());

        Tv t = (Tv) list.get(0); //list.get의 반환 타입이 product 기떄문에 Tv 변수에 담으려면 형변환을 해줘야함
    }
}
