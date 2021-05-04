package model;

public class WavingInstruments extends PercussionInstruments{
	
	private String material;
	
	//Constructor
	public WavingInstruments(String idNumber, String name, String material, double height, double length, double width, Place instrumentPlace, String nameDistributor, String address, String phone){
		
		super(idNumber, name, height, length, width, instrumentPlace, nameDistributor, address, phone);
		this.material = material;
		
	}
	
	//getters and setters Methods
	public void setMaterial(String pMaterial){
		material = pMaterial;
	}
	public String getMaterial(){
		return material;
	}
	
	//toString Method
	@Override
	public String toString(){
		return "ID: " + idNumber + "\nName: " + name + "\nType: Waving Percussion Instrument" + "\nCurrently on: " + instrumentPlace + "\n";
	}

}