package 트리셋3;

import java.util.TreeSet;

// Comparable 인터페이스는 객체를 정렬하는 데 사용되는 compareTo() 메소드 제공
public class TreeSetEx3 {
    public static void main(String[] args) {
        TreeSet<CarComp> treeSet = new TreeSet<>();
        treeSet.add(new CarComp("Santafe", 2016, "흰색"));
        treeSet.add(new CarComp("GV80", 2012, "은색"));
        treeSet.add(new CarComp("Carnival", 2018, "블랙"));

        for(CarComp e : treeSet) {
            System.out.print(e.modelName + " ");
        }

    }
}
