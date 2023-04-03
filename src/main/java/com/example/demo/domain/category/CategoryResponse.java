package com.example.demo.domain.category;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CategoryResponse {
    private Long id;                       // PK
    private Long userId;                  // 유저 외래키
    private String categoryName;                // 카테고리 이름
    private LocalDateTime createdAt;     // 생성일시
    private LocalDateTime updatedAt;    // 최종 수정일시
    private Boolean deleteYn;              // 삭제 여부
}
