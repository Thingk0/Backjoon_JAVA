package _22_02_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2525 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken()); // 시간
        int minute = Integer.parseInt(st.nextToken()); // 분
        int timer = Integer.parseInt(br.readLine()); // 타이머
        int overTime = 0;

        if ((0 <= hour && hour <= 23) && (0 <= minute && minute <= 59)) {
            overTime = ( minute + timer ) / 60;
            hour += overTime;
            minute =  ( minute + timer ) - 60 * overTime;

            if ( hour > 23 )
                hour -= 24;
        }

        System.out.printf("%d %d", hour, minute);
    }
}
