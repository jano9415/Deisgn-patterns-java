package factorymethod;

public class EmailNotification implements Notification{
	
	//Sms k�ld�se a felhaszn�l�nak.
	@Override
	public void notifyUser() {
		System.out.println("This is an email notification.");
		
	}

}
