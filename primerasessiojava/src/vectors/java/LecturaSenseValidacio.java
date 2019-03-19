package vectors.java;

import java.util.Scanner;

public class LecturaSenseValidacio {
	private static final int NUM_VALORS = 10;

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Escriu " + NUM_VALORS + " enters. Es pot fer en diferents l�nies.");
		// Es llegeixen exactament NUM_VALORS valors.
		int numValorsLlegits = 0;
		while (numValorsLlegits < NUM_VALORS) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			if (lector.hasNextInt()) {
				int valor = lector.nextInt();
				System.out.println("Valor " + numValorsLlegits + " llegit:" + valor);
				numValorsLlegits++;
			} else {
				// Si el valor no �s enter, es llegeix per� s'ignora.
				// No s'avan�a tampoc el comptador.
				lector.next();
			}
		}
		// Els valors que sobrin a la darrera l�nia escrita es descarten.
		lector.nextLine();
		System.out.println("Ja s'han llegit " + NUM_VALORS + "valors.");
	}

}
