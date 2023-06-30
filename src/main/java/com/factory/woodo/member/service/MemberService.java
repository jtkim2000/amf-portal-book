package com.factory.woodo.member.service;

import com.factory.woodo.member.dto.LoginResultDto;
import com.factory.woodo.member.dto.MemberCreateRequestDto;
import com.factory.woodo.member.dto.MemberLoginRequestDto;

public interface MemberService {
    Long save(MemberCreateRequestDto requestDto);

    LoginResultDto login(MemberLoginRequestDto requestDto);
}
