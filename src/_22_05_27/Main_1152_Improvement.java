package _22_05_27;

import java.io.IOException;

public class Main_1152_Improvement {
    public static void main(String[] args) throws IOException {

        // word 개수
        int count = 0;
        // 단어
        int word;
        // 공백
        int prev_word = 32;

        while (true) {
            word = System.in.read();

            // 공백을 입력받음.
            if (word == 32) {
                // 이전 문자가 공백이 아니라면
                if (prev_word != 32)
                    count++;
            }
            // \n 개행 문자를 입력받음.
            else if (word == 10) {
                // 이전 문자가 공백이 아니라면
                if (prev_word != 32)
                    count++;
                break;
            }

            // 루프 돌기전에 이전 문자에 방금 입력받은 문자를 저장.
            prev_word = word;

        }

        System.out.println(count);

    }
}
