package _22_03_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1065_fail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int hanNum = 0;
        int cnt = 0;

        if ( X > 0 && X < 100 ) {
            hanNum = X;
        } else {
            hanNum = 99;

            for (int i=100; i<=X; i++) {
                cnt = 0;

                if (i == 1000)
                    break;

                int tempNum = i;
                int[] tempArr = new int[3];

                while (tempNum > 0) {
                    if (cnt >= 3)
                        break;

                    tempArr[cnt++] = tempNum % 10;
                    tempNum /= 10;
                }

                if ( tempArr[0]-tempArr[1] == tempArr[1]-tempArr[2] )
                    hanNum++;
            }

        }

        System.out.println(hanNum);

    }
}
