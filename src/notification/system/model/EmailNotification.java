package notification.system.model;

public class EmailNotification extends Notification{
	
	private String emailAddress;
	private String message;
	
	public EmailNotification(String emailAddress, String message) {
		this.emailAddress = emailAddress;
		this.message = message;
	}

	@Override
	public void send() {
		System.out.println("Enviando email para: " + emailAddress);
		System.out.println("Mensagem: " + message);
		
	}


		
		
	
}
