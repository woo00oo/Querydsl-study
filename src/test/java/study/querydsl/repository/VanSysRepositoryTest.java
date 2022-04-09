package study.querydsl.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.querydsl.entity.van.CardCode;
import study.querydsl.entity.van.Van;
import study.querydsl.entity.van.VanSys;


import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class VanSysRepositoryTest {

    @Autowired
    VanSysRepository vanSysRepository;

    @Autowired
    VanRepository vanRepository;

    @Autowired
    EntityManager em;

    @Test
    void test() {
        Van van = new Van();
        van.setVanName("name");
        van.setCardCode(CardCode.CC01);
        vanRepository.save(van);

        VanSys vanSys = new VanSys(van, 1L, CardCode.CC01, "test");

        vanSysRepository.save(vanSys);

    }

}