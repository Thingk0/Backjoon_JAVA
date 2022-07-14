package _22_07_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10872 {

    public static int factorial(int num) {
        return num > 1 ? num * factorial(num-1): 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }
}
