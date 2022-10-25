package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPad {
    int screen; // 화면 크기 : 11인치 / 12.9인치
    int color; // 색상 : 스페이스그레이 / 실버
    int memory; // 용량 : 128GB, 256GB, 512GB, 1TB
    int network; // 네트워크 :  Wi-Fi, Wi-Fi+Cellular
    String name; // 각인서비스 시 이름 저장
    // iPad + 크기(11/13) + 용량(128/256/512/1024) + W/C + 출시일(220801) + 생산댓수
    String productDate; // 제품 생산일자
    String serialNum; // 제품 일련번호 : iPad13128C2208081
    static int cnt = 0; // 클래스 변수

    IPad(String name) { // 생성자는 클래스가 객체로 만들어질 때 호출됨
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now); // 년월일 시간 정보를 얻어옴
        cnt++;
        productDate += cnt; // 문자열을 이어 붙이기
    }

    // 제품을 구입할건지 중단할건지 선택 메뉴 (true 계속 진행 / false 종료)
    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== iPad Pro 구입하기 =====");
        System.out.println("구입하시려면 yes / 종료는 quit");
        String isContinue = sc.next();
        if (isContinue.equalsIgnoreCase("yes")) return true;
        else return false;
    }

    // 스크린 설정 하기, void는 메소드 수행 이후 반환값이 없음을 의미
    void setScreen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("디스플레이 선택 [1]11인치, [2]12.9인치 : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택하세요");
        }
    }

    // 컬러 선택
    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러 선택 [1]스페이스그레이 [2]실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택하세요");
        }
    }

    // 용량 선택
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1]128GB, [2]256GB, [3]512GB, [4]1TB : ");
            memory = sc.nextInt();
            if (memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택하세요");
        }
    }

    // 네트워크 선택
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("네트워크 선택 [1]Wi-Fi [2]Wi-Fi+Cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택하세요");
        }
    }

    // 각인 서비스
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("각인서비스를 신청 하시겠습니까?");
        String service = sc.next();
        if (service.equalsIgnoreCase("yes")) {
            System.out.println("이름을 입력하세요.");
            name = sc.next();
        }

    }

    // 일련번호 만들기
    // iPad + 크기(11/13) + 용량(128/256/512/1024) + W/C + 출시일(220801) + 생산댓수
    void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate;
        System.out.println(serialNum);
    }

    // 제품 구매가 완료되면 출고까지 30초 대기 이후 출고하기
    void progressPad() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(300);
            cnt++;
            System.out.print(" << iPad Pro 제작중 : [" + cnt + "%] >>");
            System.out.print("\r");
            if (cnt >= 100) break;
        }
    }

    void productPad() {
        final String[] screenType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "Wi-Fi", "Wi-Fi+Cellular"};

        System.out.println("===== iPad가 출고 되었습니다. =====");
        System.out.print("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name); // 각인서비스 미 신청시 iPad, 신청 시 해당 이름
        System.out.println("일련번호 : " + serialNum);
        System.out.println("--------------------------------");


    }
}

