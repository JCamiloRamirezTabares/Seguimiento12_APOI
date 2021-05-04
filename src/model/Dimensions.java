package model;

public class Dimensions{
	
	private double height;
	private double length;
	private double width;
	
	//Constructor Method
	public Dimensions(double height, double length, double width){
	
		this.height = height;
		this.length = length;
		this.width = width;
		
	}
	
	//getters and setters Methods
	public void setHeight(double pHeight){
		height = pHeight;
	}
	public double getHeight(){
		return height;
	}
	
	public void setLength(double pLength){
		length = pLength;
	}
	public double getLength(){
		return length;
	}
	
	public void setWidth(double pWidth){
		width = pWidth;
	}
	public double getWidth(){
		return width;
	}
	
	//toString Method
	public String toString(){
		return "With dimensions of: \nHeight: " + height + "\nLength: " + length + "\nWidth: " + width;
	}
	
}