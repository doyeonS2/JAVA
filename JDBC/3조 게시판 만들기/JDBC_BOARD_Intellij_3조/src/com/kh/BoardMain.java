package com.kh;
import com.kh.dao.*;
import com.kh.vo.MemberVO;
import com.kh.vo.WriteVO;

import java.util.List;
import java.util.Scanner;
public class BoardMain {
    public static void main(String[] args) {
        MemberSelect();
    }

    public static void MemberSelect() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========[MEMBER Table 조회]==========");
            System.out.println("메뉴를 선택하세요");
            System.out.println("[1] 회원가입 [2] 회원정보 [3] 글쓰기 [4] 글보기 [5] 글삭제 [6] 게시판나가기 [7] 회원탈퇴");
            int sel = sc.nextInt();

            switch (sel) {
                case 1:
                    MemberInsertDao insert = new MemberInsertDao();
                    insert.empInsert();
                    break;

                case 2:
                    MemberSelectDao select = new MemberSelectDao();
                    List<MemberVO> list = select.listMember();
                    select.printEmpSelect(list);
                    break;

                case 3:
                    Write_dao insert2 = new Write_dao();
                    insert2.writeSelect();
                    break;

                case 4:
                    Read_dao select2 = new Read_dao();
                    List<WriteVO> list2 = select2.Read();
                    select2.printRead(list2);
                    break;

                case 5:
                    System.out.println("게시판을 종료합니다.");
                    return;

                case 6:
                    MemberDeleteDao delete = new MemberDeleteDao();
                    delete.empDelete();
                    break;


            }
        }
    }
}
