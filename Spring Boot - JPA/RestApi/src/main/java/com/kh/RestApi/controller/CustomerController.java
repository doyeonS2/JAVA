//package com.kh.RestApi.controller;
//import com.kh.RestApi.dao.CustomerRepository;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class CustomerController {
//    private CustomerRepository repository; // 내부 필드 이름
//    public CustomerController(CustomerRepository repository) {
//        this.repository = repository;
//    }
//    @PutMapping("/customer") // 회원 데이터 생성(PUT으로 생성. POST로 해도 됨)
//    public Customer putCustomer(Customer customer) {
//        return repository.save(customer); // 하나의 객체를 인서트하는 동작과 같음
//    }
//    @PostMapping("/customer") // 회원 정보 수정
//    public Customer postCustomer(Customer customer) {
//        return repository.save(customer);
//    }
//    @DeleteMapping("/customer") // 회원 정보 삭제
//    // 결과를 반환(return)할 필요가 없기 때문에 void
//    public void deleteCustomer(int id) {
//        repository.deleteById(id);
//    }
//    @GetMapping("/customer") // 회원 정보 조회
//    public Customer getCustomer(int id) {
//        return repository.findById(id).orElse(null); // 찾는 값이 없으면 null을 반환
//    }
//    // 회원 정보 전체 조회
//    @GetMapping("/customer/list")  // customer : 하나의 객체이기 때문에 "/customer/list"
//    public List<Customer> getCustomer() {
//        return repository.findAll();
//    }
//    @GetMapping("customer/name") // 이름으로 조회하기
//    // 오버로딩 관계가 성립하기 때문에 getCustomer 사용 가능
//    public List<Customer> getCustomer(String name) {
//        return repository.findByName(name); // CustomerRepository에다가 추가해줘야함
//    }
//    @GetMapping("customer/address") // 주소로 조회하기
//    // getCustomerAddr : 같은 String에서 getCustomer 이름 사용했기 때문에 다른 이름 사용, 타입 다르면 사용 가능
//    public List<Customer> getCustomerAddr(String address) {
//        return repository.findByAddressLike("%" + address + "%");
//    }
//    // Like 검색 해보기
//    @GetMapping("customer/search")
//    public List<Customer> searchCustomer(String name) {
//        //return repository.findByNameLike("%" + name + "%"); // % : 앞뒤에 뭐가 오든 상관없고 포함되어 있으면 검색
//        return repository.findByNameLikeOrderByAddressDesc("%" + name + "%"); // 이름을 검색하는데 주소를 기준으로 내림차순 정렬해서 찾기
//    }
//    //이름 또는 주소에 맞는 항목 검색하기
//    @GetMapping("customer/name-addr1") // name-addr1 : _(언더바)는 쓸 수 없고 -(하이픈)은 가능
//    public List<Customer> getCustomerNameOrAddr(String name, String address) {
//        return repository.findByNameOrAddress(name, address); // findByNameOrAddress : 명명규칙에 따른 이름이기 때문에 아무렇게나 막 지으면 안됨. 규칙에 맞게 지어야 함
//    }
//    //이름 그리고 주소에 맞는 항목 검색하기
//    @GetMapping("customer/name-addr2")
//    public List<Customer> getCustomerNameAndAddr(String name, String address) {
//        return repository.findByNameAndAddress(name, address);
//    }
//    // Native 쿼리 호출 / JPQL 쿼리 호출
//    @GetMapping("customer/name-addr-cust")
//    public List<Customer> getNativeNameAndAddr(String name, String address) {
////        return repository.findVipList1(name, address); // Native 쿼리
//        return repository.findVipList2(name, address); // JPQL
//    }
//}
//
