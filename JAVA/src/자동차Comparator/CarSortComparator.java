package 자동차Comparator;
import java.util.Iterator;
import java.util.TreeSet;
// 연식, 이름, 가격에 대한 클래스를 만들고 10개의 객체 생성
// 연식(오름차순/내림차순), 이름(오름차순/내림차순), 가격(오름차순/내림차순)
public class CarSortComparator {
    public static void main(String[] args) {
        TreeSet<CarSortInfo> treeSet =  new TreeSet<>(new CarSortComp().reversed());
        treeSet.add(new CarSortInfo(1999, "소나타", 2000));
        treeSet.add(new CarSortInfo(1988, "프라이드", 700));
        treeSet.add(new CarSortInfo(2001, "그랜저", 2800));
        treeSet.add(new CarSortInfo(2012, "싼타페", 3300));
        treeSet.add(new CarSortInfo(2022, "GV80", 7000));

        Iterator<CarSortInfo> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            CarSortInfo car = iterator.next();
            System.out.println(car.productYear + " " + car.carName + " " + car.price);
        }
    }
}
