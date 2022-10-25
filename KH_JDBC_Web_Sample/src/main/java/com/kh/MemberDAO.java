package com.kh;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public List<MemberVO> memberSelect() {
		List<MemberVO> list = new ArrayList<>();
		try {
			conn = Common.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM t_member";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("ID");
				String pwd = rs.getString("PWD");
				String name = rs.getString("NAME");
				String email = rs.getString("email");
				Date join = rs.getDate("JOIN");
				
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoin(join);
				list.add(vo);
			}
			Common.close(rs);
			Common.close(stmt);
			Common.close(conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}