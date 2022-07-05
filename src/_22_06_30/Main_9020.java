package _22_06_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9020 {

    public static boolean[] prime = new boolean[10000 * 2 + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        get_prime();

        while (testCase > 0) {
            int n = Integer.parseInt(br.readLine());
            partition(n);

            testCase--;
        }
    }

    public static void partition(int num) {
        for (int i = 2; i < num; i++) {
            if (!prime[i]) {
                for (int j = i; j < num; j++) {
                    
                }
            }
        }
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i)
                prime[j] = true;
        }
    }
}
