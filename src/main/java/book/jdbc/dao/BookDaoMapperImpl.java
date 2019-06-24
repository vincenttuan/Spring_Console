package book.jdbc.dao;

import book.jdbc.po.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BookDaoMapperImpl implements IBookDaoMapper {
    
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<Book> query() {
        String sql = "Select id, title, author, price, time from Book";
        //List<Book> list = jdbcTemplate.query(sql, new BookRowMapper());
        List<Book> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Book.class));
        return list;

    }
    
    @Override
    public void insert(Book book) {
        String sql = "Insert Into Book(title, author, price, time) " + 
                     "Values(?, ?, ?, ?)";
        
        Object[] args = {
            book.getTitle(), 
            book.getAuthor(), 
            book.getPrice(), 
            book.getTime()};
        
        jdbcTemplate.update(sql, args);

    }

    @Override
    public void update(Book book) {
        String sql = "Update Book Set title=?, author=?, price=?, time=? " + 
                     "Where id=?";
        
        Object[] args = {
            book.getTitle(), 
            book.getAuthor(), 
            book.getPrice(), 
            new Date().getTime(),
            book.getId()
        };
        
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void delete(int id) {
        String sql = "Delete From Book Where id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Book get(int id) {
        String sql = "SELECT * FROM Book WHERE id = ?";
 
	Book book = (Book)jdbcTemplate.queryForObject(
			sql, 
                        new Object[] { id }, 
			new BeanPropertyRowMapper(Book.class));
	
	return book;
    }

    
    
    // Mapper
    private class BookRowMapper implements RowMapper<Book> {

        @Override
        public Book mapRow(ResultSet rs, int i) throws SQLException {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setPrice(rs.getInt("price"));
            book.setTime(rs.getLong("time"));
            return book;
        }
    }

}
