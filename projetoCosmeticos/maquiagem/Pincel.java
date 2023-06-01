package maquiagem;

public class Pincel extends Maquiagem {
	private int tamanho;

	public Pincel(String nome, double preco, String cor, int tamanho) {
		super(nome, preco, cor);
		this.tamanho = tamanho;
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando maquiagem com o pincel: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tamanho: " + tamanho);
		System.out.println("===========");
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Produto: " + getNome());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Cor: " + getCor());
		System.out.println("Tamanho: " + getTamanho());
		System.out.println("Categoria: Maquiagem");
		System.out.println("===========");
	}
	
	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço do pincel com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
