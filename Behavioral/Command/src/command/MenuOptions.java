package command;


//Invoker osztály (végrehajtó)
public class MenuOptions {
	
	private ActionListenerCommand openCommand;
	private ActionListenerCommand saveCommand;
	
	public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
		this.openCommand = open;
		this.saveCommand = save;
	}
	
	public void clickOpen() {
		openCommand.execute();
		System.out.println("----by clicking the menu----");
	}
	
	public void clickSave() {
		saveCommand.execute();
		System.out.println("----by clicking the menu----");
	}

}
