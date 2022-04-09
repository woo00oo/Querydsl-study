package study.querydsl.entity.van;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum CardCode {

    CC01("결제");

    private String name;
}
