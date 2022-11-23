package com.kh;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.dao.MemberSelectDao;
import com.kh.vo.MemberVO;


@WebServlet("/member")
public class ServletMain extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse rsp) 
			throws ServletException, IOException {
		rsp.setContentType("text/html;charset=utf-8");
		PrintWriter out = rsp.getWriter();
		MemberSelectDao dao = new MemberSelectDao();
		List<MemberVO> list = dao.listMember();
		
		out.print("<html><body>");
		out.print("<table border = 1> <tr align = 'center' bgcolor = 'orange'>");
		out.print("<td>회원번호</td><td>아이디</td><td>비밀번호</td><td>이름</td><td>생일</td>"
				+ "<td>성별</td><td>이메일</td><td>휴대폰</td><td>추천인</td><td>가입일</td></tr>");
		for(MemberVO e : list) {
			int num = e.getMEMBER_NUM();
			String id = e.getID();
			String pwd = e.getPASSWORD();
			String name = e.getNAME();
			String birth = e.getBIRTH();
			String gender = e.getGENDER();
			String email = e.getEMAIL();
			String phone = e.getPHONE();
			String recomID = e.getRECOMMENDER_ID();
			String join = e.getREG_DATE();
			out.print("<tr><td>" + num + "</td><td>"+ id + "</td><td>" + pwd + "</td><td>"
					+ name + "</td><td>" + birth + "</td><td>" + gender + "</td><td>"
					+ email + "</td><td>" + phone + "</td><td>" + recomID + "</td><td>"
					+ join + "</td></tr>");
		}
		out.print("</table></body></html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}
	
}