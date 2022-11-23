package com.kh.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.common.Common;
import com.kh.vo.MemberVO;

// DB와 연결하는 부분 만들어주기
// 노션 DATABASE -> JDBC 구현 순서 참고

public class MemberDAO {
	private Connection conn = null; 
	private Statement stmt = null; // 표준 SQL문을 수행하기 위한 Statement 객체 얻기
	private ResultSet rs = null; // Statement의 수행 결과를 여러행으로 받음(다음에 읽을 게 없을때까지)
	// SQL문을 미리 컴파일해서 재사용하므로 Statement 인터페이스보다 훨씬 빠르게 데이터베이스 작업을 수행
	private PreparedStatement pstmt = null; 
	
	// 로그인 관련 메소드 만들기
	
	// 로그인 체크
	public boolean loginCheck(String id, String pwd) { // 아이디와 패스워드 입력받음
		try {
			conn = Common.getConnection();
			stmt = conn.createStatement(); // Statement 객체 얻기
			// 쿼리문 만들기(쿼리 날리기)
			String sql = "SELECT * FROM T_MEMBER WHERE ID = " + "'" + id + "'"; // 아이디 받아냄
			rs = stmt.executeQuery(sql); // 결과가 넘어옴
			
			// 결과 처리
			while(rs.next()) { // 읽을 데이터가 있으면 true
				String sqlId = rs.getString("ID"); // 쿼리 수행 결과에서 ID 값을 가져옴
				String sqlPwd = rs.getString("PWD"); 
				System.out.println("ID : " + sqlId);
				System.out.println("PWD : " + sqlPwd);
				// 조건 처리
				if(id.equals(sqlId) && pwd.equals(sqlPwd)) { // DB에 저장된 정보와 입력받은 아이디, 패스워드가 같은 지 물어보는 것
					Common.close(rs);
					Common.close(stmt);
					Common.close(conn);
					return true; 
				}
			}
			Common.close(rs);
			Common.close(stmt);
			Common.close(conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public List<MemberVO> memberSelect() {
		List<MemberVO> list = new ArrayList<>();
		try {
			conn = Common.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM T_MEMBER"; // 쿼리문 날리기 
			rs = stmt.executeQuery(sql); // DB에 있는 결과 얻기
			
			while(rs.next()) {
				String id = rs.getString("ID");
				String pwd = rs.getString("PWD");
				String name = rs.getString("NAME");
				String email = rs.getString("EMAIL");
				Date join = rs.getDate("JOIN");
				
				MemberVO vo = new MemberVO(); // 아이디, 패스워드, 이름, 메일, 조인 등.. 값을 저장할 수 있는 객체
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
			e.printStackTrace(); // 호출에 대한 스택을 출력하라(누가 어떻게 호출했는지를 쭉 뿌려달라는 것)
		}
		
		return list;
	}
	
	public boolean regIdCheck(String id) {
		boolean isNotReg = false;
		try {
			conn = Common.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM T_MEMBER WHERE ID = " + "'" + id + "'";
			rs = stmt.executeQuery(sql);
			if(rs.next()) isNotReg = false;
			else isNotReg = true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		Common.close(rs);
		Common.close(stmt);
		Common.close(conn);
		return isNotReg; // 가입되어 있으면 false, 가입이 안되어 있으면 true
	}
	public boolean memberRegister(String id, String pwd, String name, String mail) {
		int result = 0;
		String sql = "INSERT INTO T_MEMBER(ID, PWD, NAME, EMAIL, JOIN) VALUES(?, ?, ?, ?, SYSDATE)";
		try {
			conn = Common.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); // 첫번째 물음표에 id 들어감
			pstmt.setString(2, pwd); // 두번째에는 pwd
			pstmt.setString(3, name);
			pstmt.setString(4, mail);
			result = pstmt.executeUpdate();
			System.out.println("회원 가입 DB 결과 확인 : " + result);
			
		} catch (Exception e) { // 예외 처리 구문
			e.printStackTrace(); // 에러 위치 찾아줌(맨 마지막에 불려진게 맨 위로 올라감 => 에러 부분이 맨 위에 있다는 것)
		}
		Common.close(rs);
		Common.close(pstmt);
		Common.close(conn);
		
		if(result == 1) return true;
		else return false;
		
	}
	
	public boolean MemberDelete(String id) {
		int result = 0;
		String sql = "DELETE FROM T_MEMBER WHERE ID = ?";
		
		try {
			conn = Common.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt = setString(1, id);
		}
	}
}
