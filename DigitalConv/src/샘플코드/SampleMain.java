package 샘플코드;
// {} : 중괄호 : 클래스의 범위 혹은 메소드의 범위를 표시한다.
// public : 접근 제한자 (public, protected, default, private)
// 주석이란 : 컴파일러 수행 시 번역을 하지 않는 부분
// 즉, 사람에게만 보이는 코드

// 한줄 주석

/*
...
 범위주석
====
 */

/*
    Author : 정경수
    Date : 2022.07.19
    Purpose : 자바 개발을 위한 샘플 프로그램 작성
 */

public class SampleMain {
    // Java 프로그램의 시작점이자 끝
    // void : 메소드 수행 이후 반환값이 없음을 의미
    public static/* 범위 주석 */ void main(String[] args) {
        // 화면에 결과를 출력
        System.out.println("Hello Java !!!!!");
        //System.out.println("Hello C++ !!!!!");
        System.out.println("Hello Python !!!!!");

        System.out.println(7);
        System.out.println(3.33);
        System.out.println("자바 !!!!!");
        System.out.println("문자열 연결" + "이 가능합니다.");
        System.out.println("숫자 " + 3 + 4);
        System.out.println(3 + 4 + "숫자");
        //println : 줄바꿈 특성 O
        //print : 줄바꿈 특성 X
    }
}
