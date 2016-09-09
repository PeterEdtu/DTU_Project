/*
 * Peter EL-HABR s165202
 * Mathias Lindblad s165247
 * 
 * 09/09/2016
 * version 1.0
 */

import java.util.Scanner;

public class MainClass {
	public static MainClass m = new MainClass(); //Vi laver en ny variabel class m, til at kalde paa vores metode
	static void Program(){
		Scanner reader = new Scanner(System.in); //Vi laver en scanner saa vi kan indtaste hoejden
		System.out.println("enter a height (m>=0): ");
		try{ //Vi laver en try for at stoppe brugeren i at skrive bogstaver eller tegn, saa de kun kan skrive int
			double h = reader.nextDouble();
			if (h>=0.0){
			double t = Math.sqrt((2*h)/9.82);
			System.out.println("Time to fall is: "+t+" seconds");
			double v = 9.82*t;
			System.out.println("Speed: "+v+" m/s");
			}
			else m.Program();
		}catch (Exception e){ //Hvis der er et problem i programmet startes programmet forfra
			System.out.println("Error:"+e);
			m.Program();	
		}
		reader.close();
	}

	public static void main(String[] args) {
		m.Program();

	}
}
