package _22_02_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer N_X = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(N_X.nextToken());
        int X = Integer.parseInt(N_X.nextToken());

        StringTokenizer sequenceA = new StringTokenizer(br.readLine());
       for (int i=0; i<N; i++) {
           int num = Integer.parseInt(sequenceA.nextToken());
           if (num < X)
               sb.append(num).append(" ");
       }

        System.out.println(sb.toString());
        br.close();
    }
}
