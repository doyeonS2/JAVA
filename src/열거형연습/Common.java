package 열거형연습;
public class Common {
//     //직업
//    final static int STUDENT = 1;
//    final static int WORKER = 2;
//    final static int HOUSEWIFE = 3;
//    final static int NONE = 4;
//    //취미

    // values() : 열거체의 모든 상수를 저장한 배열을 생성하여 반환합니다
    // valueOf() : 전달된 문자열과 일치하는 해당 열거체 상수를 반환
    // ordinal() : 해당 열거체 상수가 몇번째에 정의되었는지 인덱스를 반환(0부터 시작)




    enum Gender {
        MALE, FEMALE

    }

    enum Job {
        STUDENT, WORKER, HOUSEWIFE, NONE

    }

    enum Addr {
        SEOUL, KYUNGKI, INCHUN, SUWON

    }

    enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    enum Rainbow {
        RED, ORANGE, YELLOW, GREEN, BLUE, NAVY, PURPLE

    }

}

