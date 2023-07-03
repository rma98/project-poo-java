package perfumaria;

public class OleoCorporal extends Perfumaria {
	

	public OleoCorporal(String nome, String marca, double preco, String fragrancia) {
		super(nome, marca, preco, fragrancia);
	}
	
	public OleoCorporal() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço do óleo corporal com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("======================");
		System.out.println("Aplicando óleo corporal: " + getNome());
		System.out.println("======================");
	}
	
	public String getNome() {
		return super.getNome();
	}

}
