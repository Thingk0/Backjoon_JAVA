package _22_06_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num1 = st.nextToken();
        String num2 = st.nextToken();

        int temp;
        int max_length = Math.max(num1.length(), num2.length());

        int[] num1_arr = new int[max_length + 1];
        int[] num2_arr = new int[max_length + 1];

        for (int i = num1.length()-1, index = 0; i >=0; i--, index++) {
            num1_arr[index] = num1.charAt(i) - 48;
        }

        for (int j = num2.length()-1, index = 0; j >=0; j--, index++) {
            num2_arr[index] = num2.charAt(j) - 48;
        }

        for (int k = 0; k < max_length; k++) {
            temp = num1_arr[k] + num2_arr[k];
            num1_arr[k] = temp % 10;
            num1_arr[k+1] += (temp / 10);
        }

        if (num1_arr[max_length] == 1)
            sb.append(num1_arr[max_length]);

        for (int l = max_length-1; l >=0; l--)
            sb.append(num1_arr[l]);

        br.close();
        System.out.println(sb);
    }
}

// 18446744073709551615
// 18446844084820662624