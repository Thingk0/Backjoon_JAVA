package _22_06_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1193 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        boolean reverse = true;
        int startValue = 1;

        int arrayLength = 1;
        int pointer = 1;

        int num = 0;
        int deno = 1;

        // 1/1 →
        // 1/2 → 2/1 →
        // 3/1 → 2/2 → 1/3 →
        // 1/4 → 2/3 → 3/2 → 4/1 →
        // 5/1 → 4/2 → 3/3 → 2/4 → 1/5 →
        // 1/6 → 2/5 → 3/4 → 4/3 → 5/2 → 6/1 →
        // 7/1 → 6/2 → 5/3 → 4/4 → 3/5 → 2/6 → 1/7 →

        while (X >= startValue) {
            if (pointer < arrayLength) {
                if (reverse) {
                    num++;
                    deno--;
                } else {
                    num--;
                    deno++;
                }

                pointer++;

            } else {
                pointer = 1;
                arrayLength++;
                reverse = !reverse;

                if (deno == 1)
                    num++;
                else
                    deno++;
            }

            startValue++;
        }

        br.close();
        System.out.printf("%d/%d", num, deno);
    }
}
