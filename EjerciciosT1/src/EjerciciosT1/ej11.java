package EjerciciosT1;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dni;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu DNI sin letra: ");
		dni = teclado.nextInt();
		teclado.close();
	
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		char letra = letras.charAt(dni % letras.length());
		String dniLetra = "" + dni + letra;
		
		System.out.println("Su DNI con letra es: " + dniLetra);
	}

}
