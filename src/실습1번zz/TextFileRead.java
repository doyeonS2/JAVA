package 실습1번zz;


import java.io.*;
        import java.util.*;

public class TextFileRead {
    public static void main(String[] args) throws IOException {
        try {

            FileReader reader = new FileReader("C:/실습파일/10명성적.txt");

            int readChar;
            char[] chars = new char[100];
            String data = "";
            String[] tmp;
            String[] str;

            String[] name = new String[10];
            int[] score = new int[10];

            while(true) {
                readChar = reader.read(chars);
                if(readChar == -1) break;
                data += new String(chars,0,readChar);
            }
            reader.close();

            str = data.split(" ");

            name[0] = str[0];
            for(int i = 1 ; i < 10; i ++){
                name[i] = str[i*3].substring(3,6);
            }


            for(int i = 0; i < 10; i++) {
                score[i] = (Integer.parseInt(str[i*3+1]) + Integer.parseInt(str[i*3+2]));
            }   // 점수 부분 숫자로 변경해주기.  3번째 인덱스는 값이 이상해서 따로 분리해서 숫자로      //변경해주어야함

            score[0] += Integer.parseInt(str[3].substring(0,2));
            for(int i = 1; i < 10; i++) {
                score[i] += Integer.parseInt(str[i * 3].substring(0, 2));
            }  // 3배수의 인덱스마다 값이 뭉쳐서 들어간걸 분리해서 숫자로 변경해줌

            TreeMap<Integer, String> nameScoreMap = new TreeMap<>();
            for(int i = 0; i < 10; i++)
                nameScoreMap.put(score[i], name[i]);  // 내림차순으로 보기 쉽게 하기 // 위해 트리맵에 점수 이름 순으로 넣어줌

            NavigableSet<Integer> navi = nameScoreMap.navigableKeySet();

            Iterator<Integer> iterator = navi.descendingIterator(); //내림차순 정렬

            while(iterator.hasNext()){
                System.out.println(nameScoreMap.get(iterator.next()));
            }
        } catch (IOException e) {}

    }
}