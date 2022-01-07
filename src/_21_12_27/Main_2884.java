package _21_12_27;

import java.util.Scanner;

public class Main_2884 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if ( 0<=hour && hour<=23 && 0<=minute && minute<=59 ) {
            if( minute < 45 && hour >= 1 ){
                hour -= 1;
                minute += 15;
            } else if ( minute < 45 ){
                hour += 23;
                minute += 15;
            } else  {
                minute -= 45;
            }
        }
        System.out.println(hour +" "+minute);
    }
}
