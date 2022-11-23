package com.kh;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member")
public class SampleServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse rsp) 
			throws ServletException, IOException {
		rsp.setContentType("text/html;charset=utf-8");
		PrintWriter out = rsp.getWriter();
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memberSelect();
		
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='royalblue'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td></tr>");
		for(MemberVO e : list) {
			String id = e.getId();
			String pwd = e.getPwd();
			String name = e.getName();
			String email = e.getEmail();
			Date join = e.getJoin();
			out.print("<tr><tr>" + id + "</td><td>" + pwd + "</td><td>"
					+ name + "</td><td>" + email + "</td><td>"
					+ join + "</td><td>");
		}
		out.println("</table></body></html>");
		
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 메소드 호출");
		
	}
}
