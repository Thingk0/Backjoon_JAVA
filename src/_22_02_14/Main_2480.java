package _22_02_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        int max = 0;

        if ( num1 == num2 && num1 == num3) {
            System.out.println(10000 + num1 * 1000);
        } else if (num1 == num2) {
            System.out.println(1000 + num1 * 100);
        } else if (num2 == num3) {
            System.out.println(1000 + num2 * 100);
        } else if (num3 == num1) {
            System.out.println(1000 + num3 * 100);
        }  else {

            if (num1 > max)
                max = num1;
            if (num2 > max)
                max = num2;
            if (num3 > max)
                max = num3;

            System.out.println(max * 100);
        }
    }
}
