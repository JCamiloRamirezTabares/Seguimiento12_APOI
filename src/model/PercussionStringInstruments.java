package model;

public class PercussionStringInstruments extends StringInstruments{
	
	//Relationships
	private Orientation orientationInstrument;
	private Box box;
	private Keyboard keyboard;
	
	public PercussionStringInstruments(String idNumber, String name, double height, double length, double width, Orientation orientationInstrument, Place instrumentPlace, String nameDistributor, String address, String phone, double heightBox, double lengthBox, double widthBox, int amountOctaves, String material, double heightKeyboard, double lengthKeyboard, double widthKeyboard){
		
		super(idNumber, name, height, length, width, instrumentPlace, nameDistributor, address, phone);
		this.orientationInstrument = orientationInstrument;
		box = new Box(heightBox, lengthBox, widthBox);
		keyboard = new Keyboard(amountOctaves, material, heightKeyboard, lengthKeyboard, widthKeyboard);
		
	}
	
	//getters and setters Methods
	public void setOrientationInstrument(Orientation pOrientationInstrument){
		orientationInstrument = pOrientationInstrument;
	}
	public Orientation getOrientationInstrument(){
		return orientationInstrument;
	}
	
	public void setBox(Box pBox){
		box = pBox;
	}
	public Box getBox(){
		return box;
	}
	
	public void setKeyboard(Keyboard pKeyboard){
		keyboard = pKeyboard;
	}
	public Keyboard getKeyboard(){
		return keyboard;
	}
	
	//toString Method
	@Override
	public String toString(){
		return "ID: " + idNumber + "\nName: " + name + "\nType: Percussion String Instrument" + "\nCurrently on: " + instrumentPlace + "\n";
	}
	
}