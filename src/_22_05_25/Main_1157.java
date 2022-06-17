package _22_05_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1157 {

    static int INDEX;
    static int MAX = 0;
    static boolean isDuplicate = false;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabetCount = new int[26];
        char[] word = br.readLine().toLowerCase().toCharArray();

        for (char ch: word)
            alphabetCount[(int) ch - 97]++;

        for (int i = 0; i < alphabetCount.length; i++) {

            if (alphabetCount[i] > MAX) {
                MAX = alphabetCount[i];
                INDEX = i;
                isDuplicate = false;
            }

            else if (alphabetCount[i] == MAX)
                isDuplicate = true;
        }

        if (isDuplicate)
            System.out.println("?");
        else
            System.out.println((char) (INDEX+65));

    }
}
