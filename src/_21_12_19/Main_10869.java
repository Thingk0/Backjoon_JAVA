package _21_12_19;

import java.util.Scanner;

public class Main_10869 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if ( 1<=A && B<=10000) {
            System.out.println(A+B);
            System.out.println(A-B);
            System.out.println(A*B);
            System.out.println(A/B);
            System.out.println(A%B);
        }
    }
}
