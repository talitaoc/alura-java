package br.com.alura.conversao;

public class ExercicioLaco2 {

	public static void main(String[] args) {

		System.out.println("----Exercicio de Resto----");
		for (int numero = 1; numero <= 100; numero++) {

			if (numero % 3 == 0) {
				System.out.println(numero);
			}

		}
		
		System.out.println("----Exercicio de Fatorial----");
		int fatorial = 1;
		
		for (int i = 1; i < 8; i++) {
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
			
		}

	}

}
