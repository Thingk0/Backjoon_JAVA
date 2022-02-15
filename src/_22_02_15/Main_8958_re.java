package _22_02_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_8958_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        int testCase = Integer.parseInt(br.readLine());
        for (int i=0; i<testCase; i++) {
            str = br.readLine();

            int sum = 0;
            int increase = 1;

            for(int j=0; j < str.length(); j++) {
                if( str.charAt(j) == 'O'){
                    sum += increase++;
                }
                else
                    increase = 1;
            }

            if ( i == testCase-1 )
                sb.append(sum);
            else
                sb.append(sum).append("\n");

        }

        System.out.print(sb);
    }
}
