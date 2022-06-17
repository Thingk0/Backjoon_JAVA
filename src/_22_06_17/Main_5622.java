package _22_06_17;

import java.io.IOException;

public class Main_5622 {
    public static void main(String[] args) throws IOException {

        int result = 0;

        while (true) {
            int dial = System.in.read();

            // 개행 \n 입력받으면 종료.
            if (dial == 10)
                break;

            switch (dial) {
                // A B C
                case 65: case 66: case 67:
                    result += 3;
                    break;
                // D E F
                case 68: case 69: case 70:
                    result += 4;
                    break;
                // G H I
                case 71: case 72: case 73:
                    result += 5;
                    break;
                // J K L
                case 74: case 75: case 76:
                    result += 6;
                    break;
                // M N O
                case 77: case 78: case 79:
                    result += 7;
                    break;
                // P Q R S
                case 80: case 81: case 82: case 83:
                    result += 8;
                    break;
                // T U V
                case 84: case 85: case 86:
                    result += 9;
                    break;
                // W X Y Z
                case 87: case 88: case 89: case 90:
                    result += 10;
                    break;
                default:
                    break;
            }
        }

        System.out.println(result);
    }
}
