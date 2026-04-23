package Decorator;

public class Encryption extends NotificationDecorator {
    public Encryption(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        System.out.print("[Action: Encrypting] ");
        super.send(encryptedMessage);
    }

    private String encrypt(String text) {
        return "ENCRYPTED_DATA(" + text.hashCode() + ")";
    }
}
