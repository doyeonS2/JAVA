package com.kh.RestApi.dao;

import com.kh.RestApi.entity.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberInfo, String> {
}
