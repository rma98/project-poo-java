package maquiagem;

public class Pincel extends Maquiagem {
	private int tamanho;

	public Pincel(String nome, String marca, double preco, String cor, int tamanho) {
		super(nome, marca, preco, cor);
		this.tamanho = tamanho;
	}

	@Override
	public void exibirInformacoes() {
		 System.out.println("Produto: " + getNome());
	        System.out.println("Preço: R$" + getPreco());
	        System.out.println("Cor: " + getCor());
	        System.out.println("Tamanho: " + tamanho);
	        System.out.println("Categoria: Maquiagem");
	        System.out.println("===========");
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço da Pincel com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando maquiagem com o pincel: " + getCor());
		System.out.println("Cor: " + getCor());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("===========");
	}

}
