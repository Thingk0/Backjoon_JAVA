package _22_06_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            sb.append(Eratosthenes(n)).append("\n");
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb.toString());
    }

    public static int Eratosthenes(int num) {
        boolean[] prime = new boolean[num*2 + 1];

        int count = 0;

        for(int i = 2; i <= num*2; i++)
            prime[i] = true;

        int root = (int) Math.sqrt(num*2);

        for(int i = 2; i <= root; i++){
            if( prime[i] ){
                for(int j = i; i * j <= num*2; j++)
                    prime[i * j] = false;
            }
        }

        for (int k = num+1; k <= num*2; k++) {
            if (prime[k]) count++;
        }


        return count;
    }
}
