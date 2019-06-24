package book.jdbc.dao;

import book.jdbc.po.Book;
import java.util.List;

public interface IBookDaoMapper {
  // 新增
  public void insert(Book book);
  // 修改
  public void update(Book book);
  // 刪除 by id
  public void delete(int id);
  // 查詢單筆 by id
  public Book get(int id);
  // 查詢多筆
  public List<Book> query();
    
}
