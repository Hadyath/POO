package trabalho;

import java.util.Scanner;
import java.util.ArrayList;

public class ficharioIngresso {
	Scanner sc = new Scanner(System.in);
	ArrayList<Ingresso> ingressos;

	public ficharioIngresso(ArrayList<Ingresso> ingressos) {
		this.ingressos = ingressos;

	}

	public void incluirIngresso() {
		System.out.println("Cadastrando ingresso");
		Ingresso ingresso = new Ingresso();
		lerDados(ingresso);
		ingressos.add(ingresso);
		System.out.println("Cadastro de ingresso completo");

	}

	public void alterarIngresso() {
		int pos;
		System.out.println("Digite a posição do ingresso que deseja alterar");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaIngresso(pos)) {
			lerDados(ingressos.get(pos));
			System.out.println("Ingresso alterado com sucesso");

		}
	}

	public void excluirIngresso() {

		int pos;
		System.out.println("Digite a posição do ingresso que deseja excluir");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaIngresso(pos)) {
			ingressos.remove(pos);
			System.out.println("Ingresso removido com sucesso");
		}
	}

	public void relatorioIngresso() {
		if (ingressos.isEmpty()) {
			System.out.println("Não há ingressos cadastrados");

		} else {
			for (Ingresso ingresso : ingressos) {
				System.out.println("----------------------");
				System.out.println("Posição #" + ingressos.indexOf(ingresso));
				imprimeIngresso(ingresso);

			}
		}
	}

	public void imprimeIngresso(Ingresso ingresso) {
		System.out.println("Evento :");
		ingresso.iseVip();
		System.out.println("Forma de pagamento: "+ ingresso.getFormaDePagamento());
		System.out.println("Nome do cliente: "+ ingresso.getNomeCliente());

	}

	public void consultarIngresso() {
		int pos = 0;
		System.out.println("Digite a posição do ingresso que deseja consultar");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaIngresso(pos)) {
			imprimeIngresso(ingressos.get(pos));

		}
	}

	public void lerDados(Ingresso ingresso) {
		int op;

		System.out.println("O cliente é vip? 1 - Sim | 2 - Não");
		op = Integer.parseInt(sc.nextLine());
		if (op == 1) {
			ingresso.seteVip(true);
		} else
			ingresso.seteVip(false);
		System.out.println("Digite a forma de pagamento");
		ingresso.setFormaDePagamento(sc.nextLine());
		System.out.println("Digite o nome do cliente");
		ingresso.setNomeCliente(sc.nextLine());

	}

	public boolean verificaIngresso(int pos) {

		if (ingressos.isEmpty()) {
			System.out.println("Não há ingressos cadastrados");
			return false;
		}
		if (pos < 0 || pos >= ingressos.size()) {
			System.out.println("Posição inválida");
			return false;
		}
		return true;

	}

}
