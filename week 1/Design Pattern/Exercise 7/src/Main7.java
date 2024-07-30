
public class Main7 {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        MyObserver mobileApp1 = new MobileApp("App1");
        MyObserver mobileApp2 = new MobileApp("App2");
        MyObserver webApp1 = new WebApp("Web1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        System.out.println("Setting stock price to 100.0");
        stockMarket.setStockPrice(100.0);

        System.out.println("Setting stock price to 105.5");
        stockMarket.setStockPrice(105.5);

        stockMarket.removeObserver(mobileApp1);

        System.out.println("Setting stock price to 110.0");
        stockMarket.setStockPrice(110.0);
    }
}
