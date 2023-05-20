package factorymethod;

public class SmsNotification implements Notification {

	//Email küldése a felhasználónak.
	@Override
	public void notifyUser() {
		System.out.println("This is an sms notification.");
		
	}

}
