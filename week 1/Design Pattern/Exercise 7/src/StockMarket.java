
// StockMarket.java
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<MyObserver> observers;
    private double stockPrice;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(MyObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (MyObserver observer : observers) {
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
