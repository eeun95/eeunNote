package com.eeunnote.service;

import com.eeunnote.domain.Member;
import com.eeunnote.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long join(Member member) {

        try {
            memberRepository.save(member);
            return member.getNo();
        } finally {
        }
    }
}
