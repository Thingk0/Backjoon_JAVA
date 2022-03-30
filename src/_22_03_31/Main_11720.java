package _22_03_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        br.readLine();
        String str = br.readLine();

        for (int i=0; i<str.length(); i++) {
            result += str.charAt(i) - '0';
        }

        System.out.println(result);
        br.close();

    }
}
