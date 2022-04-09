package study.querydsl.entity.van;


import lombok.*;

import javax.persistence.*;

@Entity
@IdClass(VanSysId.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class VanSys {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VAN_ID")
    private Van van;

    @Id
    private Long vanSysId;

    @Id
    @Enumerated(EnumType.STRING)
    private CardCode cardCode;

    private String vanSysName;

}
