package produtocapilar;

public class MascaraHidratacao extends ProdutoCapilar {

	public MascaraHidratacao(String nome, String marca, double preco, String tipoCabelo) {
		super(nome, marca, preco, tipoCabelo);
		// TODO Auto-generated constructor stub
	}
	
	public MascaraHidratacao() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço da máscara de hidratação com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("======================");
		System.out.println("Aplicando máscara de hidratação: " + getNome());
		System.out.println("Tipo de cabelo: " + getTipoCabelo());
		System.out.println("======================");
	}
	
	public String getNome() {
		return super.getNome();
	}
}
