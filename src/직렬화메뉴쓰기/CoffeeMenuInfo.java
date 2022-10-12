package 직렬화메뉴쓰기;
import java.io.Serializable;
// 직렬화할 클래스
// transient 키워드를 사용하면 직렬화에서 제외된다.
public class CoffeeMenuInfo implements Serializable {
    private String name; // 메뉴 이름
    private int price; // 가격
    private String group; // 분류
    private String desc; // 설명

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CoffeeMenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;


    }
}
