package homework;

import java.util.*;

public class CustomerReverseOrder {

    private final Deque<Customer> stack = new LinkedList<>();

    public void add(Customer customer) {
        stack.push(customer);
    }

    public Customer take() {
        return stack.pop();
    }
}
