package _22_04_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i=0; i<testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int repetitionNum = Integer.parseInt(st.nextToken());
            char[] ch = st.nextToken().toCharArray();

            for (char str: ch) {
                for (int j=0; j<repetitionNum; j++) {
                    sb.append(str);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();

    }
}
