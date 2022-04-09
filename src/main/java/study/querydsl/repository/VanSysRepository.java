package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.van.VanSys;
import study.querydsl.entity.van.VanSysId;

public interface VanSysRepository extends JpaRepository<VanSys, VanSysId> {
}
