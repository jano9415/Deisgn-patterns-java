package factorymethod;

public class Main {
	public static void main(String[] args) {
		
		//Gy�r objektum l�trehoz�sa
		NotificationFactory notificationFactory = new NotificationFactory();
		
		//Sms �rtes�t�s objektum l�trehoz�sa. A gy�r gy�rtja le az objektumot.
		Notification smsNotification = notificationFactory.createNotification("sms");
		
		//Sms k�ld�se
		smsNotification.notifyUser();
		
		//Email �rtes�t�s objektum l�trehoz�sa. A gy�r gy�rtja le az objektumot.
		Notification emailNotification = notificationFactory.createNotification("email");
		
		//Email k�ld�se
		emailNotification.notifyUser();
		

	}

}
