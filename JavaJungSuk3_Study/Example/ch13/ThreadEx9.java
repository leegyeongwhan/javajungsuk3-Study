//package JavaJungSuk3_Study.Example.ch13;
//
//
//public class ThreadEx9 {
//    public static void main(String[] args) throws Exception {
//        ThreadGroup main = Thread.currentThread().getThreadGroup();
//        ThreadGroup grp1 = new ThreadGroup("Group1");
//        ThreadGroup grp2 = new ThreadGroup("Group2");
//
//        ThreadGroup subGrp1 = new ThreadGroup(grp1,"SubGroup1");
//
//        grp1.setMaxPriority(3);
//
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                }catch (InterruptedException e){
//
//                }
//            }
//        }
//    }
//}
//
//
//class ThreadEx8_1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 300; i++) {
//            System.out.printf("-");
//            for (int x = 0; x < 1000000; x++) ;
//        }
//    }
//}
//
//class ThreadEx8_2 extends Thread {
//    public void run() {
//        for (int i = 0; i < 300; i++) {
//            System.out.printf("|");
//            for (int x = 0; x < 1000000; x++) ;
//        }
//    }
//}