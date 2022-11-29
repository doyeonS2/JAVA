package com.shop.entity;
import com.shop.constant.Role;
import com.shop.dto.MemberFormDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;
import javax.persistence.*;

// 어노테이션 추가
@Entity
@Table(name = "member")
@Getter @Setter
@ToString
public class Member {
    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;
    @Column(unique = true) // 이메일은 유일한 값이 와야함
    private String email;
    private String address;
    @Enumerated(EnumType.STRING) // DB에 저장될 때 문자열로 저장됨
    private Role role;

    public static Member createMember(MemberFormDto memberFormDto, PasswordEncoder passwordEncoder) { // 리턴값을 Member로 되돌려 받음 // PasswordEncoder : 암호화를 위해 넣음
        Member member = new Member();
        member.setName(memberFormDto.getName());
        member.setEmail(memberFormDto.getEmail());
        member.setAddress(memberFormDto.getAddress());
        // 비밀번호는 entity에 값을 바로 넣지 않고 암호화 이후에 값을 넣어줌
        String password = passwordEncoder.encode(memberFormDto.getPassword());
        member.setPassword(password);
        member.setRole(Role.USER); // 일반 유저
        return member;

    }
}
