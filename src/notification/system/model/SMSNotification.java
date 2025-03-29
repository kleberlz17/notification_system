package notification.system.model;

public class SMSNotification extends Notification {
	
	private String phoneNumber;
	private String message;
	
	public SMSNotification(String phoneNumber, String message) {
		this.phoneNumber = phoneNumber;
		this.message = message;
		
	}

	@Override
	public void send() {
		System.out.println("Enviando SMS para o número: " + phoneNumber);
		System.out.println("Mensagem: " + message);
		
	}

}
