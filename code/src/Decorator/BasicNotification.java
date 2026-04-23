package Decorator;


public class BasicNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending basic notification: " + message);
    }
    
}
