package _21_12_22;

import java.util.Scanner;

public class Main_2753 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int years = scanner.nextInt();

        if ( years % 4 == 0 ){
            if ( years % 100 != 0 || years % 400 == 0 )
                System.out.println("1");
            else
                System.out.println("0");
        } else
            System.out.println("0");
    }
}
