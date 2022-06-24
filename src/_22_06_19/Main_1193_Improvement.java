package _22_06_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1193_Improvement {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 1;

        while(true) {
            if(cnt >= N) {
                if(cnt % 2 == 0) {
                    System.out.println(N+ "/" + (cnt + 1 - N));
                    break;
                }
                else {
                    System.out.println((cnt + 1 - N)+ "/" + N);
                    break;
                }
            }
            else {
                N -= cnt;
                cnt++;
//                System.out.printf("N: %d, cnt: %d\n", N, cnt);
            }
        }

    }
}