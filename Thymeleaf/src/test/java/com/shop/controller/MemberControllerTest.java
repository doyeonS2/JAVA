package com.shop.controller;
import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import com.shop.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers;
import org.springframework.test.web.servlet.MockMvc;
import javax.transaction.Transactional;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;

@SpringBootTest
@AutoConfigureMockMvc // MockMvc 테스트 위해 어노테이션 선언 // 실제와 비슷하게 샘플을 만들어서 테스트를 돌려보겠다.. (목업)
@Transactional
class MemberControllerTest {
    @Autowired
    private MemberService memberService;
    @Autowired
    private MockMvc mockMvc; // 실제 객체와 비슷하지만 테스트에 필요한 기능만 가지는 가짜 객체
    @Autowired
    PasswordEncoder passwordEncoder;
    // 로그인 테스트 진행 이전에 회원 등록하는 메소드 만들기
    public Member createMember(String email, String password) {
        MemberFormDto memberFormDto = new MemberFormDto();
        memberFormDto.setEmail(email);
        memberFormDto.setName("옹동이");
        memberFormDto.setAddress("서울시 은평구 불광동");
        memberFormDto.setPassword(password);
        Member member = Member.createMember(memberFormDto, passwordEncoder);
        return memberService.saveMember(member);
    }
    @Test
    @DisplayName("로그인 성공 테스트")
    public void loginSuccessTest() throws Exception {
        String email = "hip2236@gmail.com";
        String password = "12345678";
        this.createMember(email, password);
        mockMvc.perform(formLogin().passwordParam("email")
                .loginProcessingUrl("/member/login") // 회원가입 메소드 실행 후 가입된 정보로 로그인 되는지 테스트
                .user(email).password(password))
                .andExpect(SecurityMockMvcResultMatchers.unauthenticated()); // 로그인 성공하여 인증이 되면 통과 // authenticated : 인증하는거.. unauthenticated : 인증안하는거..
    }

}