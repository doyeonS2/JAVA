package 대소문자변경;
import java.util.Scanner;
// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
// 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
// 문자열을 문자 배열로 변경하는 메소드는 toCharArray()
public class StringEx1 {
    public static void main(String[] args) {
        // 문자열을 입력받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        // 문자열 변수에 스캐너를 통해서 문자열 입력받기
        String input = sc.next();
        // 문자 배열을 생성 후 입력받은 문자열을 문자 배열로 변경
        char[] word = input.toCharArray();
        // 반복문을 순회하면서 대문자/소문자 변경 -> ascii 코드 사용하면 됨
        for(int i = 0; i < word.length; i++) {
            if(word[i] < 'a') word[i] = (char) (word[i] + ('a' - 'A')); // 대문자
            else word[i] = (char) (word[i] - ('a' - 'A')); // 소문자
            }
        System.out.println(word);

    }
}
