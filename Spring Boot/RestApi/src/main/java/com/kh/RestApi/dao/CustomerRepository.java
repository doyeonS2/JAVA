package com.kh.RestApi.dao;
import com.kh.RestApi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// Customer : 디비에 생성된 테이블 이름
// Integer : 프라이머리 키로 지정한 ID의 타입을 넣어줌
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByName(String name);
    List<Customer> findByAddressLike(String address);
    List<Customer> findByNameLike(String name);
    List<Customer> findByNameLikeOrderByAddressDesc(String name); // 이름을 찾아줘! 주소 기준으로 내림차순으로 정렬해서 찾아줘!
    List<Customer> findByNameOrAddress(String name, String address);
    List<Customer> findByNameAndAddress(String name, String address);

    // Native 쿼리나 JPQL 둘 중 아무거나 써도 상관없음

    // Native 쿼리 방법
    @Query(value = "select * from customer where name = ?1 and address =?2", nativeQuery = true) // ?1 = 첫번째 자리에 대입
    List<Customer> findVipList1(String name, String address);

    // JPQL 쿼리 방법 (Java Persistence Query Language)
    @Query("from Customer where name = ?1 and address =?2")
    List<Customer> findVipList2(String name, String address);
}
