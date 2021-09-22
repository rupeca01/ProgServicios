package es.florida.app;

import java.util.ArrayList;
import java.util.Scanner;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Elije que actividad realizar: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		switch (n) {
		case 1:
			sayHello();
			break;
		case 2:
			System.out.print("Elije que apartado: ");
			Scanner scan2 = new Scanner(System.in);
			String letra2 = scan2.nextLine();
			switch (letra2) {
			case "a":
				sayCompa�erosA();
				break;
			case "b":
				sayCompa�erosB();
				break;
			}
			break;
		case 3:
			sumaPares();
			break;
		}
	}

	// Actividad 1
	public static void sayHello() {
		System.out.println("============================================================");
		System.out.print("Hola Mundo");
	}

	// Actividad 2
	public static void sayCompa�erosA() {
		System.out.println("============================================================");
		String[] nombres = new String[] { "Ruben", "Adri", "Jose", "Pablo", "Victor", "Pepe" };
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Hola " + nombres[i]);
		}
	}

	public static void sayCompa�erosB() {
		System.out.println("============================================================");
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Ruben");
		nombres.add("Adri");
		nombres.add("Jose");
		nombres.add("Pablo");
		nombres.add("Victor");
		nombres.add("Pepe");
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println("Hola " + nombres.get(i));
		}
	}

	// Actividad 3
	public static void sumaPares() {
		System.out.println("============================================================");
		System.out.print("Introduce un numero: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int total=0;
		for(int i = 0;i<=n;i++) {
			if(i%2==0) {
				total+=i;
			}
		}
		System.out.println("Total = " + total);
	}
}
