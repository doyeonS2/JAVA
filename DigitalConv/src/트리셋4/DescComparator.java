package 트리셋4;
import java.util.Comparator;
public class DescComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price) return 1; // 반환값이 1이면 정렬 수행
        else if(o1.price == o2.price) return 0;
        else return -1;
    }
}
//class AscendComparator implements Comparator<Fruit> {
//
//    @Override
//    public int compare(Fruit o1, Fruit o2) {
//        if(o1.price < o2.price) return 1; // 반환값이 1이면 정렬 수행
//        else if(o1.price == o2.price) return 0;
//        else return -1;
//    }
//}


