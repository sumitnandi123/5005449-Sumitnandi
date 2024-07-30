// MobileApp.java
public class MobileApp implements MyObserver {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("MobileApp " + name + " received stock price update: " + stockPrice);
    }
}
