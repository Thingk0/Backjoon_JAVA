package _22_06_17;

import java.io.IOException;

public class Main_2941 {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        int alphabet = System.in.read();
        while (alphabet != 10) {
            switch (alphabet) {
                // c, d, l, n, s, z
                case 99, 100, 108, 110, 115, 122 -> {

                    if (!sb.isEmpty() && alphabet != 99 && alphabet != 100
                    && alphabet != 108 && alphabet != 110 && alphabet != 115 && alphabet != 122)
                        count++;

                    sb.append((char) alphabet);
                    System.out.println(sb.toString());
                }
                // j
                case 106 -> {
                    if (sb.toString().equals("l") || sb.toString().equals("n")) {
                        count++;
                        sb.setLength(0);
                        System.out.println(sb.toString());
                    } else {
                        count++;
                        System.out.println(sb.toString());
                    }
                }
                // =
                case 61 -> {
                    if (sb.toString().equals("c") || sb.toString().equals("dz") ||
                            sb.toString().equals("s") || sb.toString().equals("z")) {
                        count++;
                        sb.setLength(0);
                        System.out.println(sb.toString());
                    } else {
                        count++;
                        System.out.println(sb.toString());
                    }
                }
                // -
                case 45 -> {
                    if (sb.toString().equals("c") || sb.toString().equals("d")) {
                        count++;
                        sb.setLength(0);
                        System.out.println(sb.toString());
                    } else {
                        count++;
                        System.out.println(sb.toString());
                    }
                }
                default -> {
                    count++;
                }
            }

            alphabet = System.in.read();
        }

        System.out.println(count);
    }
}
