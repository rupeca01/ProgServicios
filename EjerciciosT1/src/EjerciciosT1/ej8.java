package EjerciciosT1;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		num = teclado.nextInt();
		teclado.close();
		if(num==1) {
			System.out.println("El mes 1 es enero");
		}else if(num==2) {
			System.out.println("El mes 2 es febrero");
		}else if(num==3) {
			System.out.println("El mes 3 es marzo");
		}else if(num==4) {
			System.out.println("El mes 4 es abril");
		}else if(num==5) {
			System.out.println("El mes 5 es mayo");
		}else if(num==6) {
			System.out.println("El mes 6 es junio");
		}else if(num==7) {
			System.out.println("El mes 7 es julio");
		}else if(num==8) {
			System.out.println("El mes 8 es agosto");
		}else if(num==9) {
			System.out.println("El mes 9 es septiembre");
		}else if(num==10) {
			System.out.println("El mes 10 es octubre");
		}else if(num==11) {
			System.out.println("El mes 11 es noviembre");
		}else if(num==12) {
			System.out.println("El mes 12 es diciembre");
		}else {
			System.out.println("El numero introducido es incorrecto");
		}
		
		
	}

}
