package model;

//Percussion Instruments that is Percussed
public class PercussedInstruments extends PercussionInstruments{
	
	//Relationships
	private ExternalElements elementNeeded;
	
	//Constructor Method
	public PercussedInstruments(String idNumber, String name, double height, double length, double width, Place instrumentPlace, String nameDistributor, String address, String phone, String nameElement, String material, int amountElements, double heightE, double lengthE, double widthE){
		
		super(idNumber, name, height, length, width, instrumentPlace, nameDistributor, address, phone);
		elementNeeded = new ExternalElements(nameElement, material, amountElements, heightE, lengthE, widthE);
		
	}
	
	//getters and setters Methods
	public void setElementNeeded(ExternalElements pElementNeeded){
		elementNeeded = pElementNeeded;
	}
	public ExternalElements getElementNeeded(){
		return elementNeeded;
	}
	
	
	//toString Method
	@Override
	public String toString(){
		return "ID: " + idNumber + "\nName: " + name + "\nType: Percussed Percussion Instrument" + "\nCurrently on: " + instrumentPlace + "\n";
	}
	
	
} 