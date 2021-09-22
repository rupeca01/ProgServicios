package EjerciciosT1;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int total=0;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 1;i<=5;i++) {
			System.out.print("Numero " + i + ": ");
			num=teclado.nextInt();
			total+=num;
		}
		
		teclado.close();
		
		
		
		System.out.println("El total es: " + total);
		
		
	}

}
