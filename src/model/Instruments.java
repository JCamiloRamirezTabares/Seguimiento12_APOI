package model;

public class Instruments{
	
	protected String idNumber;
	protected String name;
	
	//Relationships
	protected Dimensions dimension;
	protected Place instrumentPlace;
	protected Distributor distributorCompany;
	
	//Constructors Method
	public Instruments(String idNumber, String name, double height, double length, double width, Place instrumentPlace, String nameDistributor, String address, String phone){
		
		this.idNumber = idNumber;
		this.name = name;
		dimension = new Dimensions(height, length, width);
		this.instrumentPlace = instrumentPlace;
		distributorCompany = new Distributor(nameDistributor, address, phone);
		
	} 
	
	//getters and setters Methods
	public void setIdNumber(String pIdNumber){
		idNumber = pIdNumber;
	}
	public String getIdNumber(){
		return idNumber;
	}
	
	public void setDimension(Dimensions pDimension){
		dimension = pDimension;
	}
	public Dimensions getDimension(){
		return dimension;
	}
	
	public void setInstrumentPlace(Place pInstrumentPlace){
		instrumentPlace = pInstrumentPlace;
	}
	public Place getInstrumentPlace(){
		return instrumentPlace;
	}
	
	public void setDistributorCompany(Distributor pDistributorCompany){
		distributorCompany = pDistributorCompany;
	}
	public Distributor getDistributorCompany(){
		return distributorCompany;
	}
	
	//toString Method
	public String toString(){
		return "ID: " + idNumber + "\nName: " + name + "\nCurrently on: " + instrumentPlace + "\n";
	}
	
}