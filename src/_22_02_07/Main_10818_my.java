package _22_02_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10818_my {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] numArray = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(Arrays.stream(numArray).min().getAsInt()).append(" ").append(Arrays.stream(numArray).max().getAsInt());
        System.out.println(sb);
    }
}
