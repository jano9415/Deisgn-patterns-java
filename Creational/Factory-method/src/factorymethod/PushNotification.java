package factorymethod;

public class PushNotification implements Notification {
	
	//Push �zenet k�ld�se a felhaszn�l�nak.
	@Override
	public void notifyUser() {
		System.out.println("This is push notification.");
		
	}

}
