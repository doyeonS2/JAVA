package 자바종합실습2번;
// 직렬화를 위한 클래스 만들기
// transient : 직렬화에서 제외
import java.io.Serializable;
public class NameCardS implements Serializable {
    private String name;
    private String phone;
    private String company;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NameCardS(String name, String phone, String company, String email) {
        this.name = name;
        this.phone = phone;
        this.company = company;
        this.email = email;

    }
}
