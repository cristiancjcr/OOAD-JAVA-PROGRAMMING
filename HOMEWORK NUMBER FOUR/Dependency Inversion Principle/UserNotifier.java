// Clasa de nivel înalt care folosește o abstracție (interfață)
public class UserNotifier {
    private NotificationService notificationService;

    // Injectăm dependența prin constructor
    public UserNotifier(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.sendNotification(message);
    }
}
