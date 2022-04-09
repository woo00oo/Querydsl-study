package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.querydsl.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("select i from Item i where i.id = :id")
    Item findItem(@Param("id") Long id);


}
