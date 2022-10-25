package com.kh.dao;

import com.kh.util.Common;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class MemberDeleteDao {
    public void empDelete() {
        Connection conn = null;
        Statement stmt = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 ID를 입력 하세요 : ");
        String ID = sc.next();

        String query = "DELETE FROM MEMBER WHERE ID = " + "'" + ID + "'";

        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            int ret = stmt.executeUpdate(query);
            System.out.println("Return : " + ret);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Common.commit(conn);
        Common.close(stmt);
        Common.close(conn);

    }
}
