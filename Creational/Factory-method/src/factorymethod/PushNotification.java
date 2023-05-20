package factorymethod;

public class PushNotification implements Notification {
	
	//Push üzenet küldése a felhasználónak.
	@Override
	public void notifyUser() {
		System.out.println("This is push notification.");
		
	}

}
