package ex1l3;

import java.util.Scanner;
import java.util.ArrayList;

public class Fichariocarro {

	Scanner sc = new Scanner(System.in);
	ArrayList<Carro> carros;

	public Fichariocarro(ArrayList<Carro> carros) {
		this.carros = carros;
	}

	public void incluirCarro() {
		System.out.println("Cadastrando carro");
		Carro carro = new Carro();
		lerDados(carro);
		carros.add(carro);

		System.out.println("Carro cadastrado com sucesso!");

	}

	public void alterarCarro() {
		int pos = 0;
		System.out.println("Digite a posição do carro que deseja alterar");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaCarro(pos)) {
			lerDados(carros.get(pos));
			System.out.println("Carro alterado com sucesso");
		}
	}

	public void excluirCarro() {
		int pos = 0;
		System.out.println("Digite a posição do carro que deseja excluir");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaCarro(pos)) {
			carros.remove(pos);
			System.out.println("Carro excluido com sucesso!");
		}

	}

	public void consultarCarro() {
		int pos = 0;
		System.out.println("Digite a posição do carro que deseja consultar");
		pos = Integer.parseInt(sc.nextLine());
		if (verificaCarro(pos)) {
			imprime(carros.get(pos));
		}

	}

	public void imprime(Carro carro) {

		System.out.println("Marca: " + carro.getMarca());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano de fabricação: " + carro.getAnoFabricacao());
		System.out.println("Ano do modelo: " + carro.getAnoModelo());
		System.out.println("Preço: " + carro.getPreco());
		System.out.println("Quantidade de portas: " + carro.getQuantidadePortas());

	}
	
	public void relatorioCarro() {
		if(carros.isEmpty()) {
			System.out.println("Não há carros cadastrados");
		}
		for(Carro carro : carros) {
			System.out.println("------------------------------");
			System.out.println("Posição #"+ carros.indexOf(carro));
			imprime(carro);
		}
		
	}

	public void lerDados(Carro carro) {

		System.out.println("Digite a marca do carro");
		carro.setMarca(sc.nextLine());
		System.out.println("Digite o modelo do carro");
		carro.setModelo(sc.nextLine());
		System.out.println("Digite o ano de fabricação do carro");
		carro.setAnoFabricacao(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite o ano do modelo ");
		carro.setAnoModelo(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite o preço do carro");
		carro.setPreco(Float.parseFloat(sc.nextLine()));
		System.out.println("Digite a quantidade de portas do carro");
		carro.setQuantidadePortas(Integer.parseInt(sc.nextLine()));

	}

	public boolean verificaCarro(int pos) {
		if (carros.isEmpty()) {
			System.out.println("Não há carros cadastrados");
			return false;
		}
		if (pos < 0 || pos >= carros.size()) {
			System.out.println("Posição inválida");
		}

		return true;
	}
}
