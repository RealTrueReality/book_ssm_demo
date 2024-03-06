package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author TrueReality
 * @date 2022/12/27
 * @apiNote
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_SUCCESS : Code.SAVE_FAILURE,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_SUCCESS : Code.UPDATE_FAILURE,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {

        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_SUCCESS : Code.DELETE_FAILURE,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code=book!=null ? Code.GET_SUCCESS: Code.GET_FAILURE;
        String message= book!=null ? null:"查询失败!!!";
        return new Result(code,book,message);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code=bookList!=null ? Code.GET_SUCCESS: Code.GET_FAILURE;
        String message= bookList!=null ? null:"查询失败!!!";
        return new Result(code,bookList,message);
    }
}
