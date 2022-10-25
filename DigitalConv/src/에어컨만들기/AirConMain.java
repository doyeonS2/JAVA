package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        // lgAirCon.airConInfo(); // 잘 입력된건지 확인용^^
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0; // 경과 시간 계산
        boolean isSetTemp = false; // 온도를 변경하는 조건 체크
        System.out.print("에어컨을 켜시겠습니까?(yes/no) : ");
        String isON = sc.next();
        if(isON.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirCon();
            while(true) {
                sleep(1000);
                elapsedTime++; // 경과 시간을 누적함
                switch (lgAirCon.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break;
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break;
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break;
                    default : if(elapsedTime >= 61) isSetTemp = true; break;
                }
                if(isSetTemp) {
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false; // 다시 초기화
                    elapsedTime = 0; // 다시 초기화
                }
                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }
        }
    }
}
