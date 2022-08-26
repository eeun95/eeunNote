package com.eeunnote.repository;

import com.eeunnote.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {
    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(String id) {
        return Optional.empty();
    }
}
