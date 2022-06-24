package _22_06_17;

import java.io.IOException;

public class Main_2941 {
    public static void main(String[] args) throws IOException {

        int count = 0;
        int prev_word = 0;
        int prev_prev_word = 0;

        int alphabet = System.in.read();
        while (alphabet != 10) {
            // z
            if (alphabet == 122) {
                // 이전 문자가 d가 아닐 경우만,
                if (!(prev_word == 100)) {
                    count++;
                    prev_prev_word = 0;
                } else {
                    // 뒤에 = 가 나올 수 있으니 이전 문자인 d를 잠깐 이이전 문자에 임시 저장.
                    prev_prev_word = prev_word;
                    // 뒤에서 = 가 안나올 수 있으니 일단 카운트 +1
                    count++;
                }
            }

            // j
            else if (alphabet == 106) {
                // lj, nj 가 안되었기 때문에 그냥 카운트+1 하고 패스.
                if (!(prev_word == 108 || prev_word == 110)) {
                    count++;
                }
            }

            // =
            else if (alphabet == 61) {
                // 이_이전이 d 이고 이전이 z 일 경우 dz= 가 완성.
                // d 에서 이미 카운트 +1 을 했기 때문에 어떠한 작업도 x.
                // 이_이전 문자는 다시 초기화.
                if (prev_prev_word == 100 && prev_word == 122){
                    // 초기화
                    prev_prev_word = 0;
                    // d 랑 z 에서 카운트 + 2를 했으니 중복 제거로 -1
                    count--;
                }
            }


            // 나머지 문자는 그냥 카운트 + 1
            else {
                // - 는 카운트 단어 취급x
                if (!(alphabet == 45))
                    count++;
            }

            // 이전 문자에 잠시 저장.
            prev_word = alphabet;

            alphabet = System.in.read();
        }

        System.out.println(count);
    }
}
