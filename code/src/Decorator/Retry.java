package Decorator;

public class Retry extends NotificationDecorator {
    public Retry(Notification notification) { super(notification); }

    public void send(String message) {
        System.out.println("[RETRY]: Attempting to send message...");
        super.send(message);
    }
}
