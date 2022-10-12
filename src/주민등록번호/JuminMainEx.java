package 주민등록번호;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
// 주민등록번호 : 010222-3164414
// 생년월일 : 2001년 2월 22일생
// 나이 (만 나이 기준) - 예제 기준 21살이 됨
// 성별 : 8번째 자리 1, 3 이면 남성, 2, 4이면 여성
public class JuminMainEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 주민등록번호 입력 받기
        System.out.print("주민등록번호 입력 : ");
        String jumin = sc.next();
        // 현재 연도 구하기
        Calendar now = Calendar.getInstance();
        int thisYear =  now.get(Calendar.YEAR);
        int jYear = 0, jMonth = 0, jDay = 0, jGender = 0;
        // 주민등록번호 길이만큼 반복문을 돌면서, 년/월/일 그리고 성별 추출
        // 캘린더에서 현재 년도를 가져와서 추출된 년도와 계산(1900 or 2000)
        for(int i = 0; i < jumin.length(); i++) {
            if(i == 0) jYear = (jumin.charAt(0) - '0') * 10; // 10의 자리의 수를 만들어줌
            if(i == 1) jYear += jumin.charAt(1) - '0';
            if(i == 2) jMonth = (jumin.charAt(2) - '0') * 10;
            if(i == 3) jMonth += jumin.charAt(3) - '0';
            if(i == 4) jDay = (jumin.charAt(4) - '0') * 10;
            if(i == 5) jDay += jumin.charAt(5) - '0';
            if(i == 7) jGender = jumin.charAt(7) - '0';
        }
        if (jGender == 1 || jGender == 2) { // 1900년대 출생자
            System.out.println("생년월일 : " + (jYear + 1900) + "년" + jMonth + "월" + jDay + "일");
            System.out.println("나이 : 만 " + (thisYear - 1900 - jYear));
        } else {
            System.out.println("생년월일 : " + (jYear + 2000) + "년" + jMonth + "월" + jDay + "일");
            System.out.println("나이 : 만 " + (thisYear - 2000 - jYear));
        }
        String[] genderStr = {"", "남성", "여성", "남성", "여성"};
        System.out.println("성별 : " + genderStr[jGender]);






    }
}
