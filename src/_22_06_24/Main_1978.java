package _22_06_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());

            if (Eratosthenes(temp))
                count++;
        }

        br.close();
        System.out.println(count);
    }

    public static boolean Eratosthenes(int n) {
        boolean[] prime = new boolean[n+1];

        for(int i = 2; i <= n; i++)
            // 2 ~ n 모두 true 로 초기화.
            prime[i] = true;

        // 제곱근 구하기
        int root = (int) Math.sqrt(n);

        for(int i = 2; i <= root; i++){
            // i 번째의 수가 소수일 때
            if( prime[i] ){
                // i 번째 소수의 배수들을 전부 false 로 초기화 => 배수는 소수가 아님.
                for(int j = i; i * j <= n; j++)
                    prime[i * j]=false;
            }
        }

        // 숫자 n 이 소수라면 true.
        return prime[n];
    }
}
