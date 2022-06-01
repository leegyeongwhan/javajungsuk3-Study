package JavaJungSuk3_Study.Example.ch7;



//추상클래스는 상속을 통해 작성해야 객체 생성가능
abstract class Player {   //추상메서드를 가지고있으니까 추상클래스다  미완성 설계도 추상메서드를 가지고있는 클래스
    abstract void play(int pos);

    abstract void stop();      //추상메서드 선언부만 있고 구현부는 없는 메서드
}

class AudioPlayer extends Player{ //완성ㄷ왼 설계도

    @Override
    void play(int pos) {
        System.out.println(pos+"play버튼");
    }

    @Override
    void stop() {
        System.out.println("stopr버튼");
    }
}



public class PlayerTest {
    public static void main(String[] args) {
       // AudioPlayer p = new AudioPlayer();
        Player p = new AudioPlayer();    //
        p.play(100);
        p.stop();
    }

}
