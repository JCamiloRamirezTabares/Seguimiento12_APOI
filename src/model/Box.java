package model;

public class Box{
	//Relationships
	private Dimensions dimensionBox;
	
	//Constructor Method
	public Box(double height, double length, double width){
		dimensionBox = new Dimensions(height, length, width);
	}
	
	//getters and setters Methods
	public void setDimensionBox(Dimensions pDimensionBox){
		dimensionBox = pDimensionBox;
	}
	public Dimensions getDimensionBox(){
		return dimensionBox;
	}
	
}