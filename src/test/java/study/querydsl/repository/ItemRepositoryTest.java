package study.querydsl.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.querydsl.entity.Book;
import study.querydsl.entity.Item;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    EntityManager em;

    @Test
    void item_test() {

        Item item = new Item();
        item.setName("test");
        item.setPrice(1000);

        itemRepository.save(item);


    }

    @Test
    void book_test() {
        Book book = new Book();
        book.setAuthor("aaa");
        book.setName("aaa");
        book.setIsbn("111");
        book.setPrice(1000);

        bookRepository.save(book);
    }

    @Test
    void item_find() {

        Book book = new Book();
        book.setAuthor("aaa");
        book.setName("aaa");
        book.setIsbn("111");
        book.setPrice(1000);

        Book save = bookRepository.save(book);

        em.flush();
        em.clear();

        itemRepository.findItem(save.getId());


    }

}