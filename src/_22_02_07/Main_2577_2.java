package _22_02_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2577_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = String.valueOf(A*B*C);

        int[] digits = new int[10];

        for (int i=0; i<result.length(); i++) {
            int idx = result.charAt(i) - '0';
            digits[idx]++;
        }

        for (int num: digits)
            System.out.println(num);
    }
}
