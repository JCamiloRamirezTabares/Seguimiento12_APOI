package ui;

import java.util.Scanner;
import model.PercussedInstruments;
import model.WavingInstruments;
import model.WindInstruments;
import model.RStringInstruments;
import model.PlStringInstruments;
import model.PercussionStringInstruments;

import model.Place;
import model.Material;
import model.Orientation;

public class Main{
	
	private Scanner reader;
	//Objects "Instruments"
	private static PercussedInstruments timbal;
	private static WavingInstruments maracas;
	private static WindInstruments tuba;
	private static RStringInstruments violin;
	private static PercussionStringInstruments piano;

	
	//amount of each Instruments
	private static int amountInstrumentsP;
	private static int amountInstrumentsW;
	private static int amountInstrumentsS;
	
	//places
	private static Place p1 = Place.STORE;
	private static Place p2 = Place.WAREHOUSE;
	private static Place p3 = Place.ORDER;
	
	//Constructor Method
	public Main(){
		
		reader = new Scanner(System.in);

		amountInstrumentsP = 0;
		amountInstrumentsW = 0;
		amountInstrumentsS = 0;
		
		
		System.out.println("========== BIENVENIDO ===========\n");
	
	}
	
	public static void main(String []juank){
		
		Main ppal = new Main();
		
		Material m1 = Material.METAL;
		Material m2 = Material.WOODEN;
		
		Orientation o1 = Orientation.VERTICAL;
		Orientation o2 = Orientation.HORIZONTAL;
		
		timbal = new PercussedInstruments("A36", "Timbal", 16, 5, 9, p1, "TIMBALES S.A", "Cra. 20 #7N-22", "555-3123", "Baquetas", "Wooden", 2, 3, 5, 2);
		maracas = new WavingInstruments("A37", "Maracas", "Wooden", 16, 5, 9, p2, "TIENDA EL MARIACHI", "Cra. 21 #7N-22", "555-3243");
		tuba = new WindInstruments("T23K", "Tuba", 17, 21, 11, p2, "Don Tubas S.A", "Cra 2 #4N-55", "444-8931", m1);
		violin = new RStringInstruments("G54R", "Violin", 18, 8.5, 9.1, 6, p1, "Violines y Violonchelos S.A", "Calle 78 #5-22", "01-31231", 9, 8, 7);
		piano = new PercussionStringInstruments("K27R", "Piano", 55, 45, 38, o2, p1, "Pianos Beethoven S.A", "Cra 5 #37-15", "333-1231", 22, 22, 17, 37, "Wooden", 19, 7, 12);
	
		amountInstrumentsP = 2;
		amountInstrumentsW = 1;
		amountInstrumentsS = 2;
		
		int option;
		
		do{
			option = ppal.showMenu();
			System.out.println("==========================\n");
			
			switch(option){
				case 1:
				ppal.showAllInstruments();
				break;
				case 2:
				ppal.showAmountInstruments();
				break;
				default:
				option = 0;
				break;
			}
		}while(option != 0);
		
	}
	
	public int showMenu(){
		System.out.println("Escoga la opcion que desea consultar: ");
		System.out.println("(1) Para listar la informacion de los instrumentos disponibles");
		System.out.println("(2) Para consultar cuantos instrumentos hay de cada tipo");
		System.out.println("Cualquier otro numero para salir");
		System.out.print("Opcion: ");
		
		int option = reader.nextInt();
		reader.nextLine();
		
		return option;
		
	}
	
	public void showAllInstruments(){
		
		String instruments_At_Store = "==========================\n== Instruments on store ==\n==========================\n";
		String instruments_At_Warehouse = "==============================\n== Instruments on warehouse ==\n==============================\n";
		
		if(timbal.getInstrumentPlace() == p1){
			instruments_At_Store += timbal.toString() + "\n";
		} else{instruments_At_Warehouse += timbal.toString() + "\n";}
		
		if(maracas.getInstrumentPlace() == p1){
			instruments_At_Store += maracas.toString() + "\n";
		} else{instruments_At_Warehouse += maracas.toString() + "\n";}
		
		if(tuba.getInstrumentPlace() == p1){
			instruments_At_Store += tuba.toString() + "\n";
		} else{instruments_At_Warehouse += tuba.toString() + "\n";}
		
		if(violin.getInstrumentPlace() == p1){
			instruments_At_Store += violin.toString() + "\n";
		} else{instruments_At_Warehouse += violin.toString() + "\n";}
		
		if(piano.getInstrumentPlace() == p1){
			instruments_At_Store += piano.toString() + "\n";
		} else{instruments_At_Warehouse += piano.toString() + "\n";}
		
		System.out.println(instruments_At_Store);
		System.out.println(instruments_At_Warehouse);
	}
	
	public void showAmountInstruments(){
		int option = 0;
		
		do{
			System.out.println("Porfavor digite el numero correspondiente al tipo de instrumentos que desea consultar:");
			System.out.println("(1) Para mostrar la cantidad de Instrumentos de Percusion");
			System.out.println("(2) Para mostrar la cantidad de Instrumentos de Viento");
			System.out.println("(3) Para mostrar la cantidad de Instrumentos de Cuerda");
			System.out.print("Opcion: ");
			option = reader.nextInt();
			reader.nextLine();
			
			switch(option){
				case 1:
				System.out.println("Currenly there: " + amountInstrumentsP + " percussion Instruments");
				break;
				case 2:
				System.out.println("Currenly there: " + amountInstrumentsW + " Wind Instruments");
				break;
				case 3:
				System.out.println("Currenly there: " + amountInstrumentsS + " String Instruments");
				break;
				default:
				option = 0;
				break;
			}
			
			
		}while(option == 0);
		
	}
	
}