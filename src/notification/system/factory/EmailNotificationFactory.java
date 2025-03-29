package notification.system.factory;

import notification.system.model.EmailNotification;
import notification.system.model.Notification;

public class EmailNotificationFactory extends NotificationFactory {

	@Override
	public Notification createNotification(String recipient, String message) {
		return new EmailNotification(recipient, message);
	}
	
}
