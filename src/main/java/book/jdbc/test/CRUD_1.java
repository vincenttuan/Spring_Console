package book.jdbc.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;

public class CRUD_1 {
    public static void main(String[] args) throws Exception {
        // 1：資料來源設定
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("org.apache.derby.jdbc.ClientDriver");
        dataSource.setJdbcUrl("jdbc:derby://localhost:1527/ssh");
        dataSource.setUser("ssh");
        dataSource.setPassword("1234");
        dataSource.setMaxPoolSize(10);
        System.out.println(dataSource.getJdbcUrl());
        
        // 2：建立 JdbcTemplate
        JdbcTemplate jt = new JdbcTemplate(dataSource);
        
        // 3.1：新增 SQL
        String sql = "Insert Into Book(title, author, price, time) " + 
                     "Values(?, ?, ?, ?)";
        
        // 3.2：設置 SQL 參數
        Object[] data = {
            "Java", 
            "oracle", 
            "500", 
            new Date().getTime()};
        
        // 4：執行 sql 語句
        jt.update(sql, data);
        
        Thread.sleep(1000);
        
        // 5：查詢資料
        sql = "Select id, title, author, price, time from Book";
        List<Map<String, Object>> list = jt.queryForList(sql);
        System.out.println(list);

    }
}
