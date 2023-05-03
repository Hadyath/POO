package ex1l3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<>();
		Fichariocarro fc = new Fichariocarro(carros);

		ArrayList<Caminhao> caminhoes = new ArrayList<>();
		Fichariocaminhao fca = new Fichariocaminhao(caminhoes);

		Scanner sc = new Scanner(System.in);

		int op, op1, op2;

		do {
			System.out.println("1 - Carro");
			System.out.println("2 - Caminhão");
			System.out.println("3 - Sair");
			op = Integer.parseInt(sc.nextLine());
			switch (op) {

			case 1:
				do {
					System.out.println("1 - Criar carro");
					System.out.println("2 - Alterar carro");
					System.out.println("3 - Excluir carro");
					System.out.println("4 - Consultar carro");
					System.out.println("5 - Relatorio dos carros");
					System.out.println("6 - Sair");
					op1 = Integer.parseInt(sc.nextLine());
					switch (op1) {

					case 1:
						fc.incluirCarro();
						break;
					case 2:
						fc.alterarCarro();
						break;
					case 3:
						fc.excluirCarro();
						break;
					case 4:
						fc.consultarCarro();
						break;
					case 5:
						fc.relatorioCarro();

					case 6:
						System.out.println("Voltando ao menu principal");
						break;
					default:
						System.out.println("Opção inválida");
						break;
					}

				} while (op1 != 6);
break;
			case 2:
				do {
					System.out.println("1 - Criar caminhão");
					System.out.println("2 - Alterar caminhão");
					System.out.println("3 - Excluir caminhão");
					System.out.println("4 - Consultar caminhão");
					System.out.println("5 - Relatorio dos caminhões");
					System.out.println("6 - Sair");
					op2 = Integer.parseInt(sc.nextLine());

					switch (op2) {

					case 1:
						fca.incluirCaminhao();
						break;
					case 2:
						fca.alterarCaminhao();
						break;
					case 3:
						fca.excluirCaminhao();
						break;
					case 4:
						fca.consultarCaminhao();
					case 5:
						fca.relatorioCaminhao();
					case 6:
						System.out.println("Voltando ao menu principal");
						break;
					default:
						System.out.println("Opção inválida");
						break;

					}

				} while (op2 != 6);
				break;
			}
		} while (op != 3);

		sc.close();
	}

}
