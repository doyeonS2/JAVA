package 자동차Comparator;
import java.util.Comparator;
// 자동차 객체에 대한 비교를 담당하는 클래스 생성
public class CarSortComp implements Comparator<CarSortInfo> {
    @Override
    public int compare(CarSortInfo o1, CarSortInfo o2) {
//        if(o1.productYear == o2.productYear) return 0;
//        else if(o1.productYear < o2.productYear) return -1;
//        else return 1;
        return o1.carName.compareTo(o2.carName);
    }

    @Override
    public Comparator<CarSortInfo> reversed() {
        return Comparator.super.reversed();
    }
}
