package _22_06_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {

    static int COUNT = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // N번 단어 하나하나씩 체크.
        for (int i = 0; i < N; i++)  {
            String str = br.readLine();
            if (isGroup(str))
                COUNT++;
        }

        System.out.println(COUNT);
    }

    static boolean isGroup(String word) {
        int index = 0;

        for (int i = index; i < word.length()-1; i++) {
            for (int j = i+1; j < word.length(); j++) {
                if ( word.charAt(i) == word.charAt(j)) {
                    // i번째 인덱스 바로 다음 인덱스가 아닐 경우.
                    if (!(i+1 == j))
                        // 그룹이 아니기 때문에 해당 word 는 종료.
                        return false;
                    else {
                        index += j;
                        break;
                    }
                }
            }
        }
        // 조사했는데 아무 문제가 없다면 그룹 단어.
        return true;
    }
}
