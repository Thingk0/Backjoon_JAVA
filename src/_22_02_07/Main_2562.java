package _22_02_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int max = Integer.MIN_VALUE;
        int num, idx = 0;

        for (int i=0; i<9; i++) {
            num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                idx = i+1;
            }
        }

        br.close();
        sb.append(max).append("\n").append(idx);
        System.out.println(sb);

    }
}
