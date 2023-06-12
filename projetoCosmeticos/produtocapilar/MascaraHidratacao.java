package produtocapilar;

public class MascaraHidratacao extends ProdutoCapilar {

	public MascaraHidratacao(String nome, String marca, double preco, String tipoCabelo, String tipo) {
		super(nome, marca, preco, tipoCabelo, tipo);
		// TODO Auto-generated constructor stub
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
		System.out.println("Aplicando máscara de hidatração: " + getNome());
		System.out.println("Tipo de cabelo: " + getTipoCabelo());
		System.out.println("======================");
	}
	
	public String getNome() {
		return super.getNome();
	}
}
