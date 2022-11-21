package 트리셋3;
public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public  String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    // 정렬 조건을 만들어서 넣어줘야함
    public int compareTo(CarComp o) {
//        if(this.modelYear == o.modelYear) return 0;
//        else if(this.modelYear < o.modelYear) return -1;
//        else return 1; // 양수의 경우 객체의 자리가 바뀐다.
        if(this.modelName.compareTo(o.modelName) == 0) return 0;
        else if(this.modelName.compareTo(o.modelName) < 0) return -1;
        else return 1;

    }


}
