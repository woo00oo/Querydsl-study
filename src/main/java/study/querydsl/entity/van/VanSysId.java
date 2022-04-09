package study.querydsl.entity.van;

import lombok.*;


import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
public class VanSysId implements Serializable {
    private Long van;
    private Long vanSysId;
    private CardCode cardCode;
}
