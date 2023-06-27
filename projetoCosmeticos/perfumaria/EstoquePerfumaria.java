package perfumaria;

import java.util.ArrayList;
import java.util.List;

public class EstoquePerfumaria {
	private List<Desodorante> desodorantes;
	private List<HidratacaoCorporal> hidratacaoCorporais;
	private List<OleoCorporal> oleoCorporais;
	private List<Perfume> perfumes; 

	public EstoquePerfumaria() {
		desodorantes = new ArrayList<>();
		hidratacaoCorporais = new ArrayList<>();
		oleoCorporais = new ArrayList<>();
		perfumes = new ArrayList<>();
	}

	public void adicionarDesodorante(Perfumaria desodorante) {
		desodorantes.add((Desodorante) desodorante);
	}

	public void adicionarHidatracaoCorporal(Perfumaria hidratacaoCorporal) {
		hidratacaoCorporais.add((HidratacaoCorporal) hidratacaoCorporal);
	}

	public void adicionarOleoCorporal(Perfumaria oeloCorporal) {
		oleoCorporais.add((OleoCorporal) oeloCorporal);
	}

	public void adicionarPerfume(Perfumaria perfume) {
		perfumes.add((Perfume) perfume);
	}

	public void atualizarDesodorante(int index, Perfumaria desodoranteAtualizado) {
		if (index >= 0 && index < desodorantes.size()) {
			desodorantes.set(index, (Desodorante) desodoranteAtualizado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarHidratacaoCorporal(int index, Perfumaria hidratacaoCorporalAtualizado) {
		if (index >= 0 && index < hidratacaoCorporais.size()) {
			hidratacaoCorporais.set(index, (HidratacaoCorporal) hidratacaoCorporalAtualizado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarOleoCorporal(int index, Perfumaria oleoCorporalAtualizado) {
		if (index >= 0 && index < oleoCorporais.size()) {
			oleoCorporais.set(index, (OleoCorporal) oleoCorporalAtualizado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void atualizarPerfume(int index, Perfumaria perfumeAtualizado) {
		if (index >= 0 && index < perfumes.size()) {
			perfumes.set(index, (Perfume) perfumeAtualizado);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerDesodorante(int index) {
		if (index >= 0 && index < desodorantes.size()) {
			desodorantes.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerHidratacaoCorporal(int index) {
		if (index >= 0 && index < hidratacaoCorporais.size()) {
			hidratacaoCorporais.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerOleoCorporal(int index) {
		if (index >= 0 && index < oleoCorporais.size()) {
			oleoCorporais.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public void removerPerfume(int index) {
		if (index >= 0 && index < perfumes.size()) {
			perfumes.remove(index);
		} else {
			System.out.println("Índice inválido");
		}
	}

	public Desodorante consultarDesodorante(int index) {
		if (index >= 0 && index < desodorantes.size()) {
			Desodorante desodorante = desodorantes.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + desodorante.getNome());
			System.out.println("Marca: " + desodorante.getMarca());
			System.out.println("Preço: " + desodorante.getPreco());
			System.out.println("Fragrância: " + desodorante.getFragrancia());
			System.out.println("Tipo: " + desodorante.getTipo());
			System.out.println("Categoria: Perfumaria");
			System.out.println("======================");
			return desodorante;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public HidratacaoCorporal consultarHidratacaoCorporal(int index) {
		if (index >= 0 && index < hidratacaoCorporais.size()) {
			HidratacaoCorporal hidratacaoCorporal = hidratacaoCorporais.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + hidratacaoCorporal.getNome());
			System.out.println("Marca: " + hidratacaoCorporal.getMarca());
			System.out.println("Preço: " + hidratacaoCorporal.getPreco());
			System.out.println("Fragrância: " + hidratacaoCorporal.getFragrancia());
			System.out.println("Tipo de pele: " + hidratacaoCorporal.getTipoPele());
			System.out.println("Categoria: Perfumaria");
			System.out.println("======================");
			return hidratacaoCorporal;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public OleoCorporal consultarOleoCorporal(int index) {
		if (index >= 0 && index < oleoCorporais.size()) {
			OleoCorporal oleoCorporal = oleoCorporais.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + oleoCorporal.getNome());
			System.out.println("Marca: " + oleoCorporal.getMarca());
			System.out.println("Preço: " + oleoCorporal.getPreco());
			System.out.println("Fragrância: " + oleoCorporal.getFragrancia());
			System.out.println("Categoria: Perfumaria");
			System.out.println("======================");
			return oleoCorporal;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public Perfume consultarPerfume(int index) {
		if (index >= 0 && index < perfumes.size()) {
			Perfume perfume = perfumes.get(index);
			System.out.println("======================");
			System.out.println("Produto: " + perfume.getNome());
			System.out.println("Marca: " + perfume.getMarca());
			System.out.println("Preço: " + perfume.getPreco());
			System.out.println("Fragrância: " + perfume.getFragrancia());
			System.out.println("Categoria: Perfumaria");
			System.out.println("======================");
			return perfume;
		} else {
			System.out.println("Índice inválido");
			return null;
		}
	}

	public List<Desodorante> getDesodorantes() {
		return desodorantes;
	}

	public void setDesodorantes(List<Desodorante> desodorantes) {
		this.desodorantes = desodorantes;
	}

	public int getQuantidadeDesodorante() {
		return desodorantes.size();
	}

	public List<HidratacaoCorporal> getHidratacaoCorporais() {
		return hidratacaoCorporais;
	}

	public void setHidratacaoCorporais(List<HidratacaoCorporal> hidratacaoCorporais) {
		this.hidratacaoCorporais = hidratacaoCorporais;
	}

	public int getQuantidadeHidratacaoCorporal() {
		return hidratacaoCorporais.size();
	}

	public List<OleoCorporal> getOleoCorporais() {
		return oleoCorporais;
	}

	public void setOleoCorporais(List<OleoCorporal> oleoCorporais) {
		this.oleoCorporais = oleoCorporais;
	}

	public int getQuantidadeOleoCorporal() {
		return oleoCorporais.size();
	}

	public List<Perfume> getPerfumes() {
		return perfumes;
	}

	public void setPerfumes(List<Perfume> perfumes) {
		this.perfumes = perfumes;
	}

	public int getQuantidadePerfume() {
		return perfumes.size();
	}

}
