package exchange.spring.beans;

import stock.orm.dao.IBaseDao;

public interface IStockDao extends IBaseDao {
    double get(String symbol);
}
