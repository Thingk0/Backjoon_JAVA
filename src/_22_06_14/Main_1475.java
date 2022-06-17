package _22_06_14;

import java.io.IOException;
import java.util.Arrays;

public class Main_1475 {
    public static void main(String[] args) throws IOException{

        int[] carSet = new int[10];

        while (true) {
            int cardNum = System.in.read();

            // 공백을 입력받았을 경우,
            if (cardNum == 10)
                break;

            // 9 카드는
            if (cardNum == 57)
                // 6 으로 사용 가능.
                cardNum = 54 ;

            carSet[cardNum - 48]++;
        }

        carSet[6] = (carSet[6] + 1) / 2;

        Arrays.sort(carSet);
        System.out.println(carSet[9]);
    }
}
