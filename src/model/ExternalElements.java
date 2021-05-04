package model;

public class ExternalElements{
	
	private String nameElement;
	private String material;
	private int amountElements;
	
	//Relationships
	private Dimensions dimension;
	
	//Constructor Method
	public ExternalElements(String nameElement, String material, int amountElements, double height, double length, double width){
		
		this.nameElement = nameElement;
		this.material = material;
		this.amountElements = amountElements;
		dimension = new Dimensions(height, length, width);
		
	}
	
	//getters and setters Methods
	public void setMaterial(String pMaterial){
		material = pMaterial;
	}
	public String getMaterial(){
		return material;
	}
	
	public void setAmountElements(int pAmountElements){
		amountElements = pAmountElements;
	}
	public int getAmountElements(){
		return amountElements;
	}
	
	public void setDimension(Dimensions pDimension){
		dimension = pDimension;
	}
	public Dimensions getDimension(){
		return dimension;
	}
	
	public String toString(){
		return "Name: " + nameElement + "\nMaterial: " + material + "\nAmount needed to play the instrument: " + amountElements + "\n" + dimension.toString() + "\n======================";
	}
	
}