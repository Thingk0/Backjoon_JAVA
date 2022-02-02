package _22_02_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11022 {

    public static final String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i+1).append(": ").append(num1).append(" + ")
                    .append(num2).append(" = ").append((num1+num2)).append(NEW_LINE);
        }

        System.out.println(sb.toString());
        br.close();
    }
}
