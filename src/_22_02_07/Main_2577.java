package _22_02_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = String.valueOf(A*B*C);

        int[] digits = new int[10];

        for (int i=0; i<result.length(); i++) {
            switch (result.charAt(i) - 48) {
                case 0:
                    digits[0]++;
                    break;
                case 1:
                    digits[1]++;
                    break;
                case 2:
                    digits[2]++;
                    break;
                case 3:
                    digits[3]++;
                    break;
                case 4:
                    digits[4]++;
                    break;
                case 5:
                    digits[5]++;
                    break;
                case 6:
                    digits[6]++;
                    break;
                case 7:
                    digits[7]++;
                    break;
                case 8:
                    digits[8]++;
                    break;
                case 9:
                    digits[9]++;
                    break;
            }
        }

        for (int num: digits)
            System.out.println(num);

    }
}
