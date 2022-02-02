package _21_12_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        System.out.println((score >= 90 && score <= 100) ? "A" : (score < 90 && score >= 80) ? "B" :
                (score < 80 && score >= 70) ? "C" : (score < 70 && score >= 60) ? "D" : "F");
    }
}
