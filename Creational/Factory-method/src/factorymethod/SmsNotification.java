package factorymethod;

public class SmsNotification implements Notification {

	//Email k�ld�se a felhaszn�l�nak.
	@Override
	public void notifyUser() {
		System.out.println("This is an sms notification.");
		
	}

}
