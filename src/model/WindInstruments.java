package model;

public class WindInstruments extends Instruments{
	
	//Relationships
	private Material materialInstrument;
	
	public WindInstruments(String idNumber, String name, double height, double length, double width, Place instrumentPlace, String nameDistributor, String address, String phone, Material materialInstrument){
		
		super(idNumber, name, height, length, width, instrumentPlace, nameDistributor, address, phone);
		this.materialInstrument = materialInstrument;
	}
	
	//getters and setters Methods
	public void setMaterial(Material pInstrumentMaterial){
		materialInstrument = pInstrumentMaterial;
	}
	public Material getMaterial(){
		return materialInstrument;
	}
	
	//toString Method
	@Override
	public String toString(){
		return "ID: " + idNumber + "\nName: " + name + "\nType: Wind Instrument" + "\nCurrently on: " + instrumentPlace + "\n";
	}
	
}