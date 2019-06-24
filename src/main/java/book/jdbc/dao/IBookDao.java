package book.jdbc.dao;

import java.util.List;
import java.util.Map;

public interface IBookDao {
  // 新增
  public void insert(String title, String author, int price);
  // 修改
  public void update(int id, String title, String author, int price);
  // 刪除 by id
  public void delete(int id);
  // 查詢單筆 by id
  public Map get(int id);
  // 查詢多筆
  public List query();
    
}

