package _22_02_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] scores = new double[times];
        double max = 0;
        double sum = 0;

        for (int i=0; i<scores.length; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            max = Math.max(scores[i], max);
        }

        for (double num: scores) {
            sum += num / max * 100;
        }

        System.out.println(sum / times);
    }
}
