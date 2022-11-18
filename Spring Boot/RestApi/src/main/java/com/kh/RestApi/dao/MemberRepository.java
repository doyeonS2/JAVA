package com.kh.RestApi.dao;

import com.kh.RestApi.entity.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;

// 디비 이름(MemberInfo), 프라이머리 키의 타입(ID가 Long타입)을 넣어야 함
public interface MemberRepository extends JpaRepository<MemberInfo, Long> {
}
