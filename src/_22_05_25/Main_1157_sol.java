package _22_05_25;

import java.io.IOException;

public class Main_1157_sol {
    public static void main(String[] args) throws IOException {
        // 알파벳 26개 들어갈 배열 선언
        int[] arr = new int[26];

        int c = System.in.read();
        while (c > 64) {
            if (c < 91) { // 대문자
                arr[c - 'A']++;
            } else {    // 소문자
                arr[c - 'a']++;
            }
            c = System.in.read();
        }


        int max = -1;   // 최대값
        int ch = -2;    // 아스키코드로 A 보다 2만큼 낮음 => 63

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ch = i;
            } else if (max == arr[i]) {
                ch = -2;
            }
        }

        System.out.println((char)(ch+65));

    }
}