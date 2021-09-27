package es.florida.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		case 4:
			factorial15();
			break;
		case 5:
			maxValue();
			break;
		case 6:
			numsInverso();
			break;
		case 7:
			anyoDes();
			break;
		case 8:
			intervalo();
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
		int total = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("Total = " + total);
	}

	// Actividad 4
	public static void factorial15() {
		System.out.println("============================================================");
		int fact = 15;
		long total = 1;
		for (int i = fact; i > 0; i--) {
			total = total * i;
		}
		System.out.println("El factorial de 15 es: " + total);
	}

	// Actividad 5
	public static void maxValue() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int n;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Introduce numeros (0 para terminar): ");
			n = scan.nextInt();
			nums.add(n);
		} while (n != 0);
		int max = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > max) {
				max = nums.get(i);
			}
		}
		System.out.println("El numero mas grande es: " + max);
	}

	// Actividad 6
	public static void numsInverso() {
		int[] nums = new int[5];
		int n;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce numeros: ");
			nums[i] = scan.nextInt();
		}
		System.out.print("Array al reves: ");
		for (int i = (nums.length - 1); i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}

		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		System.out.println("El total es: " + total);
	}

	// Actividad 7
	public static void anyoDes() {
		System.out.print("Introduce tu nombre: ");
		Scanner scan = new Scanner(System.in);
		String nom = scan.nextLine();
		System.out.print("Introduce los a�os que levas como desarrollador: ");
		int an = scan.nextInt();

		if (an < 1) {
			System.out.print("Desarrollador Junior L1 � 15000-18000");
		} else if (an >= 1 && an < 2) {
			System.out.print("Desarrollador Junior L2 � 18000-22000");
		} else if (an >= 3 && an < 5) {
			System.out.print("Desarrollador Senior L1 � 22000-28000");
		} else if (an >= 5 && an < 8) {
			System.out.print("Desarrollador Senior L2 � 28000-36000");
		} else if (an >= 8) {
			System.out.print("Analista / Arquitecto. Salario a convenir en base a rol");
		}
	}

	// Actividad 8
	public static void intervalo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el maximo: ");
		int n1 = scan.nextInt();
		System.out.print("Introduce el minimo: ");
		int n2 = scan.nextInt();

		for (int i = n2; i <= n1; i++) {
			boolean primo = true;
			if (i == 0 || i == 1 || i == 4) {
				primo = false;
			} else {
				for (int x = 2; x < i / 2; x++) {
					if (i % x == 0)
						primo = false;
				}
			}
			if (primo == true) {
				System.out.println(i + " es primo");
			} else {
				System.out.println(i + " no es primo");
			}
		}

	}

}
