package uppgift.v36;

import java.util.Scanner;

public class Uppgift_programmering {
	
	public static void main(String[] args) {
		
	 System.out.println("Vad heter du?");
		
	 Scanner input = new Scanner(System.in);
	 String name = input.nextLine();
	 
	 System.out.println("Hur gammal �r du?");
	 String age = input.nextLine();
	 
	 System.out.println("Vad �r din adress?");
	 String address = input.nextLine();
	 
	 System.out.println("Vad �r ditt postnummer?");
	 String postcode = input.nextLine();
	 
	 System.out.println("Vilken stad bor du i?");
	 String city = input.nextLine();
	 
	 System.out.println("Vad �r ditt telefonnummer?");
	 String number = input.nextLine();
	 
	 System.out.println("Information: ");
	 System.out.println("Namn: " + name);
	 System.out.println("�lder: " + age + " �r");
	 System.out.println("Adress: " + address);
	 System.out.println(postcode +  city);
	 System.out.println("Telefon: " + number);
	 
	 input.close();
	}

}
