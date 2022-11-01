import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StockPortofolio implements Iterable<Stock> {
    Map<String, Stock> portofolio = new HashMap<>();

    public void add(Stock stock) {
        portofolio.put(stock.getSymbol(), stock);
    }

    public void add(List<Stock> stocks) {
        for (Stock s : stocks) {
            portofolio.put(s.getSymbol(), s);
        }
    }

    public Iterator<Stock> iterator() {
        return portofolio.values().iterator();
    }

    public static void main(String[] args) {
        StockPortofolio myPortofolio = new StockPortofolio();
        myPortofolio.add(new Stock("ORCL", "Oracle", 500.0));
        myPortofolio.add(new Stock("AAPL", "Apple", 200.0));
        myPortofolio.add(new Stock("GOOG", "Google", 100.0));
        myPortofolio.add(new Stock("IBM", "IBM", 50.0));
        myPortofolio.add(new Stock("MCD", "McDonalds", 300.0));

        System.out.println("====Print using legacy for-each loop====");
        for(Stock stock : myPortofolio) {
            System.out.println(stock);
        }
        System.out.println("====Print using Java 8 foreach implementation====");
        myPortofolio.forEach(s -> System.out.println(s));
    }


}
