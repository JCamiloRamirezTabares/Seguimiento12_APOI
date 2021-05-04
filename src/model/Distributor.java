package model;

public class Distributor{
	
	private String name;
	private String address;
	private String phone;
	
	//Constructor Method
	public Distributor(String name, String address, String phone){
		
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}
	
	//getters and setters Methods
	public void setName(String pName){
		name = pName;
	}
	public String getName(){
		return name;
	}
	
	public void setAddress(String pAddress){
		address = pAddress;
	}
	public String getAddress(){
		return address;
	}
	
	public void setPhone(String pPhone){
		phone = pPhone;
	}
	public String getPhone(){
		return phone;
	}
	
}