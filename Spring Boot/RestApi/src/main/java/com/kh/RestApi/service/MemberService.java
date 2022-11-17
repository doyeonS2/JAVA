package com.kh.RestApi.service;

import com.kh.RestApi.dao.MemberRepository;
import com.kh.RestApi.entity.MemberInfo;
import com.kh.RestApi.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());
    private MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public List<MemberVO> getMemberList(String id) {
        List<MemberVO> list = new ArrayList<>();
        List<MemberInfo> getList = memberRepository.findAll();
        for(MemberInfo e : getList) {
            LOGGER.info("ID : " + e.getId());
            LOGGER.info("PWD : " + e.getPwd());
            LOGGER.info("NAME : " + e.getName());
            MemberVO memberVO = new MemberVO();
            memberVO.setId(e.getId());
            memberVO.setPwd(e.getPwd());

            list.add(memberVO);
        }

        return list;
    }
}
