package study.querydsl.entity.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.querydsl.repository.ParentRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class ChildRepositoryTest {

    @Autowired
    ChildRepository childRepository;

    @Autowired
    ParentRepository parentRepository;

    @Test
    void test() {
        Parent parent = new Parent();
        parent.setName("parent");

        Parent save = parentRepository.save(parent);

        Child child = new Child();
        child.setChildId(1L);
        child.setParent(save);
        child.setName("child");
        childRepository.save(child);
    }

}