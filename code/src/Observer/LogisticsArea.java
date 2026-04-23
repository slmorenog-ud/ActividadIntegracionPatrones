package Observer;

import Order.Order;

public class LogisticsArea implements Observer {
    private String branchId;

    public LogisticsArea(String branchId) {
        this.branchId = branchId;
    }

    @Override
    public void update(Order order) {
        System.out.println("[LOGISTICS " + branchId + "] Order "
                + order.getId() + " changed to status: " + order.getStatus());
    }
}
