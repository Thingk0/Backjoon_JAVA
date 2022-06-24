package _22_06_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 고정 비용
        int B = Integer.parseInt(st.nextToken()); // 가변 비용
        int C = Integer.parseInt(st.nextToken()); // 노트북 가격

        int sales_number = 1;

        if (C == B)
            sales_number = -1;
        else if (B < C)
            sales_number += A / (C-B);
        else if (C-B < 0)
            sales_number = -1;
        else {
            while (A > (C-B)) {
                A -= (C-B);
                sales_number++;
            }
        }

        System.out.println(sales_number);
    }
}
