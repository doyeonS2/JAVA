package com.kh.dao;

import com.kh.util.Common;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class WriteDelete_dao {
    public void writeDelete() {
        Connection conn = null;
        Statement stmt = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 글번호를 입력 하세요 : ");
        int WRITE_NUM = sc.nextInt();

        String query = "DELETE FROM WRITE WHERE WRITE_NUM = " + "'" + WRITE_NUM + "'";

        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            int ret = stmt.executeUpdate(query);
            System.out.println("Return : " + ret);

        } catch (Exception e) {
            e.printStackTrace();
        }
//        Common.commit(conn);
        Common.close(stmt);
        Common.close(conn);
    }
}