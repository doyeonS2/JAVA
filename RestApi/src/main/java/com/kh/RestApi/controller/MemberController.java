package com.kh.RestApi.controller;
import com.kh.RestApi.dao.MemberDAO;
import com.kh.RestApi.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MemberController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName()); // 로그 찍을 때 sout 대신 이걸로 쓰기!

    @GetMapping("/GetMemberParam")
    public ResponseEntity <List<MemberVO>> memberList(@RequestParam String cmd) {
        if(cmd.equals("MemberList")) {
            MemberDAO dao = new MemberDAO();
            List<MemberVO> list = dao.memberSelect();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/Login")
    public Map<String, String> memberLogin(@RequestBody Map<String, String> loginData) {
        String getId = loginData.get("id");
        String getPwd = loginData.get("pwd");
        //System.out.println("Login Controller Call !!!!");
        LOGGER.error("Login Controller Call !!!!");
        LOGGER.warn("Login Controller Call !!!!");
        LOGGER.info("Login Controller Call !!!!");
        LOGGER.debug("Login Controller Call !!!!");
        LOGGER.trace("Login Controller Call !!!!");

        MemberDAO dao = new MemberDAO();
        boolean isReg = dao.loginCheck(getId, getPwd);
        Map<String, String> map = new HashMap<>();
        if(isReg) map.put("result", "OK");
        else map.put("result", "NOK");
        return map;
    }
    @PostMapping("MemberCheck")
    public ResponseEntity<Map<String, String>> memberCheck(@RequestBody Map<String, String> chkData) {
        String getId = chkData.get("id");
        MemberDAO dao = new MemberDAO();
        boolean isTrue = dao.regMemberCheck(getId);
        Map<String, String> map = new HashMap<>();
        if(isTrue) {
            map.put("result", "OK");
            return new ResponseEntity(map, HttpStatus.OK);
        } else {
            map.put("result", "NOK");
            return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
        }
    }

    // 조회 -> GET 방식
    // 어떤 값을 설정하는 등.. 로그인 -> POST 방식
    @PostMapping("/RegMember")
    public ResponseEntity<Map<String, String>> memberRegister(@RequestBody Map<String, String> regData) {
        // 가입 정보를 regData에 담겠다
        String getId = regData.get("id");
        String getPwd = regData.get("pwd");
        String getName = regData.get("name");
        String getMail = regData.get("mail");
        MemberDAO dao = new MemberDAO();
        boolean isTrue = dao.memberRegister(getId, getPwd, getName, getMail);
        Map<String, String> map = new HashMap<>();
        if(isTrue) {
            map.put("result", "OK");
            return new ResponseEntity(map, HttpStatus.OK);
        } else {
            map.put("result", "NOK");
            return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
        }
    }
}
