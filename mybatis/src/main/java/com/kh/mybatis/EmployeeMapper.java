package com.kh.mybatis;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Insert("INSERT INTO employee(company_id, employee_name, employee_address)" +
            "VALUES(#{employee.companyId}, #{employee.name}, #{employee.address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("employee") Employee employee);

    @Select("SELECT * FROM employee")
    @Results(id="EmployeeMap", value = { // 재사용하기위해 id값 지정
            @Result(property = "companyId", column = "company_id"),
            @Result(property = "name", column = "employee_name"), // 객체에서는 name, 디비에서는 employee_name이라서 이름 맞춰줌
            @Result(property = "address", column = "employee_address")
    })
    List<Employee> getAll();

    // 개별 id 조회

    @Select("SELECT * FROM employee WHERE id=#{id}") // 내 id와 같은 애, 사원번호 같은 애 찾기
    @ResultMap("EmployeeMap")
    Employee getById(@Param("id") int id);

    @Select("SELECT * FROM employee WHERE company_id=#{companyId}") // #{} : 매개변수가 대입되는 자리 // companyId가 같은 애 찾기
    @ResultMap("EmployeeMap") // 재사용! 반복 사용할 것을 이 한줄로 간단하게 사용
    List<Employee> getByCompanyId(@Param("companyId") int companyId);
}
