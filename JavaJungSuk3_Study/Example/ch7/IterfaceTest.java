package JavaJungSuk3_Study.Example.ch7;

class A {
//    public void method(B b){
//
//    }
//
    public void method(I i) {
        i.metohd();
    }
}

class B implements I {
    @Override
    public void metohd() {
        System.out.println("b메서드");
    }

}

class C implements I{
    @Override
    public void metohd() {
        System.out.println("C메서드");

    }

}

//클래스간의 결합이 아닌 인터페이스로 연결해주면 인터페이스를 구현한
//클래스만 올 수 있으니 인터페이스는 변경이없다
interface I {
    void metohd();

}


public class IterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C());
    }
}
