package _22_02_03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 26
        int tempNum = N;
        int addCycle = 0;
        br.close();

        do {
            if ( tempNum >= 10 & tempNum <= 99 )
                tempNum = ((tempNum % 10) * 10) + ((tempNum / 10) + (tempNum % 10));
            else if ( tempNum < 10 )
                tempNum *= 11;
            System.out.println(tempNum);
            addCycle++;
        } while ( tempNum != N );


       System.out.println(addCycle);
    }
}
