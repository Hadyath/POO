package ex1l3;

import java.util.Scanner;
import java.util.ArrayList;

public class Fichariocaminhao {

	Scanner sc = new Scanner(System.in);
	ArrayList<Caminhao> caminhoes;

	public Fichariocaminhao(ArrayList<Caminhao> caminhoes) {
		this.caminhoes = caminhoes;
	}

	public void incluirCaminhao() {

		System.out.println("Criando Caminhão");
		Caminhao caminhao = new Caminhao();
		lerDados(caminhao);
		caminhoes.add(caminhao);

		System.out.println("Cadastro completo !");
		
	}

	public void alterarCaminhao() {
		int pos = 0;
		System.out.println("Digite a posição do caminhão que deseja alterar");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaCaminhao(pos)) {
			lerDados(caminhoes.get(pos));
			System.out.println("Caminhão alterado com sucesso!");

		}

	}

	public void excluirCaminhao() {
		int pos = 0;
		System.out.println("Digite a posição que deseja excluir");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaCaminhao(pos)) {
			caminhoes.remove(pos);

			System.out.println("Caminhão excluido com sucesso !");

		}
	}

	public void consultarCaminhao() {
		int pos = 0;
		System.out.println("Digite a posição do caminhão que deseja consultar");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaCaminhao(pos)) {
			imprimeCaminhao(caminhoes.get(pos));

		}

	}

	public void relatorioCaminhao() {
		
		if(caminhoes.isEmpty()) {
			System.out.println("Não há caminhões cadastrados");
		}else
			for(Caminhao caminhao : caminhoes) {
				System.out.println("---------------------");
				System.out.println("Posição #" + caminhoes.indexOf(caminhao));
				imprimeCaminhao(caminhao);
			}
		System.out.println("--------------------------");
		

	}

	public void imprimeCaminhao(Caminhao caminhao) {

		System.out.println("marca do caminhão :" + caminhao.getMarca());

		System.out.println("modelo do caminhão :" + caminhao.getModelo());

		System.out.println("ano de fabricação do caminhão :" + caminhao.getAnoFabricacao());

		System.out.println("ano do modelo :" + caminhao.getAnoModelo());

		System.out.println("preço do caminhão :" + caminhao.getPreco());

		System.out.println("capacidade de carga do caminhão :" + caminhao.getCapacidadeDeCarga());

	}

	public void lerDados(Caminhao caminhao) {

		System.out.println("Digite a marca do caminhão");
		caminhao.setMarca(sc.nextLine());
		System.out.println("Digite o modelo do caminhão");
		caminhao.setModelo(sc.nextLine());
		System.out.println("Digite o ano de fabricação do caminhão");
		caminhao.setAnoFabricacao(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite o ano do modelo");
		caminhao.setAnoModelo(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite o preço do caminhão");
		caminhao.setPreco(Float.parseFloat(sc.nextLine()));
		System.out.println("Digite a capacidade de carga do caminhão");
		caminhao.setCapacidadeDeCarga(Integer.parseInt(sc.nextLine()));

	}

	public boolean verificaCaminhao(int pos) {
		if (caminhoes.isEmpty()) {
			System.out.println("Não há caminhão cadastrado");
			return false;
		}
		if (pos < 0 || pos >= caminhoes.size()) {
			System.out.println("Posição inválida");
			return false;
		}

		return true;

	}

}
