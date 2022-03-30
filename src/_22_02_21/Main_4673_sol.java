package _22_02_21;

public class Main_4673_sol {
    public static boolean[] selfNumber = new  boolean[100001];
    public static int d(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<10001; i++) {
            int temp = d(i);
            selfNumber[temp] = true;
        }

        for (int i=1; i<10001; i++) {
            if (!selfNumber[i])
                sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
