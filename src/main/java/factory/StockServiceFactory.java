package factory;

import stocktrader.StockService;
import stocktrader.impl.AStockService;

public class StockServiceFactory {

    public StockService getStockService(){
        AStockService stockService = new AStockService();
        return stockService;
    }

}
