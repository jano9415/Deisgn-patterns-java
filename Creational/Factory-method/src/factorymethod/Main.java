package factorymethod;

public class Main {
	public static void main(String[] args) {
		
		//Gyár objektum létrehozása
		NotificationFactory notificationFactory = new NotificationFactory();
		
		//Sms értesítés objektum létrehozása. A gyár gyártja le az objektumot.
		Notification smsNotification = notificationFactory.createNotification("sms");
		
		//Sms küldése
		smsNotification.notifyUser();
		
		//Email értesítés objektum létrehozása. A gyár gyártja le az objektumot.
		Notification emailNotification = notificationFactory.createNotification("email");
		
		//Email küldése
		emailNotification.notifyUser();
		

	}

}
