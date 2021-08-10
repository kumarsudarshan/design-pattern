package creational.pattern.factory;

public class NotificationFactory {
    public static Client getNotificationClient(ClientType clientType) {
        switch (clientType) {
            case MAIL:
                return new MailNotificationClient(25,
                        "SMTP", "goprodeveloperbala.com");
            case MESSAGE:
                return new SMSNotificationClient(443,
                        "HTTPS", "gateway.smsnotification.com");
            default:
                return null;
        }
    }
}
