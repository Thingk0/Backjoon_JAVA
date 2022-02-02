package _21_12_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int years = Integer.parseInt(br.readLine());

        if ( years % 4 == 0 ){
            if ( years % 100 != 0 || years % 400 == 0 )
                System.out.println("1");
            else
                System.out.println("0");
        } else
            System.out.println("0");
    }
}
