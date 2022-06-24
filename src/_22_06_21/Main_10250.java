package _22_06_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int floorNumber = N % H;

            if (H == N)
                floorNumber = N;
            else if (floorNumber == 0)
                floorNumber = H;

            sb.append(floorNumber);

            int roomNumber = N / H;
            if (N % H != 0)
                roomNumber++;

            if (roomNumber < 10)
                sb.append("0").append(roomNumber).append("\n");
            else
                sb.append(roomNumber).append("\n");
        }

        System.out.println(sb.toString());
    }
}


//        101
//        104
//        104
//        120
//        202
//        202
//        202
//        601
//        102
//        402
//        602
//        110
//        110
//        910
//        102
//        1203
//        101
//        9901
//        102
//        9899
