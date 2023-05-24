package com.factory.demo.member.service;

import com.factory.demo.member.dto.MemberCreateRequestDto;
import com.factory.demo.member.dto.MemberLoginRequestDto;

public interface MemberService {
    Long save(MemberCreateRequestDto requestDto);

    Boolean login(MemberLoginRequestDto requestDto);
}
