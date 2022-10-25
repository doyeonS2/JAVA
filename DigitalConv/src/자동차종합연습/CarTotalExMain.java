package 자동차종합연습;
import java.util.Scanner;
public class CarTotalExMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150, 200, 300}; // 부산, 대전, 강릉, 광주
        // int moveCnt = 0; // 이동 횟수를 반환받기 위해 사용
        //Car car; //  부모 클래스로 참조 타입 변수, 자식 객체를 동적 바인딩 할 수 있다.
        Car car = null;
        Driver driver = new Driver();
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산, [2]대전, [3]강릉, [4]광주 : ");
        int cityLoc = sc.nextInt();
        System.out.print("이동할 승객 수를 입력 하세요 : ");
        int passCnt = sc.nextInt();
        System.out.print("이동할 차량 선택 : [1]스포츠카, [2]승용차, [3]버스 : ");
        int carSel = sc.nextInt();
        System.out.print("부가 기능 [1]ON, [2]OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch(carSel) {
            case 1 : car = new SportsCar("Ferrari"); break;
//                car = new SportsCar("Ferrari");
//                if(option == 1) car.setMode(true);
//                else car.setMode(false);
//                moveCnt = car.getMovingCnt(passCnt);
//                System.out.println("총 비용 : " + car.getTotalCost(dist[cityLoc], moveCnt));
//                System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist[cityLoc], moveCnt));
//                System.out.printf("총 이동 시간 : %.3f\n", car.getMovingTime(dist[cityLoc], moveCnt));

            case 2 : car = new Sedan("GV80"); break;
//                car = new Sedan("GV80");
//                if(option == 1) car.setMode(true);
//                else car.setMode(false);
//                moveCnt = car.getMovingCnt(passCnt);
//                System.out.println("총 비용 : " + car.getTotalCost(dist[cityLoc], moveCnt));
//                System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist[cityLoc], moveCnt));
//                System.out.printf("총 이동 시간 : %.3f\n", car.getMovingTime(dist[cityLoc], moveCnt));

            case 3 : car = new Bus ("BUS"); break;
//                car = new Bus("BUS");
//                if(option == 1) car.setMode(true);
//                else car.setMode(false);
//                moveCnt = car.getMovingCnt(passCnt);
//                System.out.println("총 비용 : " + car.getTotalCost(dist[cityLoc], moveCnt));
//                System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist[cityLoc], moveCnt));
//                System.out.printf("총 이동 시간 : %.3f\n", car.getMovingTime(dist[cityLoc], moveCnt));

            default :
                System.out.println("차량 선택이 잘 못 되었습니다.");
        }
        driver.drive(car, passCnt, dist[cityLoc], isMode);
    }
}