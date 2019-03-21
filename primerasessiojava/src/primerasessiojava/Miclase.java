package primerasessiojava;

import java.util.Scanner;

public class Miclase {
	static final float iva = 0.21f;
	public int numero=5;
	private int numero2=10;
	public int numero3=12;

	public static void main(String[] args) {
		System.out.println("CALCULADORAAAAAAAAAAAAAAAAAAAA");
		System.out.println("Sumar");
		System.out.println("Restar");
		System.out.println("Multiplicar");
		System.out.println("DIvidir");
		System.out.println("Sortir");
		System.out.println("");

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce opcion");
		int opcion = lector.nextInt();
		lector.nextLine();

		if (opcion == 1)
			;

		{
			System.out.println("Introduce numero 1");
			int numero1 = lector.nextInt();
			System.out.println("Introduce numero 2");
			int numero2 = lector.nextInt();
			int resultado = numero1 + numero2;
			System.out.println("La suma de los dos numeros es " + numero1 + "+" + numero2 + "=" + resultado);
		}
		if (opcion == 2)
			;

		{
			System.out.println("Introduce numero 1");
			int numero1 = lector.nextInt();
			System.out.println("Introduce numero 2");
			int numero2 = lector.nextInt();
			int resultado = numero1 - numero2;
			System.out.println("La resta de los dos numero es" + numero1 + "-" + numero2 + "=" + resultado);
		}
	}
}