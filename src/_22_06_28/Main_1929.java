package _22_06_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        Eratosthenes(num1, num2);
    }

    public static void Eratosthenes(int n1, int n2) {
        boolean[] prime = new boolean[n2 + 1];

        StringBuilder sb = new StringBuilder();

        for(int i = 2; i <= n2; i++)
            // 2 ~ n2 모두 true 로 초기화.
            prime[i] = true;

        // 제곱근 구하기
        int root = (int) Math.sqrt(n2);

        for(int i = 2; i <= root; i++){
            // i 번째의 수가 소수일 때
            if( prime[i] ){
                // i 번째 소수의 배수들을 전부 false 로 초기화 => 배수는 소수가 아님.
                for(int j = i; i * j <= n2; j++)
                    prime[i * j]=false;
            }
        }

        for (int i = n1; i <= n2; i++) {
            if (prime[i])
                sb.append(i).append("\n");
        }

        System.out.println(sb.toString());
    }
}
