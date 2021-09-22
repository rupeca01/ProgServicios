package EjerciciosT1;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0;
		int n2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.print("Numero 1: ");
			
			n1 = teclado.nextInt();

			
			System.out.print("Numero 2: ");
			n2 = teclado.nextInt();
			
		} while (n1 != n2);
		teclado.close();
		System.out.println("Programa finalizado");

	}

}
