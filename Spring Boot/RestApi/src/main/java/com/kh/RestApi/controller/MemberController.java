package com.kh.RestApi.controller;
import com.kh.RestApi.service.MemberService;
import com.kh.RestApi.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MemberController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName()); // 로그 찍을 때 sout 대신 이걸로 쓰기!
    // service 로직 연결
    private MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/GetMemberParam")
    public ResponseEntity <List<MemberVO>> memberList(@RequestParam String id) {
        LOGGER.info("회원 조회 아이디 : " + id);
        List<MemberVO> list = memberService.getMemberList(id);

            return new ResponseEntity<>(list, HttpStatus.OK);
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

//        MemberDAO dao = new MemberDAO();
//        boolean isReg = dao.loginCheck(getId, getPwd);
        Map<String, String> map = new HashMap<>();
//        if(isReg) map.put("result", "OK");
//        else map.put("result", "NOK");
        return map;
    }
    @PostMapping("MemberCheck")
    public ResponseEntity<Map<String, String>> memberCheck(@RequestBody Map<String, String> chkData) {
        String getId = chkData.get("id");

        Map<String, String> map = new HashMap<>();
            return new ResponseEntity(map, HttpStatus.OK);
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

        Map<String, String> map = new HashMap<>();
            return new ResponseEntity(map, HttpStatus.OK);
    }
}
