package _22_02_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputYear = br.readLine();
        int adYears = Integer.parseInt(inputYear) - 543;

        System.out.println(adYears);
    }
}
