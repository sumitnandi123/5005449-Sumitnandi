// Stock.java
public interface Stock {
    void registerObserver(MyObserver o);

    void removeObserver(MyObserver o);

    void notifyObservers();
}
