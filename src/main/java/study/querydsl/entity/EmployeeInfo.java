package study.querydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class EmployeeInfo {

    @Id
    @Column(name = "Employee_INFO")
    private Long id;

    @MapsId
    @JoinColumn(name = "INFO_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Employee employee;

    private String detailAddress;

    private String tel;
}
