
import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers;

    public CustomerRepositoryImpl() {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John Doe"));
        customers.put(2, new Customer(2, "Jane Smith"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }
}
