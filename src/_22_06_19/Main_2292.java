package _22_06_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int starting_value = 2;
        int magnification = 0;
        int result = 1;

        while (N >= starting_value + (6 * magnification)) {
            starting_value += (6 * magnification++);
            result++;
        }

        br.close();
        System.out.println(result);
    }
}
