package com.shop.config;
import com.shop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity // 시큐리티 설정을 커스터마이징 할 수 있도록 해줌
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    MemberService memberService;
    @Override // http 요청에 대한 보안을 설정 (페이지 권한 설정, 로그인 페이지 설정..)
    protected void configure(HttpSecurity http) throws Exception {
        // 로그인 기능
        http.formLogin()
                .loginPage("/member/login") // 로그인 페이지 위치
                .defaultSuccessUrl("/") // 로그인 성공 시 이동할 경로
                .usernameParameter("email") // 로그인 시 사용할 파라미터를 email로 지정
                .failureUrl("/members/login/errer") // 로그인 실패시 이동할 URL
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/members/logout")) // 로그아웃
                .logoutSuccessUrl("/"); // 로그아웃 성공 시 이동할 페이지
    }
    @Bean // 비밀번호를 DB에 그대로 저장하면 회원정보가 노출될 수 있으므로 암호화가 필수적으로 필요
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    // 인증은 AuthenticationManager를 통해 이루어짐
    // 비밀번호 암호화를 위해 passwordEncoder를 지정
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(memberService).passwordEncoder(passwordEncoder());
    }
}
