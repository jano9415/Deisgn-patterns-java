package command;

//Receiver osztály (kérvényező)
public class Document {
	
	private String fileName;
	
	public Document(String fileName) {
		this.fileName = fileName;
	}
	
	public void open() {
		System.out.println("Named " + fileName + " document is opened");
	}
	
	public void save() {
		System.out.println("Named " + fileName + " document is saved");
	}

}
