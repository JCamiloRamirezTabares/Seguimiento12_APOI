package model;

public class Bow{
	//Relationships
	private Dimensions dimensionBow;
	
	//Constructor Method
	public Bow(double height, double length, double width){
		dimensionBow = new Dimensions(height, length, width);
	}
	
	//getters and setters Methods
	public void setDimensionBow(Dimensions pDimensionBow){
		dimensionBow = pDimensionBow;
	}
	public Dimensions getDimensionBow(){
		return dimensionBow;
	}
	
}