package study.querydsl.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@IdClass(ChildId.class)
@NoArgsConstructor
@Getter @Setter
public class Child {

    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;

    @Id @Column(name = "CHILD_ID")
    private Long childId;

    private String name;
}
