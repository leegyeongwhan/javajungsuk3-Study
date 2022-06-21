package JavaJungSuk3_Study.Exercise;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Exercise11_16 {
    public static void main(String[] args) throws ParseException {
        String data = "123, 456, 789.5";
        /// 10진수 - # 0 조합 / 단위구분을 위한 , 추가
        DecimalFormat df = new DecimalFormat("#,###.##"); // 변환할 문자열의 형식을 지정
        DecimalFormat df2 = new DecimalFormat("#,####");

        Number num = df.parse(data);
        double d = num.doubleValue();
        System.out.println("data : " + data);
        System.out.println("반올림 :" + Math.round(d));
        System.out.println("만단위 :" + df2.format(d));
    }
}
