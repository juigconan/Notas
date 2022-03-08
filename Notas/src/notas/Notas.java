package notas;

import java.util.Scanner;

public class Notas {

	public final static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int notas;
		String cadena;
		System.out.println("Introduzca una nota: ");
		notas = reader.nextInt();

		cadena = califica.califica(notas);

		System.out.print(cadena);
		reader.close();
	}

	/**
	 * @param notas
	 * @return
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	public static String cali(int notas) {
		return califica.califica(notas);
	}

	/**
	 * @param num_nota
	 * @return
	 * @deprecated Use {@link califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return califica.califica(num_nota);
	}
}