package 자바3차시험대비; // 4번, 7번 면접에도 자주나옴@@

import java.text.SimpleDateFormat;
import java.util.*;

// 서술형
// 1. 상속에 대해 서술 : 부모가 가진 멤버(필드, 메소드)를 새로 작성하지 않고 물려 받아 자신의 것처럼 사용 하는 것
// 2. 다형성에 대해서 서술 : 상속을 이용한 기술로 부모 타입으로부터 파생된 여러가지 타입의 자식 객체를 부모 클래스 타입으로 다룰 수 있는 기술
// 3. 오버라이딩에 대해서 서술 : 부모 클래스의 메소드를 상속받아 재정의해서 사용하는 것. 이 경우 자식 메소드가 우선
// 4. 오버로딩과 오버라이딩의 차이점 기술 :
// - 오버로딩 : 동일 클래스내에서 동일한 메소드 이름을 사용하는 매개변수의 타입이나 개수가 달라야한다.
// - 오버라이딩 : 부모 클래스에서 정의되어 있는 메소드를 자식 클래스에서 재정의 하는 것 (매개변수, 자료형, 개수, 순서가 동일해야 함)
// 5. String 클래스의 주요 메소드 설명
// - charAt(int index) : 주어진 문자열에서 해당 인덱스의 문자 추출해서 반환하는 메소드
// - length() : 문자열의 길이를 반환하는 메소드
// - substring(begin, end) : begin 부터 end 미만까지의 문자열을 추출해서 반환하는 메소드
// - toUpperCase() : 해당 문자열의 전부를 대문자로 변경
// - toLowerCase() : 해당 문자열의 전부를 소문자로 변경
// 6. String str = "Apple, Kiwi, Strawberry, Banana"; => Kiwi 문자열을 출력
//public class Ex1 {
//    public static void main(String[] args) {
//        String str = "Apple, Kiwi, Strawberry, Banana";
//        String[]arr = str.split(", ");
//        System.out.println(arr[1]);
// 7. 인터페이스와 추상클래스의 차이점 기술
// - 추상클래스는 상속 시 키워드로 extends를 사용하며 단일 상속이다.
//   한개 이상의 추상 메소드가 존재해야 하고 일반 메소드드 포함할 수 있다.
// - 인터페이스는 상속 시 implements 키워드를 사용하고 다중 상속처럼 사용 가능하다.
//   인터페이스는 기본적으로 모든 메소드가 추상메소드 이므로 abstract를 생략할 수 있다.
// - 추상 클래스는 일반 필드를 포함할 수 있지만 인터페이스는 상수 필드만 가능하다.
// 8. 오버라이딩 성립 요건 5가지 기술
// - 메소드 이름이 같아야 함, 매개변수도 같아야 함, 반환 타입도 같아야 함, 접근제한자도 같아야 함, 예외처리도 같아야 함
// 9. Wrapper 클래스 8가지 기술 (기본 타입에 대한 참조 타입)
// - Boolean, Byte, Character, Short, Integer, Long, Float, Double
// 10. 문자열 "10"을 int 자료형인 10으로 변환시키기
// - Integer, parseInt("10"); // 문자열을 정수로 변환
// 11. 문자열 "13.45"를 double 자료형인 13.45로 변환
// Double.parseDouble("13.45");
// 12. Math 클래스의 메소드는 모두 정적 메소드이다.
// - min(num1, num2) : 전달된 2개의 값 중에서 작은값을 반환
// - max(num1, num2) : 전달된 2개의 값 중에서 큰 값을 반환
// - abs(num) : 전달된 값에 대한 절대값 반환
// - round(num) : 전달된 값에 대해 반올림한 결과를 반환
// - floor(num) : 전달된 수의 버림한 결과를 반환
// 13. StringTokenizer 클래스
// - countTokens() : 객체안에 담겨 있는 토큰의 개수를 반환 (꺼내지 않고 남아 있는 토큰의 수)
// - hasMoreTokens() : 남아있는 토큰이 있는지 확인
// - nextToken() : 토큰을 하나씩 가져와서 반환
//public class Ex1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 / 기준으로 연속 입력 : ");]
//        String name = sc.nextLine();
//        int idx = 0;
//        StringTokenizer st = new StringTokenizer(name, "/");
//        String[] nameArr = new String[st.countTokens()]; // 꺼내지 않고 남아 있는 토큰의 수
//        while (st.hasMoreTokens()) { // 남아 있는 토큰이 있는지 여부 확인
//            nameArr[idx++] = st.nextToken(); // 토큰을 하나씩 꺼내옴
//        }
//        for(String e : nameArr) {
//            System.out.println(e + " ");
//        }
//        System.out.println();
//    }
//    }
// 14. 현재 시스템 날짜 및 시간 가져오기 : SimpleDateFormat 클래스 이용 "2022년 8월 22일 15시 45분 45초" 츨력
//public class Ex1 {
//    public static void main(String[] args) {
//        Date today = new Date(); // 운영체제로부터 시간을 얻어옴
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//        String str = sdf.format(today);
//        System.out.println(str);
//    }
//}
// 15. 예외처리 관련 문제 : "부적절한 나눗셈을 시도하였습니다."
// - try { } catch(ArithmeticException e) { }
//public class Ex1 {
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(System.in);
//            int n1 = sc.nextInt(); // 나누어지는 수
//            int n2 = sc.nextInt(); // 나눌 수
//            System.out.println("두 수의 나눗셈 결과 : " + n1 / n2);
//        } catch (ArithmeticException e) {
//            System.out.println("부적절한 나눗셈을 시도하였습니다.");
//        }
//    }
//}
// 16. 예외처리 관련 문제
// - ArithmeticException 은 RuntimeException 의 자식 클래스 이기 때문에
// RuntimeException 에서 다형성 개념이 적용되므로 접근 가능하다.
//public class Ex1 {
//    public static void main(String[] args) {
//        try {
//            int result = 10 / 0;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//    }
//}
// 17. 0으로 나누기 연산시 발생될 수 있는 예외클래스 기술 하시오.
// - ArithmeticException
// 18. 배열에서 부적절한 인덱스 접근하려고 할 때 발생할 수 있는 예외클래스 기술
// ArrayIndexOutOfBoundsException (이게 답!!!!..........!!!!!!!!!!!)
//public class Ex1 {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // 인덱스 0 ~ 9 까지
//        System.out.println(arr[10]); // 10번 인덱스 없어서 에러 발생
//    }
//}
// 19. 배열의 크기를 음수로 지정하는 경우 발생하는 예외 클래스 기술
// NegativeArraySizeException (이게 답!!!!!!!!!!!!!)
//public class Ex1 {
//    public static void main(String[] args) {
//        int[] arr = new int[-1];
//    }
//}
// 20. 컬렉션 프레임워크 중 set 관련 문제
// -  add(E e) : 전달된 객체를 Set에 추가하는 메소드
// - isEmpty() : 해당 Set이 비어있는지 확인. 비어 있으면 true, 비어있지 않으면 false
// - size() : 해당 Set에 저장되어 있는 객체 수를 반환하는 메소드
// 21. Map 계열의 컬렉션 프레임워크 메소드 설명
// - put(K key, V value) : 전달된 키와 값을 해당 Map에 추가시켜주는 메소드
// - get(K key) : 전달된 키에 대한 객체를 반환해주는 메소드
// set 메소드 없는데????????????????? 문제 잘못된 듯????????
// - set(K key, V value) : 해당 Map에 전달된 키에 대한 값 객체를 전달된 값 객체로 변경해주는 메소드
// - keySet() : 모든 key를 담아 Set객체로 반환
// - entrySet() : 키와 값의 쌍으로 구성된 모든 Map.entry 객체를 Set에 담아서 리턴
//public class Ex1 {
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("안유진", 77);
//        map.put("이영지", 65);
//        map.put("이은지", 75);
//        map.put("미미", 56);
//
//        System.out.println(map.get("안유진"));
//
//        Set<String> keySet = map.keySet(); // 모든 key를 담아 Set객체로 반환
//        Iterator<String>iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            int value = map.get(key);
//            System.out.println(key + " : " + value);
//        }
//        // 모든 Map.entry 객체를 Set에 담아서 리턴
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
//        while (iterator1.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator1.next();
//            String key = entry.getKey();
//            int value = entry.getValue();
//            System.out.println(key + " : " + value);
//        }
//
//    }
//}
// 22. List 계열의 컬렉션 클래스 메소드 설명 기술
// - add(E e) : 전달된 객체를 리스트 끝에 추가
// - set(index, E e) : 해당 인덱스의 값을 전달된 객체로 변경
// - size() : 리스트에 저장된 객체의 수를 반환
// - remove(index) : 전달된 인덱스의 객체를 제거
// - get(index) : 해당 인덱스의 객체를 반환
//public class Ex1 {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("안유진");
//        list.add("이영지");
//        list.set(1, "미미");
//        list.remove(1);
//
//        for(String e : list) {
//            System.out.println(e + " ");
//        }
//    }
//}
// 23. Map에 담겨있는 요소들을 순차접근하기위한 두가지 방법,
// keySet(), entrySet()에 대해 기술하고 방법 설명
// keySet() : Map의 key를 Set에 담은 후 Set에 있는 Iterator를 통해 접근
// entrySet() : Map의 key와 값을 Set에 담은 후 Set에 있는 Iterator를 통해 접근
//public class Ex1 {
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        // 모든 key를 Set 객체에 담아서 리턴
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + "\t" + value);
//        }
//    }
//}
// 24. 자바의 배열과 컬렉션의 차이점 기술 (크기, 자료구조, 알고리즘, 타입)
// - 배열은 크기를 지정해야하고 한번 크기를 정하면 변경할 수 없지만 컬렉션의 크기는 제약이 없다.
// - 컬렉션은 정렬 및 반복자 등을 제공하여 알고리즘을 구현하는데 필수적인 요소를 제공하고 있다.
// - 배열은 한가지 타입으로 구성되지만 컬렉션은 객체 등을 통해서 다양한 데이터를 포함할 수 있다.
//
//
//
// -----------------------------------------------------
//interface  Person {
//    void eat();
//}
//class Student implements Person {
//    String name;
//    public Student(String name) {
//        this.name = name;
//    }
//    @Override
//    public void eat() {
//        System.out.println(name + "이 밥을 먹습니다.");
//    }
//}
//class Worker implements Person {
//    String name;
//    public Worker(String name) {
//        this.name = name;
//    }
//    @Override
//    public void eat() {
//        System.out.println(name + "이 밥을 먹습니다.");
//    }
//}
//
//public class Ex1 {
//    public static void main(String[] args) {
//        Person student = new Student("학생");
//        Person worker = new Worker("직장인");
//        student.eat();
//        worker.eat();
//
//
// -----------------------------------------------
//public class Ex1 {
//    public static void main(String[] args) {
//    }
//}
