package _22_07_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9020_Important {
    public static boolean[] prime = new boolean[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        get_prime();

        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int num1 = num / 2;
            int num2 = num / 2;

            while (true) {
                // 둘 다 소수일 경우,
                if (!prime[num1] && !prime[num2]) {
                    sb.append(num1).append(' ').append(num2).append('\n');
                    break;
                }

                num1--;
                num2++;
            }
        }

        System.out.print(sb.toString());
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
