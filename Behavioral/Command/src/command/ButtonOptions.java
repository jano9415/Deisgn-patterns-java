package command;

//Invoker osztály (végrehajtó)
public class ButtonOptions {
	
	private ActionListenerCommand openCommand;
	private ActionListenerCommand saveCommand;
	
	public ButtonOptions(ActionListenerCommand open, ActionListenerCommand save) {
		this.openCommand = open;
		this.saveCommand = save;
	}
	
	public void clickOpen() {
		openCommand.execute();
		System.out.println("----by clicking the gui button----");
	}
	
	public void clickSave() {
		saveCommand.execute();
		System.out.println("----by clicking the gui button----");
	}

}
