package produtocapilar;

public class Shampoo extends ProdutoCapilar {
    private String tipo;

    public Shampoo(String nome, double preco, String tipoCabelo, String tipo) {
        super(nome, preco, tipoCabelo);
        this.tipo = tipo;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando shampoo " + getNome());
        System.out.println("Tipo de cabelo: " + getTipoCabelo());
        System.out.println("Tipo: " + tipo);
        System.out.println("===========");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Tipo de cabelo: " + getTipoCabelo());
        System.out.println("Tipo: " + tipo);
        System.out.println("Categoria: Produto Capilar");
        System.out.println("===========");
    }
    
    @Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço do shampoo com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}