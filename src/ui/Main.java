package ui;

import java.util.Scanner;
import model.MusicShop;

public class Main{
	
	private Scanner reader;
	private MusicShop musicShop;
	
	//Constructor Method
	public Main(){
		
		reader = new Scanner(System.in);
		musicShop = new MusicShop();
		
		System.out.println("*********************************");
		System.out.println("********** BIENVENIDO ***********");
		System.out.println("*********************************\n");
		
	}
	
	public static void main(String []juank){
		
		Main ppal = new Main();
		
		
		int option;
		
		do{
			option = ppal.showMenu();
			System.out.println("==============================\n");
			
			switch(option){
				case 1:
				ppal.show_All_Instruments();
				break;
				case 2:
				ppal.show_Instruments_In_Order();
				break;
				case 3:
				ppal.show_Number_of_Instruments();
				break;
				default:
				option = 0;
				System.out.println("Bye, see you later :3");
				break;
			}
		}while(option != 0);
		
	}
	
	public int showMenu(){
		System.out.println("Escoga la opcion que desea consultar: ");
		System.out.println("(1) Para listar la informacion de los instrumentos disponibles");
		System.out.println("(2) Para listar la informacion de los instrumentos en tienda y en bodega");
		System.out.println("(3) Para consultar cuantos instrumentos hay de cada tipo");
		System.out.println("Cualquier otro numero para salir");
		System.out.print("Opcion: ");
		
		int option = reader.nextInt();
		reader.nextLine();
		
		return option;
		
	}
	
	public void show_All_Instruments(){
		System.out.println(musicShop.toString() + "\n");
	}
	
	public void show_Instruments_In_Order(){
		System.out.println(musicShop.inventary() + "\n");
	}
	
	public void show_Number_of_Instruments(){
		System.out.println(musicShop.amount_Instruments_For_Each_Type());
	}
	
}