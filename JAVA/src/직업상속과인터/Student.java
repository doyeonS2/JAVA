package 직업상속과인터;

public class Student extends Person implements Hobby, Friend{
    private String study;
    private String hobby;
    private String friend;

    public Student(String study, String hobby, int age, String name) {
        this.study = study;
        this.hobby = hobby;
        this.age = age;
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println(name + "밥을 먹습니다.");

    }

    @Override
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    void getInfo() {
        System.out.println("하는일 : " + study);
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("취미 : " + hobby);
        System.out.println("친구 : " + friend);

    }

    @Override
    public void setFriend(String friend) {
        this.friend = friend;

    }
}

