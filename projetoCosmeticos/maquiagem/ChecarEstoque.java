package maquiagem;

import java.util.List;

public class ChecarEstoque {
	private List<Base> bases;

	public ChecarEstoque(List<Base> bases) {
		this.bases = bases;
	}

	public void visualizarEstoque() {
		System.out.println("===== Estoque de Bases =====");
		for (Base base : bases) {
			System.out.println("Produto: " + base.getNome());
			System.out.println("Marca: " + base.getMarca());
			System.out.println("Preço: R$" + base.getPreco());
			System.out.println("Cor: " + base.getCor());
			System.out.println("Tipo da Base: " + base.getTipoBase());
			System.out.println("Categoria: Maquiagem");
			System.out.println("===========");
		}

	}
	
	public int getNumeroBases() {
	    return bases.size();
	}

	public Base getBasePorIndice(int indice) {
	    return bases.get(indice);
	}

}
