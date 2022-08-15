package br.com.alura.conversao;

public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;
		System.out.println("Seu salario: " + salario);
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Aliquota 7,5%");
			System.out.println("Deducao de R$145");
		}else if(salario >= 2800.01 && salario >= 371.0) {
			System.out.println("Aliquota 15%:");
			System.out.println("Deducao de R$350");
		}else if(salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Aliquota 22,5%");
			System.out.println("Deducao de R$636");
		}else {
			System.out.println("Voce nao paga imposto de renda");
		}

	}

}
