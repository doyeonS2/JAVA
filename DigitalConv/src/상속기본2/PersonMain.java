package 상속기본2;
public class PersonMain {
    public static void main(String[] args) {
        Worker work = new Worker();
        work.viewWorker();
        Student student = new Student();
        student.viewStudent();
        HouseWife houseWife = new HouseWife();
        houseWife.viewHouseWife();
    }
}
