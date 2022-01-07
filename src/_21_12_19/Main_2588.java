package _21_12_19;

import java.util.Scanner;

public class Main_2588 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String number = String.valueOf(B);
        char[] digit = number.toCharArray();

        for(int i = digit.length-1; i >= 0; i--) {
            System.out.println(A*(digit[i]-'0'));
            // digit[i] 는 char 형이기 때문에 아스키코드가 아닌 int 형으로 형변환을 해서 계산을 해주어야함.
        }
        System.out.println(A*B);
    }
}
