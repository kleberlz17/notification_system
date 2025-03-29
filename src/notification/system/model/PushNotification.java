package notification.system.model;

public class PushNotification extends Notification {
	
	private String userId;
	private String message;
	
	public PushNotification(String userId, String message) {
		this.userId = userId;
		this.message = message;
		
	}

	@Override
	public void send() {
		System.out.println("Enviando Push para o usuário ID: " + userId);
		System.out.println("Mensagem: " + message);
		
	}

}
