package _21_12_27;

import java.util.Scanner;

public class Main_2739 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i=1; i<=9; i++)
            System.out.printf("%d * %d = %d\n",number,i,number*i);

    }
}
