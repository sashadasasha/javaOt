package homework;


import java.util.LinkedList;
import java.util.Stack;

public class CustomerReverseOrder {

    /**
     * Рfботает и вариант с LinkedList, и со Stack
     */
    //private final LinkedList<Customer> linkedList = new LinkedList<>();
    private final Stack<Customer> stack = new Stack<>();

    public void add(Customer customer) {
        //linkedList.addFirst(customer);
        stack.push(customer);
    }

    public Customer take() {
        //return linkedList.pollFirst();
        return stack.pop();
    }
}
