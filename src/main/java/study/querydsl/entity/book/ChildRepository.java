package study.querydsl.entity.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, ChildId> {
}
