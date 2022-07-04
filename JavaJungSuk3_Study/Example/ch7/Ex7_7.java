package JavaJungSuk3_Study.Example.ch7;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = new FIreEngine();
        FIreEngine fIreEngine = new FIreEngine();
        //불가   car.brrr();
        car.drive();  //리모콘이 car
        car.stop();

        fIreEngine.brrrr();

        Car car1 = null;
        car1 = fIreEngine;
       //불가 car1.brrrr();
        FIreEngine fIreEngine2 = null;
        fIreEngine2 = fIreEngine;
        fIreEngine2.brrrr();
        fIreEngine2 = (FIreEngine) car1;
        fIreEngine2.brrrr();

        //조심하자 실제 가르키는 인스턴스 는 car라서 오류가난다
        //컴파일 단계는 통고한다
        Car c = new Car();
        FIreEngine fe = (FIreEngine) c;
        fe.brrrr();
    }
}

class FIreEngine extends Car {
    void brrrr() {

    }
}

class Car {
    void drive() {

    }

    void stop() {

    }
}

class SportsCar {
    void drive() {

    }

    void stop() {

    }

    void speed() {

    }
}
