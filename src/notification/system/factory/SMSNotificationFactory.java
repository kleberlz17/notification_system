package notification.system.factory;

import notification.system.model.Notification;
import notification.system.model.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {

	@Override
	public Notification createNotification(String recipient, String message) {
		return new SMSNotification(recipient, message);
	}

}
