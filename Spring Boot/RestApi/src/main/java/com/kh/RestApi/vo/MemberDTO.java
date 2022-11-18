package com.kh.RestApi.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// DTO : 단지 정보 전송용이기 때문에 생성자가 필요없음(게터, 세터만 필요 - 내부가 안보이게 캡슐화 특성)
public class MemberDTO {
    private String user;
    private String pwd;
    private String name;
    private String email;
    private String grade;

}
