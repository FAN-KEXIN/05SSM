package cn.wh.service.impl;


import cn.wh.dao.IBookDAO;
import cn.wh.entity.Book;
import cn.wh.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("IBookService")
public class IBookServiceImpl implements IBookService {
    @Autowired
    private IBookDAO dao;
    public IBookDAO getDao() {
        return dao;
    }
    public void setDao(IBookDAO dao) {
        this.dao = dao;
    }
    public int addBook(Book book) {
        return dao.addBook(book);
    }
    @Override
    public List<Book> list() {
        return dao.list();
    }
    @Override
    public int delete(Integer id) {
        return dao.delete(id);
    }
    @Override
    public int update(Book book) {
        return dao.update(book);
    }
    @Override
    public Book book(Integer id) {
        return dao.book(id);
    }
    @Override
    public int count() {
        return dao.count();
    }
    @Override
    public List<Book> getBookList(Integer come, Integer to) {
        return dao.getBookList((come - 1) * to,to);
    }
}
