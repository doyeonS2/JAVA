package com.shop.service;
import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import javax.transaction.Transactional;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest // 테스트
@Transactional // 여러개 묶어서 테스트 // Transactional를 줘야 자동 롤백이 됨
class MemberServiceTest {
    @Autowired // 의존성 주입
    MemberService memberService;
    @Autowired
    PasswordEncoder passwordEncoder; // config에서 bean 등록을 해줬기때문에 사용 가능
    public Member createMember() {
        MemberFormDto memberFormDto = new MemberFormDto();
        memberFormDto.setEmail("doyeon2@nate.com");
        memberFormDto.setName("도여니");
        memberFormDto.setAddress("경기도 용인시");
        memberFormDto.setPassword("dodo123");
        return Member.createMember(memberFormDto, passwordEncoder);
    }
    @Test
    @DisplayName("회원가입테스트")
    public void saveMemberTest() {
        Member member = createMember();
        Member savedMember = memberService.saveMember(member);
        assertEquals(member.getEmail(), savedMember.getEmail());
        assertEquals(member.getName(), savedMember.getName());
        assertEquals(member.getAddress(), savedMember.getAddress());
        assertEquals(member.getPassword(), savedMember.getPassword());
        assertEquals(member.getRole(), savedMember.getRole());
    }
}