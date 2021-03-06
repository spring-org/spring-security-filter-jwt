package com.example.jwt.application.member.domain.repository;

import com.example.jwt.application.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findMemberByEmail(String email);

    boolean existsMemberByEmail(String email);
}
