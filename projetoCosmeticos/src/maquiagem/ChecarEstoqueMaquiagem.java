package maquiagem;

import java.util.List;

public class ChecarEstoqueMaquiagem {
	private List<Base> bases;
	private List<Batom> batons;
	private List<MascaraCilios> mascarasCilios;
	private List<PaletaSombras> paletasSombras;
	private List<Pincel> pinceis;


	public ChecarEstoqueMaquiagem(List<Base> bases, List<Batom> batons, List<MascaraCilios> mascarasCilios, List<PaletaSombras> paletasSombras, List<Pincel> pinceis) {
		this.bases = bases;
		this.batons = batons;
		this.mascarasCilios = mascarasCilios;
		this.paletasSombras = paletasSombras;
		this.pinceis = pinceis;
	}

	public void visualizarEstoque() {
		System.out.println("===== Estoque de Bases =====");
		for (Base base : bases) {
			System.out.println("======================");
			System.out.println("Produto: " + base.getNome());
			System.out.println("Marca: " + base.getMarca());
			System.out.println("Preço: R$" + base.getPreco());
			System.out.println("Cor: " + base.getCor());
			System.out.println("Tipo da Base: " + base.getTipoBase());
			System.out.println("Categoria: Maquiagem");
			System.out.println("======================");
		}

		System.out.println("===== Estoque de Batons =====");
		for (Batom batom : batons) {
			System.out.println("======================");
			System.out.println("Produto: " + batom.getNome());
			System.out.println("Marca: " + batom.getMarca());
			System.out.println("Preço: " + batom.getPreco());
			System.out.println("Cor: " + batom.getCor());
			System.out.println("Tipo do batom: " + batom.getTipoBatom());
			System.out.println("Categoria: Maquiagem");
			System.out.println("======================");
		}

		System.out.println("===== Estoque de Máscara de Cílios =====");
		for (MascaraCilios mascaraCilios : mascarasCilios) {
			System.out.println("======================");
			System.out.println("Produto: " + mascaraCilios.getNome());
			System.out.println("Marca: " + mascaraCilios.getMarca());
			System.out.println("Preço: " + mascaraCilios.getPreco());
			System.out.println("Cor: " + mascaraCilios.getCor());
			System.out.println("Tipo da Máscara de Cílios: " + mascaraCilios.getTipoMascaraCilios());
			System.out.println("Categoria: Maquiagem");
			System.out.println("======================");
		}

		System.out.println("===== Estoque de Paleta de Sombras =====");
		for (PaletaSombras paletaSombras : paletasSombras) {
			System.out.println("======================");
			System.out.println("Produto: " + paletaSombras.getNome());
			System.out.println("Marca: " + paletaSombras.getMarca());
			System.out.println("Preço: " + paletaSombras.getPreco());
			System.out.println("Cor: " + paletaSombras.getCor());
			System.out.println("Número de cores: " + paletaSombras.getNumeroCores());
		}

		System.out.println("===== Estoque de Pinceis =====");
		for (Pincel pincel : pinceis) {
			System.out.println("======================");
			System.out.println("Produto: " + pincel.getNome());
			System.out.println("Marca: " + pincel.getMarca());
			System.out.println("Preço: " + pincel.getPreco());
			System.out.println("Cor: " + pincel.getCor());
			System.out.println("Tamanho do pincel: " + pincel.getTamanho());
		}
	}

	public int getNumeroBases() {
		return bases.size();
	}

	public Base getBasePorIndice(int indice) {
		return bases.get(indice);
	}

	public int getNumeroBatons() {
		return batons.size();
	}

	public Batom getBatomPorIndice(int indice) {
		return batons.get(indice);
	}

	public int getNumeroMascarasCilios() {
		return mascarasCilios.size();
	}

	public MascaraCilios getMascaraCiliosPorIndice(int indice) {
		return mascarasCilios.get(indice);
	}

	public int getNumeroPaletasSombras() {
		return paletasSombras.size();
	}

	public PaletaSombras getPaletaSombrasPorIndice(int indice) {
		return paletasSombras.get(indice);
	}

	public int getNumeroPinceis() {
		return pinceis.size();
	}

	public Pincel getNumeroPincelPorIndice(int indice) {
		return pinceis.get(indice);
	}

}
