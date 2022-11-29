package com.kh.mybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyService { // Controller와 Mapper 사이에 Service 만들어줘야 함 // 단독 쿼리문으로 해결하기 힘든 것 Service로 해결!
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    public List<Company> getAll() {
        List<Company> companyList = companyMapper.getAll();
        if(companyList != null && companyList.size() > 0) { // companyList.size() > 0 : 읽을 게 있으면..!
            for(Company company : companyList) {
                company.setEmployeeList(employeeMapper.getByCompanyId(company.getId()));
            }
        }
        return  companyList;
    }
}
