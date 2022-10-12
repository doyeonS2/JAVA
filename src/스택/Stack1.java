package 스택;

import java.util.Stack;

// 기본적으로 스택은 List 타입의 자료 구조이며,
// 사용 목적에 맞도록 기능에 제약을 걸어서 Stack 구현에 필요한 메소드만 남김
// push(item) : 객체를 저장, 맨 위에서 동작이 일어남
// peek() : 스택 맨위의 값 확인
// pop() : 스택 맨 위의 값을 추출하면서 반환해준다.
// empty() : 스택이 비어있는지 확인한다.
// 사용용도
// 프로그램의 Call Stack에 사용(메소드 호출 관계)
// 인터넷에서 경로 이동 시 이전 경로에 대한 이동 관리 등에 사용
// 문서 작성 시 Undo 기능 등에 사용됨
// 문서 편집기 등에서 괄호 열림 닫힘 판별하기 등에서 사용
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // 스택 객체 생성
        stack.push(1); // 객체를 저장, 맨위에서 동작 일어남
        stack.push(2);
        stack.push(3);
        // Stack의 맨 위의 값 확인
        System.out.println(stack.peek());
        // Stack의 맨 위의 값 추출 및 보여줌
        System.out.println(stack.pop());
        // 스택에 포함된 객체 보기
        System.out.println(stack);
        // 스택이 비어있는지 확인
        System.out.println(stack.empty());
        // 스택의 사이즈 확인(값이 몇개 들어있는지??)
        System.out.println(stack.size());
        // 해당 값이 포함되어 있는지 여부 확인(true/false)
        System.out.println(stack.contains(1));




    }
}
