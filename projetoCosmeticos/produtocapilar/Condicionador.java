package produtocapilar;

public class Condicionador extends ProdutoCapilar {

	public Condicionador(String nome, String marca, double preco, String tipoCabelo) {
		super(nome, marca, preco, tipoCabelo);
	}
	
	public Condicionador() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço do condicionador com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("======================");
		System.out.println("Aplicando condicionador: " + getNome());
		System.out.println("Tipo de cabelo: " + getTipoCabelo());
		System.out.println("======================");
	}

	public String getNome() {
		return super.getNome();
	}

}
