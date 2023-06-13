package perfumaria;

public class Desodorante extends Perfumaria {
	private String tipo;

	public Desodorante(String nome, String marca, double preco, String fragrancia, String tipo) {
		super(nome, marca, preco, fragrancia);
		this.tipo = tipo;
	}
	
	public Desodorante() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço do desodorante com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("======================");
		System.out.println("Aplicando desodorante: " + getNome());
		System.out.println("Tipo: " + tipo);
		System.out.println("======================");
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return super.getNome();
	}

}
