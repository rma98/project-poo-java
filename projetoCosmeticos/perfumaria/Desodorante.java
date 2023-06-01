package perfumaria;

public class Desodorante extends Perfumaria {
	private String tipo;

	public Desodorante(String nome, double preco, String fragrancia, String tipo) {
		super(nome, preco, fragrancia);
		this.tipo = tipo;
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando desodorante " + getNome());
		System.out.println("Fragrância: " + getFragrancia());
		System.out.println("Tipo: " + tipo);
		System.out.println("===========");
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Produto: " + getNome());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Fragrância: " + getFragrancia());
		System.out.println("Tipo: " + tipo);
		System.out.println("Categoria: Perfumaria");
		System.out.println("===========");
	}
	
	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço do desodorante com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
