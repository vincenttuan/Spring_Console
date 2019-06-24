package book.jdbc.dao;

import book.jdbc.po.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BookDaoMapperImpl implements IBookDaoMapper {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public void insert(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Book> query() {
        String sql = "Select id, title, author, price, time from Book";
        List<Book> list = jdbcTemplate.query(sql, new BookRowMapper());
        return list;
    }

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
