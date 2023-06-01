package produtocapilar;

public class Condicionador extends ProdutoCapilar {
    private String tipo;

    public Condicionador(String nome, double preco, String tipoCabelo, String tipo) {
        super(nome, preco, tipoCabelo);
        this.tipo = tipo;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando condicionador " + getNome());
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
        System.out.println("Preço do condicionador com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
