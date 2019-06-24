package book.jdbc.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class BookDaoImpl extends JdbcDaoSupport implements IBookDao  {

    @Override
    public void insert(String title, String author, int price) {
        String sql = "Insert Into Book(title, author, price, time) " + 
                     "Values(?, ?, ?, ?)";
        
        Object[] args = {
            title, 
            author, 
            price, 
            new Date().getTime()};
        
        getJdbcTemplate().update(sql, args);
    }

    @Override
    public void update(int id, String title, String author, int price) {
        String sql = "Update Book Set title=?, author=?, price=?, time=? " + 
                     "Where id=?";
        
        Object[] args = {
            title, 
            author, 
            price, 
            new Date().getTime(),
            id
        };
        
        getJdbcTemplate().update(sql, args);
    }

    @Override
    public void delete(int id) {
        String sql = "Delete From Book Where id=" + id;
        getJdbcTemplate().execute(sql);
    }

    @Override
    public Map get(int id) {
        String sql = "Select id, title, author, price, time from Book Where id = " + id;
        Map<String, Object> map = getJdbcTemplate().queryForMap(sql);
        return map;
    }

    @Override
    public List query() {
        String sql = "Select id, title, author, price, time from Book";
        List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
        return list;

    }
    
}
