package Decorator;

public abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification decoratedNotification) {
        this.decoratedNotification = decoratedNotification;
    }

    public void send(String message) {
        decoratedNotification.send(message);
    }  
    
}
