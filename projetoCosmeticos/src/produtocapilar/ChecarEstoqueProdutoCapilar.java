package produtocapilar;

import java.util.List;

public class ChecarEstoqueProdutoCapilar {
	private List<Condicionador> condicionadores;
	private List<MascaraHidratacao> mascaraHidratacaos;
	private List<Shampoo> shampoos;

	public ChecarEstoqueProdutoCapilar(List<Condicionador> condicionadores, List<MascaraHidratacao> mascaraHidratacaos, List<Shampoo> shampoos) {
		this.condicionadores = condicionadores;
		this.mascaraHidratacaos = mascaraHidratacaos;
		this.shampoos = shampoos;
	}

	public void visualizarEstoque() {
		System.out.println("===== Estoque de Condicionadores =====");
		for (Condicionador condicionador : condicionadores) {
			System.out.println("======================");
			System.out.println("Produto: " + condicionador.getNome());
			System.out.println("Marca: " + condicionador.getMarca());
			System.out.println("Preço: " + condicionador.getPreco());
			System.out.println("Tipo de cabelo: " + condicionador.getTipoCabelo());
			System.out.println("Categoria: Produtos Capilares");
			System.out.println("======================");
		}

		System.out.println("===== Estoque de Máscaras de Hidatração =====");
		for (MascaraHidratacao mascaraHidratacao : mascaraHidratacaos) {
			System.out.println("======================");
			System.out.println("Produto: " + mascaraHidratacao.getNome());
			System.out.println("Marca: " + mascaraHidratacao.getMarca());
			System.out.println("Preço: " + mascaraHidratacao.getPreco());
			System.out.println("Tipo de cabelo: " + mascaraHidratacao.getTipoCabelo());
			System.out.println("Categoria: Produtos Capilares");
			System.out.println("======================");
		}

		System.out.println("===== Estoque de Shampoos =====");
		for (Shampoo shampoo : shampoos) {
			System.out.println("======================");
			System.out.println("Produto: " + shampoo.getNome());
			System.out.println("Marca: " + shampoo.getMarca());
			System.out.println("Preço: " + shampoo.getPreco());
			System.out.println("Tipo de cabelo: " + shampoo.getTipoCabelo());
			System.out.println("Categoria: Produtos Capilares");
			System.out.println("======================");
		}
	}

	public int getNumeroCondicionador() {
		return condicionadores.size();
	}

	public Condicionador getNumeroCondicionadorPorIndice(int indice) {
		return condicionadores.get(indice);
	}

	public int getNumeroMascaraHidatracao() {
		return mascaraHidratacaos.size();
	}

	public MascaraHidratacao getNumeroMascaraHidatracaoPorIndice(int indice) {
		return mascaraHidratacaos.get(indice);
	}

	public int getNumeroShampoo() {
		return shampoos.size();
	}

	public Shampoo getNumeroShampooPorIndice(int indice) {
		return shampoos.get(indice);
	}
	
}
