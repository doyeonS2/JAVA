package 어레이리스트2;

public class MenuInfo {
    String name; // 메뉴명
    int price; // 가격
    String category; // 분류
    String desc; // 설명
    boolean isTax; // 세금 포함 여부

    public MenuInfo(String name, int price, String category, String desc, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
        this.isTax = isTax;
    }
    public String getJsonFormat() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";

    }
}
