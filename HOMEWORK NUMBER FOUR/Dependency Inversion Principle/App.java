public class App {
    public static void main(String[] args) {
        // Alegem implementarea dorită (o putem chiar încărca din config)
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();

        UserNotifier notifier1 = new UserNotifier(emailService);
        notifier1.notifyUser("Email: Hello from OpenAI!");

        UserNotifier notifier2 = new UserNotifier(smsService);
        notifier2.notifyUser("SMS: Hello from OpenAI!");
    }
}
