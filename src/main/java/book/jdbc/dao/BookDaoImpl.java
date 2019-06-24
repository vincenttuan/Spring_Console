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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List query() {
        String sql = "Select id, title, author, price, time from Book";
        List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
        return list;

    }
    
}
