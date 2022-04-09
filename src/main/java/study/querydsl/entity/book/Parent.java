package study.querydsl.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Parent {

    @Id @Column(name = "PARENT_ID") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
