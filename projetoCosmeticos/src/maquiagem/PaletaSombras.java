package maquiagem;

public class PaletaSombras extends Maquiagem {
	private int numeroCores;

	public PaletaSombras(String nome, String marca, double preco, String cor, int numeroCores) {
		super(nome, marca, preco, cor);
		this.numeroCores = numeroCores;
	}

	public PaletaSombras() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço da Paleta de Sombras com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando sombra: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Número de cores: " + numeroCores);
		System.out.println("===========");
	}

	public int getNumeroCores() {
		return numeroCores;
	}

	public void setNumeroCores(int numeroCores) {
		this.numeroCores = numeroCores;
	}
	
	public String getNome() {
		return super.getNome();
	}

}
