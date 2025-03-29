package notification.system;

import java.util.Scanner;

import notification.system.factory.EmailNotificationFactory;
import notification.system.factory.NotificationFactory;
import notification.system.factory.PushNotificationFactory;
import notification.system.factory.SMSNotificationFactory;
import notification.system.model.Notification;

public class Main {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha o tipo de notificação (1: Email, 2: SMS, 3: Push): ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		Notification notification = null;
		NotificationFactory factory = null;
		
		System.out.println("Digite a mensagem: ");
		String message = scanner.nextLine();
		
		switch(choice) {
		case 1:
			System.out.println("Digite o endereço de email: ");
			String email = scanner.nextLine();
			factory = new EmailNotificationFactory();
			notification = factory.createNotification(email, message);
			break;
		case 2:
			System.out.println("Digite o número de telefone: ");
			String phoneNumber = scanner.nextLine();
			factory = new SMSNotificationFactory();
			notification = factory.createNotification(phoneNumber, message);
			break;
		case 3:
			System.out.println("Digite o ID do usuário: ");
			String userId = scanner.nextLine();
			factory = new PushNotificationFactory();
			notification = factory.createNotification(userId, message);
			break;
		default:
			System.out.println("Opção inválida.");
			break;
			
		}
		
		if (notification != null) {
			notification.send();
		}
		
		scanner.close();
	}
}
