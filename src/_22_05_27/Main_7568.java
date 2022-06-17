package _22_05_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_7568 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 사람의 수
        int N = Integer.parseInt(br.readLine());

        // 2차원 배열 생성
        int[][] weight_height = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            weight_height[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            weight_height[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        for (int i = 0; i < N; i++) {

            int rank = 1;

            for (int j = 0; j < N; j++ ) {

                if (i == j)
                    continue; // 자기 자신과 비교 x

                if (weight_height[i][0] < weight_height[j][0] && weight_height[i][1] < weight_height[j][1])
                    rank++;
            }

            sb.append(rank + " ");
        }

        System.out.println(sb.toString());
    }
}
