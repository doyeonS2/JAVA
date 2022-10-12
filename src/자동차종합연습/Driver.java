package 자동차종합연습;

public class Driver {
    // 매개변수의 다형성을 위해서 자동차 부모 클래스를 매개변수로 전달
    // 두번째 매개변수는 승객 수
    // 세번째는 거리
    // 각 자동차의 모드 기능
    void drive(Car car, int passCnt, int dist, boolean mode) {
        if(mode) car.setMode(true);
        else car.setMode(false);
        int moveCnt = car.getMovingCnt(passCnt);
        System.out.println("총 비용 : " + car.getTotalCost(dist, moveCnt)); // 총 비용
        System.out.println("주유 횟수 : " + car.getRefuelCnt(dist, moveCnt)); // 주유 횟수
        System.out.printf("총 이동 시간 : %.3f\n", car.getMovingTime(dist, moveCnt)); // 이동 시간
    }
}
