package 열거형연습;
import java.util.Calendar;

import static 열거형연습.Common.*;
// 연관된 상수를 나열해 놓은 것
// 자바의 여러형은 상수값과 타입 체크 기능이 추가되어있음
// 직업 : 1.학생, 2.회사원, 3.주부, 4.무직
//interface Jobs {
//    int STUDENT = 1; // public static final
//    int WORKER = 2;
//    int HOUSEWIFE = 3;
//    int NONE = 4;
//}
//interface Hobby {
//    int BASEBALL = 1;
//    int SOCCER = 2;
//    int SING = 3;
//    int NONE = 4;
//}
//
public class EnumMainEx {
    public static void main(String[] args) {
        int index = Rainbow.YELLOW.ordinal();

    }
}
//        Week today = null; // 열거형에 대한 참조 변수(정의된 열거형 타입만
//        // 추상클래스이기 때문에 객체를 생성하지 않음
//        Calendar cal = Calendar.getInstance(); // Calender -> 추상클래스
//        int week = cal.get(Calendar.DAY_OF_WEEK); // 1 ~ 7
//        switch (week) {
//            case 1:
//                today = Week.SUNDAY;
//                break;
//            case 2:
//                today = Week.MONDAY;
//                break;
//            case 3:
//                today = Week.TUESDAY;
//                break;
//            case 4:
//                today = Week.WEDNESDAY;
//                break;
//            case 5:
//                today = Week.THURSDAY;
//                break;
//            case 6:
//                today = Week.FRIDAY;
//                break;
//            case 7:
//                today = Week.SATURDAY;
//                break;
//
//
//        }
//        System.out.println("오늘 요일 : " + today);
//    }
//}
//        MemberInfo member = new MemberInfo();
//        member.name = "우영우";
//        member.gender = Common.Gender.FEMALE;
//        member.job = Common.Job.STUDENT;
//        member.addr = Common.Addr.KYUNGKI;
//
//        System.out.println("이름 : " + member.name);
//        System.out.println("성별 : " + member.gender);
//        System.out.println("직업 : " + member.job);
//        System.out.println("주소 : " + member.addr);
//
//    }
//}
//class MemberInfo {
//    String name;
//    Gender gender;
//    Job job;
//    Addr addr;
//}

//enum Gender {
//    MALE, FEMALE
//
//}
//
//enum  Job {
//    STUDENT, WORKER, HOUSEWIFE, NONE
//
//}
//
//enum  Addr {
//    SEOUL, KYUNGKI, INCHUN, SUWON
//
//}

//        Scanner sc = new Scanner(System.in);
//        System.out.print("직업을 입력하세요 : ");
////        int hobby = sc.nextInt();
////        switch (hobby) {
////            case Hobby.BASEBALL:
////                System.out.println("학생 입니다.");
////                break;
////            case Hobby.SOCCER:
////                System.out.println("회사원 입니다.");
////                break;
////            case Hobby.SING:
////                System.out.println("주부 입니다.");
////                break;
////            case Hobby.NONE:
////                System.out.println("무직 입니다.");
////                break;
////        }
//
//        if(Jobs.HOUSEWIFE == Hobby.SING) {
//            System.out.println("주부와 노래는 같다..");
//        }
//


