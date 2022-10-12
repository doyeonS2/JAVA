package 자동차종합연습;
public abstract class Car {
    int maxSpeed; // 최고 속도
    int fuelEff; // 연비(리터당 주유비용)
    int fuelTank; // 연료 탱크
    int seatCnt; // 좌석 수
    String name; // 차량 이름
    // 이동 횟수 구하기
    int getMovingCnt(int passCnt) {
        if(passCnt % seatCnt != 0) { // 좌석 수로 나눈 나머지가 있으면 승객이 남아있으므로 추가 운행 필요
            return (passCnt / seatCnt) + 1;
        } else return passCnt / seatCnt;
    }
    // 이동 비용 구하기
    int getTotalCost(int dist, int moveCnt) {
        return (dist / fuelEff * 2000) * moveCnt;
    }
    // 주유 횟수 구하기
    int getRefuelCnt(int dist, int moveCnt) {
        if(((dist * moveCnt) / fuelEff) % fuelTank != 0)
            return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        else return ((dist * moveCnt) / fuelEff) / fuelTank;
    }
    // 이동 시간 구하기
    double getMovingTime(int dist, int moveCnt) {
        return (double)dist * moveCnt / maxSpeed;
    }
    abstract void setMode(boolean isMode);
}
class Sedan extends Car {
    public Sedan(String name) {
        this.name = name;
        this.maxSpeed = 200;
        this.fuelEff = 12;
        this.fuelTank = 45;
        this.seatCnt = 4;
    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }
}

class SportsCar extends Car {
    public SportsCar(String name) {
        this.name = name;
        this.maxSpeed = 250;
        this.fuelEff = 8;
        this.fuelTank = 30;
        this.seatCnt = 2;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) maxSpeed *= 1.2;
    }
}

class Bus extends Car {
    public Bus(String name) {
        this.name = name;
        this.maxSpeed = 150;
        this.fuelEff = 5;
        this.fuelTank = 100;
        this.seatCnt = 20;
    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) fuelTank += 30;
    }
}
