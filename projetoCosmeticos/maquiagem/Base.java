package maquiagem;

public class Base extends Maquiagem {
	private String cobertura;

	public Base(String nome, double preco, String cor, String cobertura) {
		super(nome, preco, cor);
		this.cobertura = cobertura;
	}
	
	public Base() {
		
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando base " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Cobertura: " + cobertura);
		System.out.println("===========");
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Produto: " + getNome());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Cor: " + getCor());
		System.out.println("Cobertura: " + cobertura);
		System.out.println("Categoria: Maquiagem");
		System.out.println("===========");
	}
	
	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço da base com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

}
