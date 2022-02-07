package _22_02_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10818_ans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if ( num > max)
                max = num;
            if ( num < min)
                min = num;
        }

        System.out.println(min + " " + max);
    }
}
