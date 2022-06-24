package _22_06_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        br.close();
        if (N % 5 == 0)
            System.out.println(N / 5);
        else if (N == 4 || N == 7)
            System.out.println(-1);
        else if (N % 5 == 1 || N % 5 == 2)
            System.out.println(N / 5 + N % 5);
        else if (N % 5 == 3)
            System.out.println(N / 5 + 1);
        else if (N % 5 == 4)
            System.out.println(N / 5 + 2);
    }
}

//          3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18  19  20
//n/5       0   0   1   1   1   1   1   2   2   2   2   2   3   3   3   3   3   4
//n%5       3   4   0   1   2   3   4   0   1   2   3   4   0   1   2   3   4   0
//result    1   -1  1   2   -1  2   3   2   3   4   3   4   3   4   5   4   5   4