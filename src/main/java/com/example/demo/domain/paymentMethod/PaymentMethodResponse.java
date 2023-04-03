package com.example.demo.domain.paymentMethod;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PaymentMethodResponse {
    private Long id;                       // PK
    private Long userId;                  // 유저아이디 외래키
    private String paymentMethodName;       // 결제 수단 이름
    private LocalDateTime createdAt;     // 생성일시
    private LocalDateTime updatedAt;    // 최종 수정일시
    private Boolean deleteYn;              // 삭제 여부
}
