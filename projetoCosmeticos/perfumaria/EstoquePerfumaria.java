package perfumaria;

import java.util.ArrayList;
import java.util.List;

public class EstoquePerfumaria {
	private List<Desodorante> desodorantes;
	private List<HidatracaoCorporal> hidatracaoCorporais;
	private List<OleoCorporal> oleoCorporais;
	private List<Perfume> perfumes; 
	
	public EstoquePerfumaria() {
		desodorantes = new ArrayList<>();
		hidatracaoCorporais = new ArrayList<>();
		oleoCorporais = new ArrayList<>();
		perfumes = new ArrayList<>();
	}
	
	public void adicionarDesodorante(Desodorante desodorante) {
		desodorantes.add(desodorante);
	}
	
	public void adicionarHidatracaoCorporal(HidatracaoCorporal hidatracaoCorporal) {
		hidatracaoCorporais.add(hidatracaoCorporal);
	}
	
	public void adicionarOleoCorporal(OleoCorporal oeloCorporal) {
		oleoCorporais.add(oeloCorporal);
	}
	
	public void adicionarPerfume(Perfume perfume) {
		perfumes.add(perfume);
	}
	
	public void atualizarDesodorante(int index, Desodorante desodorante) {
		if (index >= 0 && index < desodorantes.size()) {
			desodorantes.set(index, desodorante);
		} else {
			System.out.println("Índice inválido");
		}
	}
	
	public void atualizarHidatracaoCorporal(int index, HidatracaoCorporal hidatracaoCorporal) {
		if (index >= 0 && index < hidatracaoCorporais.size()) {
			hidatracaoCorporais.set(index, hidatracaoCorporal);
		} else {
			System.out.println("Índice inválido");
		}
	}
	
	public void atualizarOleoCorporal(int index, OleoCorporal oleoCorporal) {
		if (index >= 0 && index < oleoCorporais.size()) {
			oleoCorporais.set(index, oleoCorporal);
		} else {
			System.out.println("Índice inválido");
		}
	}
	
	public void atualizarPerfume(int index, Perfume perfume) {
		if (index >= 0 && index < perfumes.size()) {
			perfumes.set(index, perfume);
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
	
	public void removerHidatracaoCorporal(int index) {
		if (index >= 0 && index < hidatracaoCorporais.size()) {
			hidatracaoCorporais.remove(index);
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
			System.err.println("Índice inválido");
			return null;
		}
	}
}
