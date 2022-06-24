package _22_06_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        Eratosthenes(num1, num2);
    }

    public static void Eratosthenes(int n1, int n2) {
        boolean[] prime = new boolean[n2 + 1];

        int sum = 0;
        int min = n2;

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

        for (int j = n1; j <= n2; j++) {
            if (prime[j]) {
                sum += j;

                if (min > j)
                    min = j;
            }

        }

        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
