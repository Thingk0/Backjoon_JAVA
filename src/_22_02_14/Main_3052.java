package _22_02_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> numbers = new HashSet<>(10);
        int temp = 0;

        for (int i = 0; i < 10; i++) {
            temp = Integer.parseInt(br.readLine());
            numbers.add(temp % 42);
        }
        br.close();
        System.out.println(numbers.size());
    }
}
