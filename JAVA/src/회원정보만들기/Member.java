package 회원정보만들기;
import java.util.Scanner;
// 이름(문자열), 나이(정수), 성별(문자), 직업(정수)
// 나이를 입력 받기 : 1 ~ 199 사이 입력
// 성별은 'm', 'M', 'f', 'F'
// 직업은 1 ~ 4
// 전체 출력 : 회원정보 전체 출력
public class Member { //
    private String name; // 인스턴스 필드 (인스턴스 : 실체화, 객체 변수) // 접근제한자 (캡슐화 : 데이터 은닉 - 객체의 4대 특성 중 하나)
    private int age;
    private char gender;
    private int jobs;
    // 이름을 입력 받아보기 (setter 메소드)
    public void setName() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("이름을 입력 하세요. : ");
        name = sc.next();
    }
    public void setAge() {
        Scanner sc =  new Scanner(System.in);
        while(true) {
            System.out.print("나이를 입력 하세요. : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) return; // return : 나를 불러준쪽으로 되돌아간다.
            System.out.println("나이를 잘못 입력했습니다.");
        }
    }
    public void setGender() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("성별을 입력 하세요. : ");
            gender = sc.next().charAt(0); // 문자열에서 0번째 문자를 추출
            switch (gender) {
                case 'M': case 'm': case 'F': case 'f': return;
                default :
                    System.out.println("성별을 잘못 입력하셨습니다.");
            }
        }
    }
    public void setJobs() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("직업을 입력 하세요. : ");
            jobs = sc.nextInt();
            if(jobs > 0 && jobs < 5) return; // 1.학생 2.회사원 3.주부 4.무직
            System.out.println("직업을 잘못 입력하셨습니다.");
        }
    }
    public int getGenderType() {
        if(gender == 'M' || gender == 'm') return 1;
        else return 2;
    }

    public void viewInfo() {
        final String[] genderStr = {"", "남성", "여성"};
        final String[] jobsStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("====== 회원정보 ======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobsStr[jobs]);
    }
}
