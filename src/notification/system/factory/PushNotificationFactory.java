package notification.system.factory;

import notification.system.model.Notification;
import notification.system.model.PushNotification;

public class PushNotificationFactory extends NotificationFactory {

	@Override
	public Notification createNotification(String recipient, String message) {

		return new PushNotification(recipient, message);
	}

}
