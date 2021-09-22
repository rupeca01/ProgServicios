package EjerciciosT1;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0;
		System.out.print("Numero 1: ");
		Scanner teclado = new Scanner(System.in);
		n1 = teclado.nextInt();
		
		int n2=0;
		System.out.print("Numero 2: ");
		n2=teclado.nextInt();
		teclado.close();
		
		int total = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = " + total);
	}

}
