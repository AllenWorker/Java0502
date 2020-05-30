/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;
import com.lab.ocp.day07.stock.dao.StockDAO;
import com.lab.ocp.day07.stock.po.Stock;
import com.lab.ocp.day07.stock.service.StockService;
import java.util.Arrays;
/**
 *
 * @author MB-study
 */
public class Test {
    @org.junit.Test
    public void test_StockDao() {
        StockDAO dao = StockDAO.getInstance();
        Stock[] stocks = dao.getStocks();
        Arrays.stream(stocks).forEach(s -> System.out.println(s.get證券名稱()));
    }
    
    @org.junit.Test
    public void test_StockService() {
        StockService service = new StockService();
        //service.find本益比(10.0);
        service.findBestBuy(7, 10);
    }
}
