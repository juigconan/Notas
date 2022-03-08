package notas;

import java.util.Scanner;

public class Notas {

	public final static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int notas;
		String cadena;
		System.out.println("Introduzca una nota: ");
		notas = reader.nextInt();

		cadena = califica(notas);

		System.out.print(cadena);
		reader.close();
	}

	/**
	 * @param num_nota
	 * @return
	 */
	public static String califica(int num_nota) {
		String cadena;
		if (num_nota >= 0 && num_nota < 5) {
			cadena = "Suspenso";
		} else if (num_nota >= 5 && num_nota < 7) {
			cadena = "Aprobado";
		} else if (num_nota >= 7 && num_nota < 9) {
			cadena = "Notable";
		} else if (num_nota >= 9 && num_nota <= 10) {
			cadena = "Sobresaliente";
		} else {
			cadena = "La nota introducida no es correcta";
		}
		return cadena;
	}
}