package com.kh.RestApi.servlet;
import com.kh.RestApi.common.Common;
import com.kh.RestApi.dao.MemberDAO;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginServlet extends HttpServlet {
    @PostMapping("/LoginServlet")
    protected void doPost(HttpServletRequest req, HttpServletResponse rsp)
            throws IOException {
        req.setCharacterEncoding("utf-8");
        rsp.setCharacterEncoding("utf-8");
        StringBuffer sb = Common.reqStringBuff(req);
        JSONObject jsonObject = Common.getJsonObj(sb);
        String getId = (String)jsonObject.get("id");
        String getPwd = (String)jsonObject.get("pwd");

        MemberDAO dao = new MemberDAO();
        boolean isReg = dao.loginCheck(getId, getPwd);

        PrintWriter out = rsp.getWriter();
        JSONObject resJson = new JSONObject();
        if(isReg) resJson.put("result", "OK");
        else resJson.put("result", "NOK");
        out.print(resJson);
    }
}
