package org.hju.test.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "member")
public class MemberVO extends CommonVO{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_seq")    // == memberSeq
    private Long mSeq;
    private String id;
    private String pwd;
    private String name;

}
