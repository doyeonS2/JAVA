package 직업상속과인터;
//
public class JobsMainEx {
    public static void main(String[] args) {
        Student student = new Student("공부", "게임", 18, "나희도");
        student.setHobby("펜싱");
        student.setFriend("고유림");
        student.getInfo();
    }
}
