package com.junsoo.spharos6th.member.infrastrusture;

import com.junsoo.spharos6th.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
