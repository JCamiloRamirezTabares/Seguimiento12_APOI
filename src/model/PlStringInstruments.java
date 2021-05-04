package model;

public class PlStringInstruments extends StringInstruments{
	
	private int stringNumber;
	private int fretsNumber;
	private boolean haveCase;
	
	//Constructor
	public PlStringInstruments(String idNumber, String name, double height, double length, double width, int stringNumber, int fretsNumber, boolean haveCase, Place instrumentPlace, String nameDistributor, String address, String phone){
		
		super(idNumber, name, height, length, width, instrumentPlace, nameDistributor, address, phone);
		this.stringNumber = stringNumber;
		this.fretsNumber = fretsNumber;
		this.haveCase = haveCase;
		
	}
	
	//getters and setters Methods
	public void setStringNumber(int pStringNumber){
		stringNumber = pStringNumber;
	}
	public int getStringNumber(){
		return stringNumber;
	}
	
	public void setFretsNumber(int pFretsNumber){
		fretsNumber = pFretsNumber;
	}
	public int getFretsNumber(){
		return fretsNumber;
	}
	
	public void setHaveCase(boolean pHaveCase){
		haveCase = pHaveCase;
	}
	public boolean getHaveCase(){
		return haveCase;
	}
	
	//toString Method
	@Override
	public String toString(){
		return "ID: " + idNumber + "\nName: " + name + "\nType: Plucked String Instrument" + "\nCurrently on: " + instrumentPlace + "\n";
	}
}