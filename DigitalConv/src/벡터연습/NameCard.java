package 벡터연습;
public class NameCard {
    String name;
    String mail;
    String phone;
    String jobs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;

    }
}
