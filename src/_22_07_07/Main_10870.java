package _22_07_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10870 {

    public static int Fibonacci_number(int num) {
        return num >= 2 ? Fibonacci_number(num-1) + Fibonacci_number(num-2) : num == 1 ? 1 : 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(Fibonacci_number(N));
    }
}
