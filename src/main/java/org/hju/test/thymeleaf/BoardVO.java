package org.hju.test.thymeleaf;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardVO {
    private int no;
    private String title;
    private String writer;
    private LocalDateTime updateTime;

    BoardVO() {}
    public BoardVO(int no, String title, String writer) {
        this.no = no;
        this.title = title;
        this.writer = writer;
        this.updateTime = LocalDateTime.now();
    }
}
