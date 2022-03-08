package notas;

import java.util.Scanner;

/**
 * @author Juan Ignacio Fernández Carrión
 * @version 1.0
 *
 */
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
	 * llama al metodo califica dentro de la clase califica en caso de que se usara ya que esta en desuso
	 * @param notas
	 * @return
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	public static String cali(int notas) {
		return califica.califica(notas);
	}

	/**
	 * llama al metodo califica dentro de la clase califca en caso de que se usara ya que esta en desuso
	 * @param num_nota
	 * @return
	 * @deprecated Use {@link califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return califica.califica(num_nota);
	}
}