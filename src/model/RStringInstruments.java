package model;

public class RStringInstruments extends StringInstruments{
	
	private int stringNumber;
	
	//Relationships
	private Bow bow;
	
	//Constructor Method
	public RStringInstruments(String idNumber, String name, int stringNumber, double height, double length, double width, Place instrumentPlace, String nameDistributor, String address, String phone, double heightBow, double lengthBow, double widthBow){
		
		super(idNumber, name, height, length, width, instrumentPlace, nameDistributor, address, phone);
		this.stringNumber = stringNumber;
		bow = new Bow(heightBow, lengthBow, widthBow);
	}
	
	//getters and setters Methods
	public void setStringNumber(int pStringNumber){
		stringNumber = pStringNumber;
	}
	public int getStringNumber(){
		return stringNumber;
	}
	
	public void setBow(Bow pBow){
		bow = pBow;
	}
	public Bow getBow(){
		return bow;
	}
	
	//toString Method
	@Override
	public String toString(){
		return "ID: " + idNumber + "\nName: " + name + "\nType: Rubbed String Instrument" + "\nCurrently on: " + instrumentPlace + "\n";
	}
}