 class Order {
    String orderId;
    String customerName;
    Double totalPrice;

    public Order(String orderId, String customerName,Double totalPrice){
        this.orderId=orderId;
        this.customerName=customerName;
        this.totalPrice=totalPrice;
    }
    public  String  getorderId(){
        return orderId;
    }
    public String getcustomername(){
        return customerName;
    }
    public Double getTotalPrice(){
        return totalPrice;
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }}
     class OrderSorter{

        public static void bubbleSort(Order []orders){
            int n= orders.length;

            for (int i=0;i< n-1;i++){
                for(int j=0;j<n-1;j++){
                    if(orders[j].getTotalPrice()>orders[j+1].getTotalPrice()){
                        Order temp = orders[j];
                        orders[j] = orders[j + 1];
                        orders[j + 1] = temp;
                    }
                    
                }
            }}
            public static void quickSort(Order[] orders, int low, int high) {
                if (low < high) {
                    int p = partition(orders, low, high);
                    quickSort(orders, low, p - 1);
                    quickSort(orders, p + 1, high);
                }
            }
        
            private static int partition(Order[] orders, int low, int high) {
                double pivot = orders[high].getTotalPrice();
                int i = (low - 1);
                for (int j = low; j < high; j++) {
                    if (orders[j].getTotalPrice() < pivot) {
                        i++;
                        Order temp = orders[i];
                        orders[i] = orders[j];
                        orders[j] = temp;
                    }
                }
                Order temp = orders[i + 1];
                orders[i + 1] = orders[high];
                orders[high] = temp;
                return i + 1;
            }
        }
    
        public class Orderr {
            public static void main(String[] args) {
                Order[] orders = {
                    new Order("O001", "Sumit", 250.75),
                    new Order("O002", "mihir", 150.50),
                    new Order("O003", "Pranay", 300.00),
                    new Order("O004", "saumya", 200.00)
                };
        
                System.out.println("Orders sorted by Bubble Sort:");
                OrderSorter.bubbleSort(orders);
                for (Order order : orders) {
                    System.out.println(order);
                }
        
                orders = new Order[]{
                    new Order("O001", "Sumit", 250.75),
                    new Order("O002", "mihir", 150.50),
                    new Order("O003", "saumya", 300.00),
                    new Order("O004", "pranay", 200.00)
                };
        
                System.out.println("\nOrders sorted by Quick Sort:");
                OrderSorter.quickSort(orders, 0, orders.length - 1);
                for (Order order : orders) {
                    System.out.println(order);
                }
            }
        }
    