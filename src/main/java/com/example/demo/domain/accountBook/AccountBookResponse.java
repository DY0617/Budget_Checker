package com.example.demo.domain.accountBook;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AccountBookResponse {
    private Long id;                       // PK
    private Long userId;                  // 유저아이디
    private LocalDateTime transactionDate;     // 거래시간
    private String title;                // 타이틀
    private Long categoryId;                  // 카테고리 아이디 외래키
    private Long paymentMethodId;                  // 거래방법 아이디 외래키
    private Long amount;                  // 금액
    private String memo;                 // 메모
    private LocalDateTime createdAt;     // 생성일시
    private LocalDateTime updatedAt;    // 최종 수정일시
    private Boolean deleteYn;              // 삭제 여부
}
