package _22_05_30;

import java.io.IOException;
import java.util.ArrayList;

public class Main_17413 {

    static ArrayList<Character> tempStringArray = new ArrayList<>();
    static StringBuilder result = new StringBuilder();

    // 임시 배열에 저장해 둔 문자열 거꾸로 result 에 추가하기.
    static void strReverse() {
        for (int i = tempStringArray.size()-1; i >= 0; i--) {

            // 마지막 인덱스부터 차례로 result 에 추가.
            result.append(tempStringArray.get(i));

            // result 에 추가한 문자는 임시 배열에거 제거.
            tempStringArray.remove(i);

        }
    }

    public static void main(String[] args) throws IOException {

        int word;
        boolean reverseOn = true;

        while (true) {
            word = System.in.read();

            // '<' 를 입력받았다면,
            if (word == 60) {
                // Reverse 해야할 문자열이 있다면,
                if (tempStringArray.size() != 0) strReverse();

                reverseOn = false;
                result.append((char) word);
            }

            // 공백을 입력받았다면,
            else if (word == 32) {
                // Reverse 해야할 문자열이 있다면,
                if (tempStringArray.size() != 0) strReverse();

                result.append((char) word);
            }

            // '>' 를 입력받았다면,
            else if (word == 62) {
                reverseOn = true;

                result.append((char) word);
            }

            // \n 개행 문자를 입력받음.
            else if (word == 10) {
                if (tempStringArray.size() != 0) strReverse();

                break;
            }

            // 문자를 입력받았다면,
            else {
                if (reverseOn) {
                    tempStringArray.add((char) word);
                } else {
                    result.append((char) word);
                }
            }

        }

        System.out.print(result.toString());
    }
}