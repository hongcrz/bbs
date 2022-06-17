package org.hju.bbs.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hju.bbs.entity.Board;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
public class BoardRequestDto {
    // 게시물 등록, 수정, 상세 조회에 필요한 필드 정의

    private Long bSeq;
    private String title;
    private String content;
    @Column(name = "reg_id")
    private String regId;

    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .regId(regId)
                .build();
    }
}
