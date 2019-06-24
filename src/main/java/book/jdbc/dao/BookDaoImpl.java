package book.jdbc.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements IBookDao  {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public void insert(String title, String author, int price) {
        String sql = "Insert Into Book(title, author, price, time) " + 
                     "Values(?, ?, ?, ?)";
        
        Object[] args = {
            title, 
            author, 
            price, 
            new Date().getTime()};
        
        jdbcTemplate.update(sql, args);
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
        
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void delete(int id) {
        String sql = "Delete From Book Where id=" + id;
        jdbcTemplate.execute(sql);
    }

    @Override
    public Map get(int id) {
        String sql = "Select id, title, author, price, time from Book Where id = " + id;
        Map<String, Object> map = jdbcTemplate.queryForMap(sql);
        return map;
    }

    @Override
    public List query() {
        String sql = "Select id, title, author, price, time from Book";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;

    }
    
}
