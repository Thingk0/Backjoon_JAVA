package _22_06_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2161 {
    public static void main(String[] args) throws IOException {

        Queue<Integer> queue = new LinkedList<>();
        boolean isSendBack = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int card = Integer.parseInt(br.readLine());

        for (int i = 1; i <= card; i++)
            queue.offer(i);

        while (!queue.isEmpty()) {

            int temp = queue.poll();

            if (isSendBack) {
                queue.offer(temp);
                isSendBack = false;
            } else {
                sb.append(temp).append(" ");
                isSendBack = true;
            }
        }

        br.close();
        System.out.println(sb.toString());
    }
}


// 1 2 3 4 5 6 7
// 2 3 4 5 6 7 -> 1
// 3 4 5 6 7 2 -> 1
// 4 5 6 7 2 -> 1 3
// 5 6 7 2 4 -> 1 3
// 6 7 2 4 -> 1 3 5
// 7 2 4 6 -> 1 3 5
// 2 4 6 -> 1 3 5 7
// 4 6 2 -> 1 3 5 7
// 6 2 -> 1 3 5 7 4
// 2 6 -> 1 3 5 7 4
// 6 -> 1 3 5 7 4 2
// 1 3 5 7 4 2 6