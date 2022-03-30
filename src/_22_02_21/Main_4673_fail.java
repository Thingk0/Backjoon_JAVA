package _22_02_21;

import java.util.HashSet;

public class Main_4673_fail {
    public static void main(String[] args) {
        HashSet<Integer> selfnum = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=10000; i++) {
            result.add(i);
        }

        for (int i=1; i<=10000; i++) {
            int temp =  i + (i / 1000) + (i / 100) + (i / 10) + (i % 10);
            selfnum.add(temp);
        }

        result.removeAll(selfnum);
        for (int num: result)
            sb.append(num).append("\n");

        System.out.println(sb);
    }
}
