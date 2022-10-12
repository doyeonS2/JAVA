//package 자바3차시험대비;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//// 2. IO를 이용하여 기존 파일에 데이터를 이어쓸 수 있도록 구현
//public class OutputMain {
//    public static void main(String[] args) {
//        FileWriter fw = null; // 문자 기반 스트림으로 텍스트 데이터를 파일에 저장할 때 사용(문자 단위로 파일에 기록)
//        try {
//            fw = new FileWriter("src/자바3차시험대비/test.txt", true); // true 옵션을 추가해야 함
//            fw.write(97);
//            fw.write(65);
//            fw.close(); // fw.close();가 빠져서 안된 것,, 요기를 유심히 봐야함 (파일을 열었으면 close 해줘야함)
//            // 파일 출력 이후는 반드시 close()해줘야 함. close() 안하면 파일이 안읽힌다.
//
//        } catch (FileNotFoundException e) {
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}
//
// // append 해야 됨!!!!!!!!!!!!!!!!!!!!! (두번째 매개변수에 true 넣기!!!!!!!!!!!!!)
// // close 해줘야 됨!!!!!!!!!!!!!