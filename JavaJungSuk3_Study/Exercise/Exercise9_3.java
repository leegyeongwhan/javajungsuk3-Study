package JavaJungSuk3_Study.Exercise;

class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";
/*
(1) . 알맞은 코드를 넣어 완성하시오

*/
        String[] arr = path.split("'\\'");
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("fullPath:" + fullPath);
        System.out.println("path:" + path);
        System.out.println("fileName:" + fileName);
    }
}