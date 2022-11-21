package com.kh.RestApi.dao;

import com.kh.RestApi.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j // "로그포제이"라고 읽으면 됨
@TestPropertySource(locations = "classpath:application-test.properties")
class MemberRepositoryTest {
    @Autowired // 자동 연결(의존성 주입 : 내가 만들지 않고 외부에서 만들어진 걸 주입시키기 때문에 new가 없음, 생존주기가 다름)
    MemberRepository memberRepository;
    @Test
    @DisplayName("회원가입 테스트")
    public void regMemberTest() {
        for(int i = 1; i <= 10; i++) { // 10명에 대한 정보 만들기
            Member memberInfo = new Member(); // new 객체 만들기
            memberInfo.setUserId("doyeon911" + i);
            memberInfo.setPwd("love1234");
            memberInfo.setName("도라에몽" + i);
            memberInfo.setEmail("1162004@naver.com" + i);
            memberInfo.setRegData(LocalDateTime.now()); // SYSDATE랑 같은 효과
            memberRepository.save(memberInfo); // 정보 만들어짐
            log.warn(memberInfo.toString());
        }
    }
}