package Order;

import SendStrategy.SendStrategy;

public class OrderFactory {
    public Order createOrder(String type, String id, SendStrategy strategy, double distance, double weight) {
        if ("national".equalsIgnoreCase(type)) {
            return new NationalOrder(id, "Bogota", distance, weight, strategy);
        }
        if ("international".equalsIgnoreCase(type)) {
            return new InternationalOrder(id, "USA", 15000, distance, weight, strategy);
        }

        throw new IllegalArgumentException("Unsupported order type: " + type);
    }
}
