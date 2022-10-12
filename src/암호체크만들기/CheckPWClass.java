package 암호체크만들기;

public class CheckPWClass {
    String password;

    void inputPW(String pass) {
        // 패스워드 체크를 위해 전달받은 매개변수를 인스턴스 필드에 복사
        // 인스턴스 password를 사용하지 않는다면 해당 메소드에서 기능 전부를 구현해야함
        password = pass;
//        System.out.println("길이체크 : " + validLength());
//        System.out.println("숫자체크 : " + validNumber());
//        System.out.println("대문자체크 : " + validUpperAlphabet());
//        System.out.println("소문자체크 : " + validLowerAlphabet());
//        System.out.println("특수문자체크 : " + validRex());

        // 각각의 체크 메소드의 결과를 AND 연산(모든 체크 조건을 다 만족해야 "Good password!" 조건이 성립함
        if(validLength() && validNumber() && validUpperAlphabet() &&
        validLowerAlphabet() && validRex()) {
            System.out.println("Good password!");
        } else {
            System.out.println("Bad password!");
        }
    }
    // 입력받은 문자열 길이가 10과 30 사이인지 확인
    boolean validLength() {
        // 메소드의 반환타입은 해당 메소드가 호출된 후 호출한 곳으로 수행 이후 결과를 반환함
        if (password.length() >= 10 && password.length() <= 30) return true;
        else return false;
    }

    boolean validNumber() {
        for (int i = 0; i < password.length(); i++) {
            // charAt(인덱스)는 문자열에서 해당 인덱스의 문자를 반환함 (문자는 정수로 계산되기때문에 범위 체크 가능)
            // 해당하는 조건문내로 한번이라도 진입하게되면 해당 메소드는 true로 반환되고 끝남
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                return true; // return문은 해당 메소드를 끝내고 호출한 곳으로 이동함
                // 리턴문에 오는 값은 반드시 반환 타입과 같아야함
            }
        }
        // for문 내에 있는 리턴문을 만나지 못한 경우 해당 리턴문이 수행된다.
        return false;
    }
    boolean validUpperAlphabet() {
        for(int i = 0; i < password.length(); i++) {
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                return true;
            }
        }
        return false;
    }
    boolean validLowerAlphabet() {
        for(int i = 0; i < password.length(); i++) {
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                return true;
            }
        }
        return false;

    }
    // 정규식 : Regular Express
    boolean validRex() {
        String specialLetter = "!%_&#+-*/";
        // 2중 for문 : 특수문자의 길이만큼, 각 인덱스의 문자를 입력받은 문자열 전체를 비교
        // 비교 횟수는 특수문자 갯수 * 문자열 길이
        for(int i = 0; i < specialLetter.length(); i++) {
            for(int j = 0; j < password.length(); j++) {
                if(specialLetter.charAt(i) == password.charAt(j)) return true;
            }

        }
        return false;
    }

}