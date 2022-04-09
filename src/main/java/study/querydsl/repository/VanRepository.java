package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.van.Van;

public interface VanRepository extends JpaRepository<Van, Long> {
}
