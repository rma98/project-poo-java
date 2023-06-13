package maquiagem;

public class Pincel extends Maquiagem {
	private String tamanho;

	public Pincel(String nome, String marca, double preco, String cor, String tamanho) {
		super(nome, marca, preco, cor);
		this.tamanho = tamanho;
	}

	public Pincel() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço da Pincel com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando maquiagem com o pincel: " + getNome());
		System.out.println("Cor: " + getCor());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("===========");
	}
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getNome() {
		return super.getNome();
	}

}
