package org.hju.bbs.dto;

import lombok.Getter;
import org.hju.bbs.entity.Board;
import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {
    // 게시물 목록, 게시물 상세 조회에 필요한 필드 정의

    private Long bSeq;
    private String title;
    private String content;
    @Column(name = "reg_id")
    private String regId;
    @Column(name = "read_cnt")
    private int readCnt;
    private LocalDateTime regDtm;

    public BoardResponseDto(Board entity) {
        this.bSeq = entity.getBSeq();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.readCnt = entity.getReadCnt();
        this.regId = entity.getRegId();
        this.regDtm = entity.getRegDtm();
    }

    @Override
    public String toString() {
        return "BoardResponseDto{" +
                "bSeq=" + bSeq +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", regId='" + regId + '\'' +
                ", readCnt=" + readCnt +
                ", regDtm=" + regDtm +
                '}';
    }
}
