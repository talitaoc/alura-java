package br.com.alura.conversao;

public class TesteCondicionalSwitch {

	public static void main(String[] args) {

		int mes = 3;

		switch (mes) {
		case 1:
			System.out.println("O mes é Janeiro");
			break;
		case 2:
			System.out.println("O mes é Fevereiro");
			break;
		case 3:
			System.out.println("O mes é Marco");
			break;
		case 4:
			System.out.println("O mes é Abril");
			break;
		case 5:
			System.out.println("O mes é Maio");
			break;
		case 6:
			System.out.println("O mes é Junho");
			break;
		case 7:
			System.out.println("O mes é Julho");
			break;
		case 8:
			System.out.println("O mes é Agosto");
			break;
		case 9:
			System.out.println("O mes é Setembro");
			break;
		case 10:
			System.out.println("O mes é Outubro");
			break;
		case 11:
			System.out.println("O mes é Novembro");
			break;
		case 12:
			System.out.println("O mes é Dezembro");
			break;
		default:
			System.out.println("Mes inválido");
			break;
		}
	}
}
