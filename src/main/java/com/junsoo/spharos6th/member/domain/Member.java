package com.junsoo.spharos6th.member.domain;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("회원 이름")
    @Column(nullable = true, length = 100)
    private String name;

    @Comment("회원 이메일")
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    private String password;
    private String phoneNumber;
    private String birth;

    @Builder
    public Member(Long id, String name, String email, String password, String phoneNumber, String birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
    }
}
