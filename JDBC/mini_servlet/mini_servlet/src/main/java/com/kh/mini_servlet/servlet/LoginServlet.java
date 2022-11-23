package com.kh.mini_servlet.servlet;
import com.kh.mini_servlet.common.Common;
import com.kh.mini_servlet.dao.LoginDAO;
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
public class LoginServlet extends HttpServlet {
    @PostMapping("/LoginServlet")
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지를 위해서 설정
        StringBuffer sb = Common.reqStringBuff(request); // 요청 메시지 받기
        JSONObject jsonObj = Common.getJsonObj(sb); // 요청 받은 메시지 JSON 파싱

        String getId = (String)jsonObj.get("id");
        String getPwd = (String)jsonObj.get("pwd");

        LoginDAO dao = new LoginDAO();
        int resState = dao.loginCheck(getId, getPwd);

        PrintWriter out = response.getWriter();
        JSONObject resJson = new JSONObject();

        resJson.put("result", resState);
        out.print(resJson);

    }

}
