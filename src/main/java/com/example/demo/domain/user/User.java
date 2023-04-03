package com.example.demo.domain.user;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30, unique = true)
    private String username; // 아이디

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column(length = 100)
    private String password;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    private LocalDateTime createdAt;     // 생성일시
    private LocalDateTime updatedAt;    // 최종 수정일시
    private boolean deleteYn;

    /* 회원정보 수정 */
    public void modify(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    /* 소셜로그인시 이미 등록된 회원이라면 수정날짜만 업데이트해줘서
     * 기존 데이터를 보존하도록 예외처리 */
    public User updateUpdatedAt() {
        this.updatedAt = LocalDateTime.now();
        return this;
    }




}

