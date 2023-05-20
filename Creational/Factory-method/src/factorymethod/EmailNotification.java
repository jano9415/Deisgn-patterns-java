package factorymethod;

public class EmailNotification implements Notification{
	
	//Sms küldése a felhasználónak.
	@Override
	public void notifyUser() {
		System.out.println("This is an email notification.");
		
	}

}
