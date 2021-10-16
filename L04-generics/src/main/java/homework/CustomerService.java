package homework;


import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    private final TreeMap<Customer, String> treeMap = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> entry = treeMap.firstEntry();
        return entry != null ? new AbstractMap.SimpleEntry<>(entry.getKey().clone(), entry.getValue()) : null;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> entry = treeMap.higherEntry(customer);
        return entry != null ? new AbstractMap.SimpleEntry<>(entry.getKey().clone(), entry.getValue()) : null;
    }

    public void add(Customer customer, String data) {
        treeMap.put(customer, data);
    }
}
