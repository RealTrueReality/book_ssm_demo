package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author TrueReality
 * @date 2022/12/27
 * @apiNote
 */

public interface BookDao {
    @Insert("insert tbl_book values (null,#{type},#{name},#{description})")
    boolean save(Book book);
    @Update("update tbl_book set type=#{type}, name=#{name}, description=#{description} where id=#{id}")
    boolean update(Book book);
    @Delete("delete from tbl_book where id=#{id}")
    boolean delete(Integer id);
    @Select("select * from tbl_book where id=#{id};")
    Book getById(Integer id);
    @Select("select * from tbl_book;")
    List<Book> getAll();
}
