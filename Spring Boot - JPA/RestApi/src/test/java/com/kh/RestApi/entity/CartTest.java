package com.kh.RestApi.entity;
import com.kh.RestApi.dao.CartRepository;
import com.kh.RestApi.dao.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional // 트랜잭션 : 여러가지 기능을 묶어놓은 것
@Slf4j
@TestPropertySource(locations = "classpath:application-test.properties")
class CartTest {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    MemberRepository memberRepository;
    @PersistenceContext
    EntityManager em; // EntityManager : 디비와 관련된 객체를 관리(연관 관계 관리)
    public Member createMember() {
        Member member = new Member();
        // 멤버 엔티티로 회원 만들기
        member.setUserId("gooreumseng");
        member.setPwd("hsw0322");
        member.setName("하셍언");
        member.setEmail("gooreumseng@gmail.com");
        member.setRegData(LocalDateTime.now());
        return member;
    }
    @Test
    @DisplayName("장바구니 회원 매핑 테스트")
    public void findCartAndMemberTest() {
        Member member = createMember();
        memberRepository.save(member);

        Cart cart = new Cart();
        cart.setMember(member);
        cartRepository.save(cart);

        em.flush(); // 영속성 컨텍스트에 데이터 저장 후 트랜잭션이 끝날 때 디비에 반영
        em.clear(); // 버퍼 비우기
        Cart savedCart = cartRepository.findById(cart.getId()).orElseThrow(EntityNotFoundException::new);
        assertEquals(savedCart.getMember().getUserId(),member.getUserId());
    }

}