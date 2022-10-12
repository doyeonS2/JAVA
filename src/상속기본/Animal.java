package 상속기본;
public class Animal {
    protected String name; // 접근 제한자 private은 같은 클래스 내에서만 접근 가능
    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + "zzz");
    }

}
class HouseDog extends Dog {
    @Override // 오버라이드 관계라는 걸 표시한 것(지워도 됨)
    void sleep() {
        System.out.println(this.name + "zzz in house");
    }
}