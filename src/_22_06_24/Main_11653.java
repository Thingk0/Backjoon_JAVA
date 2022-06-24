package _22_06_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11653 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= N; i++) {
            for (;;) {
                if (N % i == 0) {
                    N /= i;
                    sb.append(i).append("\n");
                } else {
                    break;
                }
            }
        }

        System.out.println(sb.toString());
    }
}
