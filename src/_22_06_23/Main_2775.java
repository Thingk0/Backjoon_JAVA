package _22_06_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        int floor;
        int number;

        for (int i = 0; i < testCase; i++) {
            floor = Integer.parseInt(br.readLine());
            number = Integer.parseInt(br.readLine());

            int[] result = new int[number];
            for (int j = 0; j < result.length; j++)
                result[j] = j+1;


            for (int k = 1; k <= floor; k++) {
                for (int n = 1; n < number; n++) {
                    result[n] += result[n-1];
                }
            }

            sb.append(result[number-1]).append("\n");
        }

        System.out.println(sb.toString());
    }
}


// 0층 => 1 / 2 / 3 / 4 / 5
// 1층 => 1 / 3 / 6 / 10 / 15
// 2층 => 1 / 4 / 10 / 20 / 35
// 3층 => 1 / 5 / 15 / 35 / 70
// 4층 => 1 / 6 / 21 / 56 / 126
// 5층 => 1 / 7 / 28 / 84 / 210


// 103호 => 001호 + 002호 + 003호

// 303호 => 302호 + 203호
//      => 301호 + 202호 + 202호 + 103호
//      => 301호 + 201호 + 201호 + 102호 + 102호 + 102호 + 003호
//      => 301호 + 201호 + 201호 + 003호 + 101호 + 002호 + 101호 + 002호 + 101호 + 002호
//      => 1 + 1 + 1 + 3 + 1 + 2 + 1+ 2+ 1 + 2
//      => 15

