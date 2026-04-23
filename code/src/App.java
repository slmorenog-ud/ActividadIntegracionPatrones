import Decorator.BasicNotification;
import Decorator.Encryption;
import Decorator.Logging;
import Decorator.Notification;
import Decorator.Retry;
import Observer.Client;
import Observer.LogisticsArea;
import Order.Order;
import Order.OrderFactory;
import SendStrategy.ExpressSend;
import SendStrategy.StandardSend;

public class App {
    public static void main(String[] args) throws Exception {
        SystemSetting settings = SystemSetting.getInstance();
        System.out.println("System currency: " + settings.getCurrency() + " | tax: " + settings.getTax());

        OrderFactory orderFactory = new OrderFactory();
        Order order = orderFactory.createOrder("national", "ORD-1001", new StandardSend(), 15, 2.3);

        Client client = new Client("Juan Perez", "juan@example.com");
        LogisticsArea logistics = new LogisticsArea("BOG-01");
        order.subscribe(client);
        order.subscribe(logistics);

        order.setStatus("IN_PREPARATION");
        System.out.println("Cost with StandardSend: " + order.calculateTotalCost());

        order.setStrategy(new ExpressSend());
        System.out.println("Cost with ExpressSend: " + order.calculateTotalCost());

        Notification notificationPipeline = new Retry(new Logging(new Encryption(new BasicNotification())));
        notificationPipeline.send("Order " + order.getId() + " is now IN_TRANSIT");

        order.setStatus("IN_TRANSIT");
    }
}
