package br.com.alura.conversao;

public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 20;
		boolean acompanhado = true;
		
		System.out.println("o valor de acompanhado e: " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");
		}
		
	

	}
}
