package _22_06_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4948_Improvement {

    public static boolean[] prime = new boolean[123456 * 2 + 1];
    public static int[] count_arr = new int[123456 * 2 + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        get_prime();
        get_count();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            // n 부터 2n 까지의 소수의 개수이므로, 중복 제거
            sb.append(count_arr[2 * n] - count_arr[n]).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i)
                prime[j] = true;
        }
    }

    public static void get_count() {
        int count = 0;
        for (int i = 2; i < prime.length; i++) {
            if(!prime[i]) count++;
            count_arr[i] = count;
        }
    }
}
