package 상속기본2;

public class Person {
    String eat = "밥을 먹습니다.";
    String getEat() {
        return eat;
    }
}
class Student extends Person {
    String study = "공부 합니다.";
    String getEat() {
        return "학생이 " + eat;
    }
    void  viewStudent() {
        System.out.println(study);
        System.out.println(getEat());
    }
}
class Worker extends Person {
    String work = "일을 합니다.";
    String getEat() {
        return "직장인이 " + eat;
    }
    void  viewWorker() {
        System.out.println(work);
        System.out.println(getEat());
    }
}
class HouseWife extends Person {
    String houseKeeping = "집안일을 합니다.";
    String getEat() {
        return "주부가 " + eat;
    }
    void viewHouseWife() {
        System.out.println(houseKeeping);
        System.out.println(getEat());
    }
}