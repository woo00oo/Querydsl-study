package study.querydsl.entity.van;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Van {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VAN_ID")
    private Long id;

    private String vanName;

    private CardCode cardCode;

}
