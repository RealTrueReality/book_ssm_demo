package com.itheima.com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author TrueReality
 * @date 2022/12/27
 * @apiNote
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class bookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testgetById() throws Exception {
        Book book = bookService.getById(1);
        System.out.println(book);
    }
    @Test
    public void testgetAll() throws Exception {
        List<Book> book = bookService.getAll();
        System.out.println(book);
    }

}
