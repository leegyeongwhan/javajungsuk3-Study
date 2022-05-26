package JavaJungSuk3_Study.Exercise;

import java.util.Stack;

class MyTv3 {
/*
(1) 7-10 MyTv2 gotoPrevChannel . 문제 의 클래스에 메서드를 추가하여 완성하시오
*/
private boolean isPowerOn;
  private int channel;
  private int volume;
  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  public void setChannel(int channel) { //매개변수가 잇는 메서드는 유효성 검사를 잊지말고 해주자
    if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
      return;
    this.channel = channel;
  }

  public int getChannel() {
    return channel;
  }

  public void setVolume(int volume) {
    if (volume > MAX_VOLUME || volume < MIN_VOLUME)
      return;
    this.volume = volume;
  }

  public int getVolume() {
    return volume;
  }

  void gotoPrevChannel(){

  }
}
class Exercise7_11 {
  public static void main(String args[]) {
    MyTv3 t = new MyTv3();
    t.setChannel(10);
    System.out.println("CH:"+t.getChannel());
    t.setChannel(20);
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());
  }
}
