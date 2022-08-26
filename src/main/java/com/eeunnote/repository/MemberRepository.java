package com.eeunnote.repository;

import com.eeunnote.domain.Member;

import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(String id);
}
