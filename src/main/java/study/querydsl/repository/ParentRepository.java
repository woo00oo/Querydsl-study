package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.book.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
