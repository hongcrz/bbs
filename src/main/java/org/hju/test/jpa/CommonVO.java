package org.hju.test.jpa;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class CommonVO {

    // register ID
    private String regId;

    // modify ID
    private String modId;

    // register Datetime
    @CreationTimestamp
    @Column(updatable = false, insertable = false)
    private LocalDateTime regDtm;

    // modify Datetime
    @CreationTimestamp
    private LocalDateTime modDtm;

}
