package Builder;

public class Computer {
	
	//K�telez� param�terek
	private int hddCapacity;
	private String hddType;
	private String graphicscardType;
	
	//Opcion�lis param�terek
	private boolean isBluetooth;
	private String networkcardType;
	
	public Computer(ComputerBuilder builder) {
		
		//K�telez� param�terek be�ll�t�sa
		this.hddCapacity = builder.hddCapacity;
		this.hddType = builder.hddType;
		this.graphicscardType = builder.graphicscardType;
		//Opcion�lis param�terek be�ll�t�sa
		this.isBluetooth = builder.isBluetooth;
		this.networkcardType = builder.networkcardType;
		
	}

	//Getterek
	public int getHddCapacity() {
		return hddCapacity;
	}

	public String getHddType() {
		return hddType;
	}

	public String getGraphicscardType() {
		return graphicscardType;
	}

	public boolean isBluetooth() {
		return isBluetooth;
	}

	public String getNetworkcardType() {
		return networkcardType;
	}
	
	
	@Override
	public String toString() {
		return "Computer [hddCapacity=" + hddCapacity + ", hddType=" + hddType + ", graphicscardType="
				+ graphicscardType + ", isBluetooth=" + isBluetooth + ", networkcardType=" + networkcardType + "]";
	}




	//Builder oszt�ly
	public static class ComputerBuilder {
		
		//K�telez� param�terek
		private int hddCapacity;
		private String hddType;
		private String graphicscardType;
		
		//Opcion�lis param�terek
		private boolean isBluetooth;
		private String networkcardType;
		
		//A konstruktor �ll�tja be a k�telez� param�tereket
		public ComputerBuilder(int hddCapacity, String hddType, String graphicscardType) {
			this.hddCapacity = hddCapacity;
			this.hddType = hddType;
			this.graphicscardType = graphicscardType;
		}

		//Opcion�lis param�terek be�ll�t�sa
		public ComputerBuilder bluetooth(boolean isBluetooth) {
			this.isBluetooth = isBluetooth;
			return this;
		}

		public ComputerBuilder networkcardType(String networkcardType) {
			this.networkcardType = networkcardType;
			return this;
		}
		
		//Build f�ggv�ny. Ez adja vissza a computer objektumot
		public Computer build() {
			return new Computer(this);
		}
		
		
		
	}
	
	

}
