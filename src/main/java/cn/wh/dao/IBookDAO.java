package cn.wh.dao;

import cn.wh.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBookDAO {
    //新增
    public int addBook(Book book);
    //查询 list
    public List<Book> list();
    //删除
    public int delete(Integer id);
    //修改
    public  int update(Book book);
    //查询单个对象
    public  Book book(Integer id);
    /**
     * 分页
     */
    //总记录数
    public int count();
    /**
     * 分页的里列表
     */
    public List<Book> getBookList(@Param("come")Integer come,@Param("to") Integer to);
}
