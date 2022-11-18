package com.kh.RestApi.service;
import com.kh.RestApi.dao.MemberRepository;
import com.kh.RestApi.entity.MemberInfo;
import com.kh.RestApi.vo.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service // 서비스를 빈(bean)에 등록
@Slf4j // 로그를 찍기 위함
public class MemberService {
    // 레파지토리를 가져와서 등록
    private MemberRepository memberRepository; // 의존성 주입 (제어의 역전)
    public MemberService(MemberRepository memberRepository) { // 매개변수로 전달받는 방법(레파지토리를 외부에서 생성)
        this.memberRepository = memberRepository;
    }
    // 컨트롤러가 정보에 개입은 못하고 단지 요청과 응답만! 전달만! (데이터 전달용)
    // 전체 회원 조회
    public List<MemberDTO> getMemberList() {
        List<MemberDTO> memberDTOS = new ArrayList<>(); // 새로 원하는 정보를 담기 위해 new 객체 생성
        List<MemberInfo> memberInfoList = memberRepository.findAll(); // 담아온 정보(디비 정보랑 똑같은 정보) // findAll : 모든 유저를 다 긁어옴
        for(MemberInfo e : memberInfoList) {
            MemberDTO memberDTO = new MemberDTO();
            memberDTO.setUser(e.getUserId()); // 디비에서 읽어왔던 요소 중에서 유저아이디를 객체에 담음
            memberDTO.setPwd(e.getPwd());
            memberDTO.setName(e.getName());
            memberDTO.setEmail(e.getEmail());
            memberDTO.setGrade("VIP"); // 디비 테이블에 없는 정보.. 새로 만들어줘야함..
            memberDTOS.add(memberDTO);
        }
        return memberDTOS;
    }

    // userID로 회원 조회하기
    public List<MemberDTO> getMemberList(String user) {
        List<MemberDTO> memberDTOS = new ArrayList<>(); // 새로 원하는 정보를 담기 위해 new 객체 생성
        List<MemberInfo> memberInfoList = memberRepository.findByUserId(user); // 담아온 정보(디비 정보랑 똑같은 정보) // findAll : 모든 유저를 다 긁어옴
        for(MemberInfo e : memberInfoList) {
            MemberDTO memberDTO = new MemberDTO();
            memberDTO.setUser(e.getUserId()); // 디비에서 읽어왔던 요소 중에서 유저아이디를 객체에 담음
            memberDTO.setPwd(e.getPwd());
            memberDTO.setName(e.getName());
            memberDTO.setEmail(e.getEmail());
            memberDTO.setGrade("VIP"); // 디비 테이블에 없는 정보.. 새로 만들어줘야함..
            memberDTOS.add(memberDTO);
        }
        return memberDTOS;

    }


    // 회원가입
    public boolean regMember(String userId, String pwd, String name, String mail) { // 회원가입은 성공, 실패 두가지여서 boolean
        MemberInfo memberInfo = new MemberInfo(); // 객체 생성(여기다가 정보를 담아줄거야~)
        memberInfo.setUserId(userId); // 프엔에서 날라온 정보를 담아주기
        memberInfo.setPwd(pwd);
        memberInfo.setName(name);
        memberInfo.setEmail(mail);
        memberInfo.setJoin(LocalDateTime.now());
        // 레파지토리를 호출
        MemberInfo rst = memberRepository.save(memberInfo);
        log.warn(rst.toString()); // 찍어보기(확인용)
        return true;
    }
    // 로그인
    public boolean loginCheck(String user, String pwd) {
        List<MemberInfo> memberInfoList = memberRepository.findByUserIdAndPwd(user, pwd);
        for(MemberInfo e : memberInfoList) {
            return true;
        }
        return false;
    }
}
