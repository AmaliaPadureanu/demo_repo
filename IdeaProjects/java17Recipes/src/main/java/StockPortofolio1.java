import java.util.*;
import java.util.stream.Collectors;

public class StockPortofolio1 implements Iterable<Stock>{
    Map<String, Stock> portofolio = new HashMap<>();

    public void add(Stock stock) {
        portofolio.put(stock.getSymbol(), stock);
    }

    public void add(List<Stock> stocks) {
        for (Stock s :  stocks) {
            portofolio.put(s.getSymbol(), s);
        }
    }

    public void remove(String stock) {
        portofolio.remove(stock);
    }

    public void remove(List<String> sellList) {
        Iterator<String> keyIter =  portofolio.keySet().iterator();
        while (keyIter.hasNext()) {
            if (sellList.contains(keyIter.next())) {
                keyIter.remove();
            }
        }
    }

    public List<Stock> alertListLegacy() {
        System.out.println("==Legacy technique for filtering and collecting==");
        List<Stock> alertList = new ArrayList<>();
        for(Stock stock : portofolio.values()) {
            if(!StockScanner.screen(stock.getSymbol(), StockScanner.Screen.PE, 20)) {
                alertList.add(stock);
            }
        }
        return alertList;
    }

    public List<Stock> alertList() {
        return portofolio.values().stream()
                .filter(s -> !StockScanner.screen(s.getSymbol(), StockScanner.Screen.PE, 20))
                .collect(Collectors.toList());
    }

    public void summary() {
        System.out.println("==Legacy technique for traversing Map.Entry==");
        for (Map.Entry<String, Stock> entry : portofolio.entrySet()) {
            System.out.println("Stock = " + entry.getKey() + ", Shares = " + entry.getValue().getShares());
        }
        System.out.println("==Utilization for new foreach and lambda combination==");
        portofolio.forEach((k, v) -> System.out.println("Stock = " + k + ", Shares = " + v.getShares()));
    }

    public Iterator<Stock> iterator() {
        return portofolio.values().iterator();
    }

    public static void main(String[] args) {
        StockPortofolio1 myPortofolio = new StockPortofolio1();
        myPortofolio.add(new Stock("ORCL", "Oracle", 500.0));
        myPortofolio.add(new Stock("AAPL", "Apple", 200.0));
        myPortofolio.add(new Stock("GOOG", "Google", 100.0));
        myPortofolio.add(new Stock("IBM", "IBM", 50.0));
        myPortofolio.add(new Stock("MCD", "McDonalds", 300.0));

        for (Stock stock : myPortofolio) {
            System.out.println(stock);
        }

        myPortofolio.forEach((stock) -> System.out.println(stock));
        List<String> sellList = new ArrayList<>();
        sellList.add("IBM");
        sellList.add("GOOG");
        myPortofolio.remove(sellList);
        System.out.println("Portofolio Summary:");
        myPortofolio.summary();
        System.out.println("Alerts:");
        for (Stock stock : myPortofolio.alertList()) {
            System.out.println("Alert: " + stock.getSymbol());
        }
    }
}

