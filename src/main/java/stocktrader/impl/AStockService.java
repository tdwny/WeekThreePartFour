package stocktrader.impl;

import stocktrader.StockService;
import stocktrader.StockTransaction;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

public class AStockService implements StockService {

    @Override
    public StockTransaction getQuote(String symbol, Timestamp timeOfTransaction) {
        return null;
    }

    @Override
    public List<StockTransaction> getQuote(String symbol, Calendar from, Calendar until) {
        return null;
    }
}
