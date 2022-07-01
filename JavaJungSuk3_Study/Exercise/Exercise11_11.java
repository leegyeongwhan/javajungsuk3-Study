//package JavaJungSuk3_Study.Exercise;
//
//import JavaJungSuk3_Study.Exercise.ch9.SutdaCard1;
//
//import java.util.*;
//
//class SutdaCard {
//    int num;
//    boolean isKwang;
//
//    SutdaCard() {
//        this(1, true);
//    }
//
//    SutdaCard(int num, boolean isKwang) {
//        this.num = num;
//        this.isKwang = isKwang;
//    }
//
//    public boolean equals(Object obj) {
//        if (obj instanceof SutdaCard1) {
//            SutdaCard1 c = (SutdaCard1) obj;
//            return this.num == c.num && this.isKwang == c.isKwang;
//        } else {
//            return false;
//        }
//    }
//    @Override
//    public String toString() {
//        return num + (isKwang ? "K" : "");
//    }
//
//    @Override
//    public int hashCode() {
//        return toString().hashCode();
//    }
//}
//
//class Exercise11_11 {
//
//
//    public static void main(String[] args) {
//        SutdaCard1 c1 = new SutdaCard1(3, true);
//        SutdaCard1 c2 = new SutdaCard1(3, true);
//        SutdaCard1 c3 = new SutdaCard1(1, true);
//        HashSet set = new HashSet();
//        set.add(c1);
//        set.add(c2);
//        set.add(c3);
//        System.out.println(set);
//
//    }
//}