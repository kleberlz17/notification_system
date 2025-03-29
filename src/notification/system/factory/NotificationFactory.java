package notification.system.factory;

import notification.system.model.Notification;

public abstract class NotificationFactory {

	// Fábrica que cria uma notificação, implementada nas fábricas concretas
	public abstract Notification createNotification(String recipient, String message);
}
