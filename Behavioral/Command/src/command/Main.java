package command;

public class Main {
	
	public static void main(String[] args) {
		
		Document document = new Document("cars.txt");
		
		ActionListenerCommand clickOpen = new ActionOpen(document);
		ActionListenerCommand clickSave = new ActionSave(document);
		
		//Dokumentum megnyit�sa �s ment�se a men� gomb �ltal
		MenuOptions menu = new MenuOptions(clickOpen, clickSave);
		
		menu.clickOpen();
		menu.clickSave();
		
		//Dokumentum megnyit�sa �s ment�se a gui gomb �ltal
		ButtonOptions guiButton = new ButtonOptions(clickOpen, clickSave);
		guiButton.clickOpen();
		guiButton.clickSave();
	}

}
