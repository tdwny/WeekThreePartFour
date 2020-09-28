import factory.StockServiceFactory;
import org.junit.Test;
import stocktrader.StockService;
import java.sql.Timestamp;
import java.util.Calendar;
import static org.junit.Assert.assertEquals;

public class factoryTest {

    @Test
    public void getQuoteTestObject(){
        StockServiceFactory stockServiceFactory = new StockServiceFactory();
        StockService stockService = stockServiceFactory.getStockService();

        String expectedSymbol = "APPL";
        Timestamp expectedTimestamp = new Timestamp(System.currentTimeMillis());

        assertEquals(null, stockService.getQuote(expectedSymbol, expectedTimestamp));

    }

    @Test
    public void getQuoteTestList(){
        StockServiceFactory stockServiceFactory = new StockServiceFactory();
        StockService stockService = stockServiceFactory.getStockService();

        String expectedSymbol = "APPL";
        Calendar calendar = null;

        assertEquals(null, stockService.getQuote(expectedSymbol, null, null));

    }

}
