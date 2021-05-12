package model;

public class MusicShop{
	
	private Instruments [] allInstruments;
	
	//Constructor Method
	public MusicShop(){
		
		allInstruments = new Instruments[5];
		
		for(int i = 0; i < allInstruments.length; i++){
			
			if(i == 0){
				allInstruments[i] = new PercussedInstruments("A36", "Timbal", 16, 5, 9, Place.STORE, "TIMBALES S.A", "Cra. 20 #7N-22", "555-3123", "Baquetas", "Wooden", 2, 3, 5, 2);
			} else if(i == 1){
				allInstruments[i] = new WavingInstruments("A37", "Maracas", "Wooden", 16, 5, 9, Place.WAREHOUSE, "TIENDA EL MARIACHI", "Cra. 21 #7N-22", "555-3243");
			} else if(i == 2){
				allInstruments[i] = new WindInstruments("T23K", "Tuba", 17, 21, 11, Place.WAREHOUSE, "Don Tubas S.A", "Cra 2 #4N-55", "444-8931", Material.METAL);
			} else if(i == 3){
				allInstruments[i] = new RStringInstruments("G54R", "Violin", 18, 8.5, 9.1, 6, Place.STORE, "Violines y Violonchelos S.A", "Calle 78 #5-22", "01-31231", 9, 8, 7);
			} else if(i == 4){
				allInstruments[i] = new PercussionStringInstruments("K27R", "Piano", 55, 45, 38, Orientation.HORIZONTAL, Place.STORE, "Pianos Beethoven S.A", "Cra 5 #37-15", "333-1231", 22, 22, 17, 37, "Wooden", 19, 7, 12);
			}
			
		}
		
	}
	
	//Methods
	public String inventary(){
		
		String instrumentsWarehouse = "==============================\n== Instruments on warehouse ==\n==============================\n", instrumentsStore = "==========================\n== Instruments on store ==\n==========================\n";
		
		for(int i = 0; i < allInstruments.length; i++){
			
			if(allInstruments[i].getInstrumentPlace() == Place.STORE){
				instrumentsStore += allInstruments[i].toString() + "\n";
			} else if(allInstruments[i].getInstrumentPlace() == Place.WAREHOUSE){
				instrumentsWarehouse += allInstruments[i].toString() + "\n";
			}
			
		}
		
		return "===============\n== INVENTARY ==\n===============\n\n" + instrumentsStore + "\n" + instrumentsWarehouse;
		
	}
	
	public String amount_Instruments_For_Each_Type(){
		
		String amountInstruments = "";
		int countP = 0, countW = 0, countS = 0;
		
		for(int i = 0; i < allInstruments.length; i++){
			if(allInstruments[i] instanceof PercussionInstruments){
				countP += 1;
			} else if(allInstruments[i] instanceof WindInstruments){
				countW += 1;
			} else if(allInstruments[i] instanceof StringInstruments){
				countS += 1;
			}
		}
		
		amountInstruments = "Number of Instruments\nPercussion Instruments: " + countP + "\nWind Instruments: " + countW + "\nString Instruments: " + countS + "\n"; 
		
		return amountInstruments;
	}
	
	
	
	//toString Method
	public String toString(){
		
		String instruments = "";
		
		for(int i = 0; i < allInstruments.length; i++){
			instruments += allInstruments[i].toString() + "\n";
		}
		
		return instruments;
		
	}
	
}