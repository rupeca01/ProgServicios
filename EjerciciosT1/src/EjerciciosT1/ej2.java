package EjerciciosT1;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom;
		System.out.print("Nombre: ");
		Scanner teclado = new Scanner(System.in);
		nom = teclado.nextLine();
		teclado.close();
		System.out.println("Hola " + nom);
		
	}

}
