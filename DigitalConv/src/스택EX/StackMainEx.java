package 스택EX;

import java.util.Scanner;
import java.util.Stack;

// 스택을 이용한 괄호 열림/닫힘 확인
public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("수식 입력 : ");
        String exp = sc.next();

        // 입력 받은 문자열 길이만큼 반복문 순회
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '(') {
                st.push(ch); // 열림 괄호일 때 push
            } else if(ch == ')') {
                if(!st.isEmpty())st.pop(); // 닫힘 괄호일 때
                else {
                    System.out.println("괄호가 일치하지 않습니다.");
                    return;
                }

            }
        }
        if(st.isEmpty()) {
            System.out.println("괄호가 일치합니다.");
        } else {
            System.out.println("괄호가 일치하지 않습니다.");
        }


    }
}
