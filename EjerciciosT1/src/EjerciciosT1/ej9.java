package EjerciciosT1;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		num = teclado.nextInt();
		teclado.close();
		switch (num) {
		case 1:
			System.out.println("El mes 1 es enero");
			break;
		case 2:
			System.out.println("El mes 2 es febrero");
			break;
		case 3:
			System.out.println("El mes 3 es marzo");
			break;
		case 4:
			System.out.println("El mes 4 es abril");
			break;
		case 5:
			System.out.println("El mes 5 es mayo");
			break;
		case 6:
			System.out.println("El mes 6 es junio");
			break;
		case 7:
			System.out.println("El mes 7 es julio");
			break;
		case 8:
			System.out.println("El mes 8 es agosto");
			break;
		case 9:
			System.out.println("El mes 9 es septiembre");
			break;
		case 10:
			System.out.println("El mes 10 es octubre");
			break;
		case 11:
			System.out.println("El mes 11 es noviembre");
			break;
		case 12:
			System.out.println("El mes 12 es diciembre");
			break;
		default:
			System.out.println("El numero introducido es incorrecto");
			break;
		}
	}

}
