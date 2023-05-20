package mediator;

public class User {
	
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//�zenet k�ld�se. �tadom az elk�ldeni k�v�nt �zenetet, �s magamat (a saj�t objektumomat)
	public void sendMessage(String message) {
		ChatRoomMediator.showMessage(this, message);
	}

}
