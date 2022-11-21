package 회원정보만들기;
public class MemberMainEx {
    public static void main(String[] args) {
        Member member = new Member(); // member : 참조변수
        member.setName();
        member.setAge();
        member.setGender();
        member.setJobs();
        member.viewInfo();

    }
}
