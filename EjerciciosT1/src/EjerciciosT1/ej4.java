package EjerciciosT1;

import java.util.Scanner;

public class ej4 {

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
		
		if(n1>n2) {
			System.out.println(n1 + " es mayor que " + n2);
		}else if (n2>n1) {
			System.out.println(n2 + " es mayor que " + n1);
		}else {
			System.out.println("Los numeros son iguales " + n1 + "="+ n2);
		}
	}

}
