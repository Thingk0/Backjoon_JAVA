package _22_05_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_17413_jw {
    public static void main(String[] args) throws IOException {
//        Scanner br = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<Character>();
        int check = 0; // 태그안인지 아닌지 체크.
        String input = br.readLine();
        StringBuilder result = new StringBuilder();

        for(char ch : input.toCharArray()) {
            if(ch == '<') {
                check+=1; // 태그 안을 의미.
                // 태그 전까지의 문자 뒤집기.
                while(!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append("<");
            } else if(ch == '>') {
                check-=1; // 태그 탈출.
                result.append(">");
            } else if(ch == ' ') {
                // 공백 전까지의 문자 뒤집기.
                while(!stack.isEmpty())
                    result.append(stack.pop());
                result.append(" ");
            } else {
                if(check == 0) // 태그 밖
                    stack.push(ch);
                else // 태그 안.
                    result.append(ch);
            }
        }

        // 스택에 남은 문자 뒤집기.
        while(!stack.isEmpty())
            result.append(stack.pop());

        System.out.println(result);
        br.close();
        return;
    }
}


