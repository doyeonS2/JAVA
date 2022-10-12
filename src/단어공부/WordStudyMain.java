package 단어공부;
// 문자열을 입력받아 가장 많이 사용된 알파벳이 무엇인지 확인
// 만약, 가장 많이 사용된 알파벳이 여러개인 경우 ? 출력

import java.util.Scanner;
public class WordStudyMain {
    public static void main(String[] args) {
        // 단어를 입력받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 가장 많이 등장하는 알파벳을 찾기 위해 알파벳 수 만큼의 배열 생성(대소문자 구분 안함으로...)
        int[] alphabet = new int[26]; // 0 ~ 25
        int max = 0;
        char result = 0;
        System.out.print("단어 입력 : ");
        String word = sc.next(); // 스캐너 객체를 이용해 문자열을 입력받음
        // 입력받은 단어의 길이만큼 돌면서 알파벳을 정수로 변환한 인덱스에 값 누적
        // charAt(인덱스) : 문자열에서 해당 인덱스의 문자를 뽑아냄
        // 반복문을 순회하면서 가장 많이 등장한 알파벳 찾기
        // 찾은 결과값이 인덱스값(정수)이므로 문자로 변경 후 출력
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++; // ++; 해도 되고, +=1; 해도 됨
            else alphabet[word.charAt(i) - 'A']++;
        }
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) result = '?'; // 가장 많이 등장하는 수가 여러개인 경우
            else if(alphabet[i] > max) { // 현재 인덱스의 문자 개수가 max 보다 큰 경우
                max = alphabet[i];
                result = (char) ('A'+ i); // 결과를 문자로 출력하기 위해서 인덱스의 정수값을 문자로 변환
            }
        }
        System.out.println(result);
    }
}