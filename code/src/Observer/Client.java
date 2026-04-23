package Observer;

import Order.Order;

public class Client implements Observer {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(Order order) {
        System.out.println("[CLIENT " + name + " - " + email + "] Order "
                + order.getId() + " changed to status: " + order.getStatus());
    }
}
