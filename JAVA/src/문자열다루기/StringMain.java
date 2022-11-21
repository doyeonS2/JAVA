package 문자열다루기;

import 문자열비교2.StringRevert;

import java.util.Scanner;

// 문자열 : 참조 타입
// equals() : 문자열을 비교함(대소문자 구분)
// epualsIgnoreCase : 문자열을 비교함(대소문자 구분 안함)
// indexOf() : 문자열에서 특정 문자/문자열이 시작되는 인덱스를 반환(연속해서 찾지 않는다)
// contains() : 문자열에서 특정 문자열이 포함되어 있는지 확인
// charAt() : 문자열에서 인덱스 위치의 문자를 반환
// replaceAll() : 문자열 중 특정 문자열을 다른 문자열로 변경(특정 문자열을 지울 때도 사용)
// replace() : 문자열 중 특정 문자열을 다른 문자열로 변경(특정 문자열을 지울 때도 사용)
// substring(5) : 문자열 중 특정 문자열을 뽑아낼 때 사용(해당 인덱스부터 끝까지...)
// substring(5, 8) : 5에서 8미만까지 문자열을 뽑아냄(5, 6, 7)
// toUpperCase() / toLowerCase() : 문자열을 모두 대문자 / 모두 소문자로 변경
// trim() : 문자열의 앞/뒤의 공백을 제거
// split() : 문자열을 특정 구분자로 분리하는 메소드
// 문자열 포매팅 : String.format()와 System.out.printf()
// String.format() : 서식으로 문자열을 구성해서 결과를 반환하는 메소드
// System.out.printf() : 서식으로 문자열을 구성해서 결과 출력하는 메소드
// toCharArray() : 문자열의 문자 배열로 반환
public class StringMain {
    public static void main(String[] args) {
//        String a = "hello";
//        String b = "hello";
//        System.out.println(a.equals(b)); // a와 b의 문자열의 내용이 같은지 확인
//        System.out.println(a.equalsIgnoreCase(b)); // a와 b의 문자열의 내용이 같은지 확인(대소문자 구분 안함)
//        System.out.println(a == b); // 참조가 같은지를 묻는다.


//        String name = "Hello Java Java";
//        System.out.println(name.indexOf("Java")); // index는 0부터 시작(공백도 문자에 포함)
//        System.out.println(name.indexOf("J"));
//        System.out.println(name.contains("Java"));
//        System.out.println(name.charAt(6));
//        System.out.println(name.replaceAll("Java","Python")); // 자바 문자를 파이썬으로 변경, 파이썬 입력된 자리에 ""으로 입력하면 자바 문자 지워짐
//        System.out.println(name.replace("Java","Python"));
//        System.out.println(name.substring(6)); // 6번 인덱스부터 끝까지 뽑아냄
//        System.out.println(name.substring(6, 9); // 미만 개념이라 6, 7, 8을 뽑아냄
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim()); // 회원가입 아이디, 비밀번호 입력 시 사용할 수 있음


//        String name = "23:45:56";
//        String[] names = name.split(":");
//        //for(String e : names) System.out.println(e);
//        System.out.println(names[0] + "시" + names[1] + "분" + names[2] + "초");


//        String cnt = "five";
//        String name = String.format("I eat %s apples.", cnt);
//        System.out.printf("I eat %s apples.", cnt); // 서식을 만들어서 화면에 출력을 하는 용도(출력용)
//        System.out.println(name); // 변수를 대입받아 담는 용도(변수 저장용)


        String name = "Seoul City";
        char[] arrName = name.toCharArray();
        for(int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i] + " ");
        }

    }
}
