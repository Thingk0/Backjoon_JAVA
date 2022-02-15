package _22_02_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4344_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());

        for (int i=0; i<testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            double studentsScoreSum = 0;

            double[] studentsScore = new double[students];
            for (int j=0; j<students; j++) {
                studentsScore[j] = Double.parseDouble(st.nextToken());
                studentsScoreSum += studentsScore[j];
            }

            double studentsScoreAvg = studentsScoreSum / students;
            double avgOverStudents = 0;

            for (double score: studentsScore) {
                avgOverStudents += score > studentsScoreAvg ? 1 : 0;
            }
            sb.append(String.format("%.3f%%\n", (avgOverStudents / students) * 100));
        }

        br.close();
        System.out.println(sb);
    }
}
