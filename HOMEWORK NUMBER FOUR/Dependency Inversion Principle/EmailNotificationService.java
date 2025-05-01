// Implementare concretă pentru notificare prin Email
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending EMAIL with message: " + message);
    }
}
