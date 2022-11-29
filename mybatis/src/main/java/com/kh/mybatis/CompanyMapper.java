package com.kh.mybatis;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface CompanyMapper { // interface : 추상화 문법
    @Insert("INSERT INTO company(company_name, company_address) VALUES(#{company.name}, #{company.address})")
    @Options(useGeneratedKeys = true, keyProperty = "id") // 아이디는 자동 생성을 하겠다!
    int insert(@Param("company") Company company);

    @Select("SELECT * FROM company")
    @Results({
            @Result(property = "name", column = "company_name"), // 객체에서는 name, DB에서는 company_name 일 때 이름 맞춰주는 것
            @Result(property = "address", column = "company_address")
    })
    List<Company> getAll(); // get : 얻어온다!
}
