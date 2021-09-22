package EjerciciosT1;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int total=0;
		int i=1;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Numero " + i + ": ");
			num=teclado.nextInt();
			total+=num;
			i++;
		}while(i<=5);
		
		teclado.close();
		
		
		
		System.out.println("El total es: " + total);
		
	}

}
