package study.querydsl.entity.book;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
public class ChildId implements Serializable {

    private Long parent;
    private Long childId;
}
