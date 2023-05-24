package com.factory.demo.member.service.impl;

import com.factory.demo.member.dto.MemberCreateRequestDto;
import com.factory.demo.member.dto.MemberLoginRequestDto;
import com.factory.demo.member.model.Member;
import com.factory.demo.member.repository.MemberRepository;
import com.factory.demo.member.service.MemberService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public Long save(MemberCreateRequestDto requestDto) {
        return this.memberRepository.save(requestDto.toEntity()).getId();
    }

    @Override
    public Boolean login(MemberLoginRequestDto requestDto) {
        Member savedMember = this.memberRepository.findByEmail(requestDto.getEmail());
        if (savedMember == null) {
            return false; // 요구사항에 따라 다른 방법으로 구현할 수 있음
        }
        if (!savedMember.getPassword().equals(requestDto.getPassword())) {
            return false; // 요구사항에 따라 다른 방법으로 구현할 수 있음
        }
        return true;
    }
}
