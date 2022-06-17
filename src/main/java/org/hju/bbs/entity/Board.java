package org.hju.bbs.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Board extends BaseTimeEntity {

    /*
    board_seq		bigint(20)		not null	auto_increment	comment '게시판 번호',
	title			varchar(200)	not null					comment '게시물 제목',
	content			text			not null					comment '게시물 내용',
	reg_id			varchar(100)	not null					comment '작성자',
	reg_time		datetime		null		default null	comment '작성일',
	read_cnt 		int(11)			not null	default 0		comment '조회수',
	update_time		datetime		null		default null	comment '수정일',
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_seq")
    // 게시물 번호
    private Long bSeq;

    // 게시물 제목
    private String title;

    // 게시물 내용
    private String content;

    // 작성자 아이디
    @Column(name = "reg_id")
    private String regId;

    // 조회수
    @Column(name = "read_cnt")
    private int readCnt;

    @Builder
    public Board(String title, String content, String regId, int readCnt) {
        this.title = title;
        this.content = content;
        this.regId = regId;
        this.readCnt = readCnt;
    }

}
