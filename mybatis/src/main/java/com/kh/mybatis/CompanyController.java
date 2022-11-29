package com.kh.mybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // 뷰를 안달고 Api로부터 입력을 받겠다!
@RequestMapping("/company") // 전체 경로! 하위 경로는 지정안함
public class CompanyController {
    @Autowired // 의존성 주입
    private CompanyMapper companyMapper;
    @Autowired
    private CompanyService companyService;

    @PostMapping("")
    public int post(@RequestBody Company company) {
        return companyMapper.insert(company); // 들어온 값을 insert 해주고 바로 return
    }
    @GetMapping("")
    public List<Company> getAll() {
        return companyService.getAll();
    }
}
