package JavaJungSuk3_Study.Exercise;

class Exercise7_19 {
  public static void main(String args[]) {
    Buyer b = new Buyer();
    b.buy(new Tv1()); //100
    b.buy(new Computer());
    b.buy(new Tv1());
    b.buy(new Audio());
    b.buy(new Computer());
    b.buy(new Computer());
    b.buy(new Computer());
    b.summary();
  }
}

class Buyer {
  int money = 1000;
  Product1[] cart = new Product1[3]; // 구입한 제품을 저장하기 위한 배열
  int i = 0; // Product cart index 배열 에 사용될

  void buy(Product1 p) {
/*
(1) . 아래의 로직에 맞게 코드를 작성하시오
1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다
1.2 , 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
1.3 .(add )
*/
    if (money > p.price) {
      money -= p.price;
      add(p);
    } else {
      System.out.println("잔액이 부족하여" + p + "를살수없습니다");
      return;
    }
  }

  void add(Product1 p) {
/*
(2) . 아래의 로직에 맞게 코드를 작성하시오
1.1 i의 값이 장바구니의 크기보다 같거나 크면
1.1.1 2 . 기존의 장바구니보다 배 큰 새로운 배열을 생성한다
1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다
1.1.3 . 새로운 장바구니와 기존의 장바구니를 바꾼다
1.2 (cart) . i 1 . 물건을 장바구니 에 저장한다 그리고 의 값을 증가시킨다
*/

    if (cart.length <= i) {
      Product1[] cart1 = new Product1[cart.length * 2];
     // System.arraycopy(cart,0,tmp,0,cart.length);
      for (int j = 0; j < cart1.length; j++) {
        if (j < i) {
          cart1[j] = cart[j];
        }
      }
      cart = cart1;
    }
    cart[i++] = p;


//  if(i >= cart.length){
//    Product1[] cart1 = new Product1[cart.length*2];
//    for (int i =0 ; i<cart1.length; i++){
//        cart1[i] = cart[i];
//    }
//  }


  } // add(Product p)

  void summary() {
/*
(3) . 아래의 로직에 맞게 코드를 작성하시오
1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
1.3 물건을 사고 남은 금액 (money) . 물건을 사고 남은 금액 를 출력한다
*/
    System.out.print("구입한물건:");
    for (int i = 0; i < cart.length; i++) {
      System.out.print(cart[i] + ",");
    }
    System.out.println();
    System.out.println("사용한금액" + (1000 - money));
    System.out.println("남은금액=" + money);


//    String itemList ="";
//    int sum = 0;
//    for(int i=0; i < cart.length;i++) {
//      if(cart[i]==null)
//        break;
//// 1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
//      itemList += cart[i] + ",";
//// 1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
//      sum += cart[i].price;
//    }


  } // summary()
}

class Product1 {
  int price; // 제품의 가격

  Product1(int price) {
    this.price = price;
  }
}

class Tv1 extends Product1 {
  Tv1() {
    super(100);
  }

  public String toString() {
    return "Tv";
  }
}

class Computer extends Product1 {
  Computer() {
    super(200);
  }

  public String toString() {
    return "Computer";
  }
}

class Audio extends Product1 {
  Audio() {
    super(50);
  }

  public String toString() {
    return "Audio";
  }
}

