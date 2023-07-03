package maquiagem;

import java.util.ArrayList;
import java.util.List;

public class EstoqueMaquiagem {
	private List<Base> bases;
	private List<Batom> batons;
	private List<MascaraCilios> mascarasCilios;
	private List<PaletaSombras> paletasSombras;
	private List<Pincel> pinceis;

	public EstoqueMaquiagem() {
		bases = new ArrayList<>();
		batons = new ArrayList<>();
		mascarasCilios = new ArrayList<>();
		paletasSombras = new ArrayList<>();
		pinceis = new ArrayList<>();
	}

	// Métodos de adição de produtos

	public void adicionarBase(Maquiagem base) {
		bases.add((Base) base);
	}

	public void adicionarBatom(Maquiagem batom) {
		batons.add((Batom) batom);
	}

	public void adicionarMascaraCilios(Maquiagem mascaraCilios) {
		mascarasCilios.add((MascaraCilios) mascaraCilios);
	}

	public void adicionarPaletaSombras(Maquiagem paletaSombras) {
		paletasSombras.add((PaletaSombras) paletaSombras);
	}

	public void adicionarPincel(Maquiagem pincel) {
		pinceis.add((Pincel) pincel);
	}

	// Métodos de atualização de produtos

	public void atualizarBase(int index, Maquiagem baseAtualizado) {
		if (index >= 0 && index < bases.size()) {
			bases.set(index, (Base) baseAtualizado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarBatom(int index, Maquiagem batomAtualizado) {
		if (index >= 0 && index < batons.size()) {
			batons.set(index, (Batom) batomAtualizado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarMascaraCilios(int index, Maquiagem mascaraCilios) {
		if (index >= 0 && index < mascarasCilios.size()) {
			mascarasCilios.set(index, (MascaraCilios) mascaraCilios);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarPaletaSombras(int index, Maquiagem paletaSombras) {
		if (index >= 0 && index < paletasSombras.size()) {
			paletasSombras.set(index, (PaletaSombras) paletaSombras);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarPincel(int index, Maquiagem pincel) {
		if (index >= 0 && index < pinceis.size()) {
			pinceis.set(index, (Pincel) pincel);
		} else {
			System.out.println("Índice inválido");
		}
	}

	// Métodos de remoção de produtos

	public void removerBase(int index) {
		if (index >= 0 && index < bases.size()) {
			bases.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerBatom(int index) {
		if (index >= 0 && index < batons.size()) {
			batons.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerMascaraCilios(int index) {
		if (index >= 0 && index < mascarasCilios.size()) {
			mascarasCilios.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerPaletaSombras(int index) {
		if (index >= 0 && index < paletasSombras.size()) {
			paletasSombras.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerPinceis(int index) {
		if (index >= 0 && index < pinceis.size()) {
			pinceis.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	// Métodos de consulta de produtos

	public Base consultarBase(int index) {
		if (index >= 0 && index < bases.size()) {
			Base base = bases.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + base.getNome());
			System.out.println("Marca: " + base.getMarca());
			System.out.println("Preço: R$" + base.getPreco());
			System.out.println("Cor: " + base.getCor());
			System.out.println("Tipo da Base: " + base.getTipoBase());
			System.out.println("Categoria: Maquiagem");
			System.out.println("======================");
			return base;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public Batom consultarBatom(int index) {
		if (index >= 0 && index < batons.size()) {
			Batom batom = batons.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + batom.getNome());
			System.out.println("Marca: " + batom.getMarca());
			System.out.println("Preço: " + batom.getPreco());
			System.out.println("Cor: " + batom.getCor());
			System.out.println("Tipo do batom: " + batom.getTipoBatom());
			System.out.println("Categoria: Maquiagem");
			System.out.println("======================");
			return batom;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public MascaraCilios consultarMascaraCilios(int index) {
		if (index >= 0 && index < mascarasCilios.size()) {
			MascaraCilios mascaraCilios = mascarasCilios.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + mascaraCilios.getNome());
			System.out.println("Marca: " + mascaraCilios.getMarca());
			System.out.println("Preço: " + mascaraCilios.getPreco());
			System.out.println("Cor: " + mascaraCilios.getCor());
			System.out.println("Tipo da Máscara de Cílios: " + mascaraCilios.getTipoMascaraCilios());
			System.out.println("Categoria: Maquiagem");
			System.out.println("======================");
			return mascaraCilios;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public PaletaSombras consultarPaletaSombras(int index) {
		if (index >= 0 && index < paletasSombras.size()) {
			PaletaSombras paletaSombras = paletasSombras.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + paletaSombras.getNome());
			System.out.println("Marca: " + paletaSombras.getMarca());
			System.out.println("Preço: " + paletaSombras.getPreco());
			System.out.println("Cor: " + paletaSombras.getCor());
			System.out.println("Número de cores: " + paletaSombras.getNumeroCores());
			return paletaSombras;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public Pincel consultarPincel(int index) {
		if (index >= 0 && index < pinceis.size()) {
			Pincel pincel = pinceis.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + pincel.getNome());
			System.out.println("Marca: " + pincel.getMarca());
			System.out.println("Preço: " + pincel.getPreco());
			System.out.println("Cor: " + pincel.getCor());
			System.out.println("Tamanho do pincel: " + pincel.getTamanho());
			return pincel;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public List<Base> getBases() {
		return bases;
	}

	public void setBases(List<Base> bases) {
		this.bases = bases;
	}
	
	public int getQuantidadeBases() {
	    return bases.size();
	}

	public List<Batom> getBatons() {
		return batons;
	}

	public void setBatons(List<Batom> batons) {
		this.batons = batons;
	}
	
	public int getQuantidadeBatons() {
		return batons.size();
	}

	public List<MascaraCilios> getMascarasCilios() {
		return mascarasCilios;
	}

	public void setMascarasCilios(List<MascaraCilios> mascarasCilios) {
		this.mascarasCilios = mascarasCilios;
	}
	
	public int getQuantidadeMascaraCilios() {
		return mascarasCilios.size();
	}

	public List<PaletaSombras> getPaletasSombras() {
		return paletasSombras;
	}

	public void setPaletasSombras(List<PaletaSombras> paletasSombras) {
		this.paletasSombras = paletasSombras;
	}
	
	public int getQuantidadePaletaSombras() {
		return paletasSombras.size();
	}

	public List<Pincel> getPinceis() {
		return pinceis;
	}

	public void setPincels(List<Pincel> pinceis) {
		this.pinceis = pinceis;
	}
	
	public int getQuantidadePincels() {
		return pinceis.size();
	}

}
