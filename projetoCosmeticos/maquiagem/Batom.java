package maquiagem;

public class Batom extends Maquiagem {
	private String acabamento;

	public Batom(String nome, double preco, String cor, String acabamento) {
		super(nome, preco, cor);
		this.acabamento = acabamento;
	}
	
	public Batom() {
		
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando batom " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Acabamento: " + acabamento);
		System.out.println("===========");
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Produto: " + getNome());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Cor: " + getCor());
		System.out.println("Acabamento: " + acabamento);
		System.out.println("Categoria: Maquiagem");
		System.out.println("===========");
	}
	
	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço do batom com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getAcabamento() {
		return acabamento;
	}

	public void setAcabamento(String acabamento) {
		this.acabamento = acabamento;
	}
	
}
