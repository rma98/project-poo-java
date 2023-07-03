package perfumaria;

public class Perfume extends Perfumaria {

	public Perfume(String nome, String marca, double preco, String fragrancia) {
		super(nome, marca, preco, fragrancia);
	}
	
	public Perfume() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço do perfume com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("======================");
		System.out.println("Aplicando perfume: " + getNome());
		System.out.println("======================");
	}
	
	public String getNome() {
		return super.getNome();
	}

}
