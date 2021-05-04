package model;

public class Keyboard{
	
	private int amountOctaves;
	private String material;
	
	//Relationships
	private Dimensions dimensionKeyboard;
	
	//Constructor Method
	public Keyboard(int amountOctaves, String material, double height, double length, double width){
		
		this.amountOctaves = amountOctaves;
		this.material = material;
		dimensionKeyboard = new Dimensions(height, length, width);
		
	}
	
	//getters and setters Methods
	public void setAmountOctaves(int pAmountOctaves){
		amountOctaves = pAmountOctaves;
	}
	public int getAmountOctaves(){
		return amountOctaves;
	}
	
	public void setMaterial(String pMaterial){
		material = pMaterial;
	}
	public String getMaterial(){
		return material;
	}
	
	public void setDimensionKeyboard(Dimensions pDimensionKeyboard){
		dimensionKeyboard = pDimensionKeyboard;
	}
	public Dimensions getDimensionKeyboard(){
		return dimensionKeyboard;
	}
	
	
}