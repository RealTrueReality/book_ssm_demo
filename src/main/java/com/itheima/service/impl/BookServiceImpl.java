package com.itheima.service.impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TrueReality
 * @date 2022/12/27
 * @apiNote
 */
@Service
public class BookServiceImpl implements BookService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        try {
            return bookDao.save(book);
        } catch (Exception e) {

            return false;

        }
    }

    public boolean update(Book book) {

        return bookDao.update(book);
    }

    public boolean delete(Integer id) {

        return bookDao.delete(id);
    }

    public Book getById(Integer id) {
        if (id==1){
            throw new BusinessException(Code.BUSINESS_FAILURE,"woc你真吊你妈的可就访问一个不存在的!!");
        }
        try {
            //int i=1/0;
            //将异常进行包装转换为自定义异常
            return bookDao.getById(id);
        } catch (Exception e) {
            throw new SystemException(Code.TIME_OUT,"服务器访问超时请重试~~",e);
        }


    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
