package produtocapilar;

import java.util.ArrayList;
import java.util.List;

public class EstoqueProdutoCapilar {
	private List<Condicionador> condicionadores;
	private List<MascaraHidratacao> mascaraHidratacaos;
	private List<Shampoo> shampoos;

	public EstoqueProdutoCapilar() {
		condicionadores = new ArrayList<>();
		mascaraHidratacaos = new ArrayList<>();
		shampoos = new ArrayList<>();
	}

	public void adicionarCondicionador(ProdutoCapilar condicionador) {
		condicionadores.add((Condicionador) condicionador);
	}

	public void adicionarMascaraHidatracao(ProdutoCapilar mascaraHidratacao) {
		mascaraHidratacaos.add((MascaraHidratacao) mascaraHidratacao);
	}

	public void adicionarShampoo(ProdutoCapilar shampoo) {
		shampoos.add((Shampoo) shampoo);
	}

	public void atualizarCondicionador(int index, ProdutoCapilar condicionadorAtualziado) {
		if (index >= 0 && index < condicionadores.size()) {
			condicionadores.set(index, (Condicionador) condicionadorAtualziado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarMascaraHidatracao(int index, ProdutoCapilar mascaraHidratacaoAtualizado) {
		if (index >= 0 && index < mascaraHidratacaos.size()) {
			mascaraHidratacaos.set(index, (MascaraHidratacao) mascaraHidratacaoAtualizado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarShampoo(int index, ProdutoCapilar shampooAtualizado) {
		if (index >= 0 && index < shampoos.size()) {
			shampoos.set(index, (Shampoo) shampooAtualizado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerCondicionador(int index) {
		if (index >= 0 && index < condicionadores.size()) {
			condicionadores.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerMascaraHidatracao(int index) {
		if (index >= 0 && index < mascaraHidratacaos.size()) {
			mascaraHidratacaos.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerShampoo(int index) {
		if (index >= 0 && index < shampoos.size()) {
			shampoos.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public Condicionador consultarCondicionador(int index) {
		if (index >= 0 && index < condicionadores.size()) {
			Condicionador condicionador = condicionadores.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + condicionador.getNome());
			System.out.println("Marca: " + condicionador.getMarca());
			System.out.println("Preço: " + condicionador.getPreco());
			System.out.println("Tipo de cabelo: " + condicionador.getTipoCabelo());
			System.out.println("Categoria: Produtos Capilares");
			System.out.println("======================");
			return condicionador;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public MascaraHidratacao consultarMascaHidatracao(int index) {
		if (index >= 0 && index < mascaraHidratacaos.size()) {
			MascaraHidratacao mascaraHidratacao = mascaraHidratacaos.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + mascaraHidratacao.getNome());
			System.out.println("Marca: " + mascaraHidratacao.getMarca());
			System.out.println("Preço: " + mascaraHidratacao.getPreco());
			System.out.println("Tipo de cabelo: " + mascaraHidratacao.getTipoCabelo());
			System.out.println("Categoria: Produtos Capilares");
			System.out.println("======================");
			return mascaraHidratacao;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public Shampoo consultarShampoo(int index) {
		if (index >= 0 && index < shampoos.size()) {
			Shampoo shampoo = shampoos.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + shampoo.getNome());
			System.out.println("Marca: " + shampoo.getMarca());
			System.out.println("Preço: " + shampoo.getPreco());
			System.out.println("Tipo de cabelo: " + shampoo.getTipoCabelo());
			System.out.println("Categoria: Produtos Capilares");
			System.out.println("======================");
			return shampoo;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public List<Condicionador> getCondicionadores() {
		return condicionadores;
	}

	public void setCondicionadores(List<Condicionador> condicionadores) {
		this.condicionadores = condicionadores;
	}
	
	public int getQuantidadeCondicionador() {
		return condicionadores.size();
	}

	public List<MascaraHidratacao> getMascaraHidratacaos() {
		return mascaraHidratacaos;
	}

	public void setMascaraHidratacaos(List<MascaraHidratacao> mascaraHidratacaos) {
		this.mascaraHidratacaos = mascaraHidratacaos;
	}
	
	public int getQuantidadeMascaraHidatracao() {
		return mascaraHidratacaos.size();
	}

	public List<Shampoo> getShampoos() {
		return shampoos;
	}

	public void setShampoos(List<Shampoo> shampoos) {
		this.shampoos = shampoos;
	}
	
	public int getQuantidadeShampo() {
		return shampoos.size();
	}

}
