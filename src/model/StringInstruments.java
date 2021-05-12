package model;

public abstract class StringInstruments extends Instruments{
	
	//Constructor Method
	public StringInstruments(String idNumber, String name, double height, double length, double width, Place instrumentPlace, String nameDistributor, String address, String phone){
		
		super(idNumber, name, height, length, width, instrumentPlace, nameDistributor, address, phone);
		
	}
	
}