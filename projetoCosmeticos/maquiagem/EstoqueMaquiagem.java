package maquiagem;

import java.util.ArrayList;
import java.util.List;

public class EstoqueMaquiagem {
	private List<Base> bases;
	private List<Batom> batons;
	private List<MascaraCilios> mascarasCilios;
	private List<PaletaSombras> paletasSombras;
	private List<Pincel> pincels;

	public EstoqueMaquiagem() {
		bases = new ArrayList<>();
		batons = new ArrayList<>();
		mascarasCilios = new ArrayList<>();
		paletasSombras = new ArrayList<>();
		pincels = new ArrayList<>();
	}

	// Métodos de adição de produtos

	public void adicionarBase(Base base) {
		bases.add(base);
	}

	public void adicionarBatom(Batom batom) {
		batons.add(batom);
	}

	public void adicionarMascaraCilios(MascaraCilios mascaraCilios) {
		mascarasCilios.add(mascaraCilios);
	}

	public void adicionarPaletaSombras(PaletaSombras paletaSombras) {
		paletasSombras.add(paletaSombras);
	}

	public void adicionarPincel(Pincel pincel) {
		pincels.add(pincel);
	}

	// Métodos de atualização de produtos

	public void atualizarBase(int index, Base base) {
		if (index >= 0 && index < bases.size()) {
			bases.set(index, base);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarBatom(int index, Batom batom) {
		if (index >= 0 && index < batons.size()) {
			batons.set(index, batom);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarMascaraCilios(int index, MascaraCilios mascaraCilios) {
		if (index >= 0 && index < mascarasCilios.size()) {
			mascarasCilios.set(index, mascaraCilios);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarPaletaSombras(int index, PaletaSombras paletaSombras) {
		if (index >= 0 && index < paletasSombras.size()) {
			paletasSombras.set(index, paletaSombras);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarPincel(int index, Pincel pincel) {
		if (index >= 0 && index < pincels.size()) {
			pincels.set(index, pincel);
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

	public void removerPincels(int index) {
		if (index >= 0 && index < pincels.size()) {
			pincels.remove(index);
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
			return batons.get(index);
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public MascaraCilios consultarMascaraCilios(int index) {
		if (index >= 0 && index < mascarasCilios.size()) {
			return mascarasCilios.get(index);
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public PaletaSombras consultarPaletaSombras(int index) {
		if (index >= 0 && index < paletasSombras.size()) {
			return paletasSombras.get(index);
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public Pincel consultarPincel(int index) {
		if (index >= 0 && index < pincels.size()) {
			return pincels.get(index);
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

	public List<Batom> getBatons() {
		return batons;
	}

	public void setBatons(List<Batom> batons) {
		this.batons = batons;
	}

	public List<MascaraCilios> getMascarasCilios() {
		return mascarasCilios;
	}

	public void setMascarasCilios(List<MascaraCilios> mascarasCilios) {
		this.mascarasCilios = mascarasCilios;
	}

	public List<PaletaSombras> getPaletasSombras() {
		return paletasSombras;
	}

	public void setPaletasSombras(List<PaletaSombras> paletasSombras) {
		this.paletasSombras = paletasSombras;
	}

	public List<Pincel> getPincels() {
		return pincels;
	}

	public void setPincels(List<Pincel> pincels) {
		this.pincels = pincels;
	}

}
