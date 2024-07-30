public class WebApp implements MyObserver {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("WebApp " + name + " received stock price update: " + stockPrice);
    }
}
