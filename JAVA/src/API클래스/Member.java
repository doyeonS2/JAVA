package API클래스;

public class Member implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    // getMember() 메소드의 반환 타입이 Member
    public Member getMember() throws CloneNotSupportedException {
        Member cloned = null;
        cloned = (Member) clone();
        return cloned;


    }
}
