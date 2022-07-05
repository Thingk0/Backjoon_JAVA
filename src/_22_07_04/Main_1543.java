package _22_07_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String document = new StringBuilder(br.readLine()).toString();
        String word = new StringBuilder(br.readLine()).toString();

        int leng = document.length();
        document = document.replace(word, "");

        System.out.println((leng - document.length()) / word.length());
    }
}
