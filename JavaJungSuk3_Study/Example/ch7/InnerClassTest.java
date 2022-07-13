package JavaJungSuk3_Study.Example.ch7;

class AA {
    int i = 0;
    BB b = new BB();

    class BB {
        void method(){
            System.out.println("i = " + i);
        }
    }
}


public class InnerClassTest {
}
