package Decorator;

public class Logging extends NotificationDecorator {
    public Logging(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        System.out.println("[LOG]: Notification sent at " + java.time.LocalDateTime.now());
        super.send(message);
    }
}
