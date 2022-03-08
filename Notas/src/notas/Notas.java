package notas;

import java.util.Scanner;

public class Notas {

	public final static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int notas;
		String cadena;
		System.out.println("Introduzca una nota: ");
		notas = reader.nextInt();

		cadena = cali(notas);

		System.out.print(cadena);
		reader.close();
	}

	/**
	 * @param notas
	 * @return
	 */
	public static String cali(int notas) {
		String cadena;
		if (notas >= 0 && notas < 5) {
			cadena = "Suspenso";
		} else if (notas >= 5 && notas < 7) {
			cadena = "Aprobado";
		} else if (notas >= 7 && notas < 9) {
			cadena = "Notable";
		} else if (notas >= 9 && notas <= 10) {
			cadena = "Sobresaliente";
		} else {
			cadena = "La nota introducida no es correcta";
		}
		return cadena;
	}
}