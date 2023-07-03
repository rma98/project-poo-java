package perfumaria;

import java.util.List;

public class ChecarEstoquePerfumaria {
	private List<Desodorante> desodorantes;
	private List<HidratacaoCorporal> hidratacaoCorporais;
	private List<OleoCorporal> oleoCorporais;
	private List<Perfume> perfumes;

	public ChecarEstoquePerfumaria(List<Desodorante> desodorantes, List<HidratacaoCorporal> hidratacaoCorporais, List<OleoCorporal> oleoCorporais, List<Perfume> perfumes) {
		this.desodorantes = desodorantes;
		this.hidratacaoCorporais = hidratacaoCorporais;
		this.oleoCorporais = oleoCorporais;
		this.perfumes = perfumes;
	}

	public void visualizarEstoque() {
		System.out.println("===== Estoque de Desodorantes =====");
		for (Desodorante desodorante : desodorantes) {
			System.out.println("======================");
			System.out.println("Produto: " + desodorante.getNome());
			System.out.println("Marca: " + desodorante.getMarca());
			System.out.println("Preço: " + desodorante.getPreco());
			System.out.println("Fragrância: " + desodorante.getFragrancia());
			System.out.println("Tipo: " + desodorante.getTipo());
			System.out.println("Categoria: Perfumaria");
			System.out.println("======================");
		}
		System.out.println("===== Estoque de Hidratações Corporais =====");
		for (HidratacaoCorporal hidratacaoCorporal : hidratacaoCorporais) {
			System.out.println("======================");
			System.out.println("Produto: " + hidratacaoCorporal.getNome());
			System.out.println("Marca: " + hidratacaoCorporal.getMarca());
			System.out.println("Preço: " + hidratacaoCorporal.getPreco());
			System.out.println("Fragrância: " + hidratacaoCorporal.getFragrancia());
			System.out.println("Tipo de pele: " + hidratacaoCorporal.getTipoPele());
			System.out.println("Categoria: Perfumaria");
			System.out.println("======================");
		}
		System.out.println("===== Estoque de Óleos Corporais =====");
		for (OleoCorporal oleoCorporal : oleoCorporais) {
			System.out.println("======================");
			System.out.println("Produto: " + oleoCorporal.getNome());
			System.out.println("Marca: " + oleoCorporal.getMarca());
			System.out.println("Preço: " + oleoCorporal.getPreco());
			System.out.println("Fragrância: " + oleoCorporal.getFragrancia());
			System.out.println("Categoria: Perfumaria");
			System.out.println("======================");
		}
		System.out.println("===== Estoque de Perfumes =====");
		for (Perfume perfume : perfumes) {
			System.out.println("======================");
			System.out.println("Produto: " + perfume.getNome());
			System.out.println("Marca: " + perfume.getMarca());
			System.out.println("Preço: " + perfume.getPreco());
			System.out.println("Fragrância: " + perfume.getFragrancia());
			System.out.println("Categoria: Perfumaria");
			System.out.println("======================");
		}
	}

	public int getNumeroDesodorante() {
		return desodorantes.size();
	}

	public Desodorante getNumeroDesodorantePorIndice(int indice) {
		return desodorantes.get(indice);
	}

	public int getNumeroHidratacaoCorporal() {
		return hidratacaoCorporais.size();
	}

	public HidratacaoCorporal getNumeroHidatracaoCorporalPorIndice(int indice) {
		return hidratacaoCorporais.get(indice);
	}

	public int getNumeroOleoCorporal() {
		return oleoCorporais.size();
	}

	public OleoCorporal getNumeroOleoCorporalPorIndice(int indice) {
		return oleoCorporais.get(indice);
	}

	public int getNumeroPerfume() {
		return perfumes.size();
	}

	public Perfume getNumeroPerfumePorIndice(int indice) {
		return perfumes.get(indice);
	}

}
