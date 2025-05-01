// Implementare concretă pentru notificare prin SMS
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
