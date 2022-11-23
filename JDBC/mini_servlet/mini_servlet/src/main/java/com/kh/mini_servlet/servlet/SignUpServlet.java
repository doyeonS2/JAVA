package com.kh.mini_servlet.servlet;

import com.kh.mini_servlet.common.Common;
import com.kh.mini_servlet.dao.SignUpDAO;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@CrossOrigin(origins = "http://localhost:3000") // 3000번 포트를 허용하겠다! 리액트가 3000번 포트여야 돌아감
@RestController
public class SignUpServlet extends HttpServlet  {
    @PostMapping("/SignUpServlet")
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지를 위해서 설정
        StringBuffer sb = Common.reqStringBuff(request); // 요청 메시지 받기
        JSONObject jsonObj = Common.getJsonObj(sb); // 요청 받은 메시지 JSON 파싱
        String getId = (String)jsonObj.get("id");
        String getPwd = (String)jsonObj.get("pwd");
        String getPwdCheck = (String)jsonObj.get("pwdCheck");
        String getMemName = (String)jsonObj.get("memName");
        String getEmail = (String)jsonObj.get("email");
        String getEmailName = (String)jsonObj.get("emailName");
        String getPhone1 = (String)jsonObj.get("phone1");
        String getPhone2 = (String)jsonObj.get("phone2");
        String getPhone3 = (String)jsonObj.get("phone3");
        String getPhoneNum = (String)jsonObj.get("phoneNum");
        String getAddrNum = (String)jsonObj.get("addrNum");
        String getAddr1 = (String)jsonObj.get("addr1");
        String getAddr2 = (String)jsonObj.get("addr2");
        String getRegDate = (String)jsonObj.get("regDate");

        SignUpDAO dao = new SignUpDAO();
        boolean rstComplete = dao.memberRegister(getId, getPwd, getPwdCheck, getMemName, getEmail, getEmailName, getPhone1, getPhone2, getPhone3, getPhoneNum, getAddrNum, getAddr1, getAddr2, getRegDate ); // memberRegister : DAO라는 객체에 있는 메소드(MemberDAO 파일에 메소드 만들어야 함)

        PrintWriter out = response.getWriter();
        JSONObject resJson = new JSONObject();
        if(rstComplete) resJson.put("result", "OK");
        else resJson.put("result", "NOK");
        out.print(resJson);

    }
}
