package command;

//Konkr�t command oszt�ly
public class ActionOpen implements ActionListenerCommand {
	
	private Document document;
	
	public ActionOpen(Document document) {
		this.document = document;
	}

	@Override
	public void execute() {
		document.open();
		
	}

}
