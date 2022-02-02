package _22_02_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            for (int k=N-i-1; k > 0; k--){
                sb.append(" ");
            }
            for(int j=0; j <= i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
