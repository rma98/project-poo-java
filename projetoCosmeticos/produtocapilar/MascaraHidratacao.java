package produtocapilar;

public class MascaraHidratacao extends ProdutoCapilar {
    private String beneficio;

    public MascaraHidratacao(String nome, double preco, String tipoCabelo, String beneficio) {
        super(nome, preco, tipoCabelo);
        this.beneficio = beneficio;
    }
    
    @Override
    public void aplicar() {
        System.out.println("Aplicando máscara de hidratação " + getNome());
        System.out.println("Tipo de cabelo: " + getTipoCabelo());
        System.out.println("Benefício: " + beneficio);
        System.out.println("===========");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Tipo de cabelo: " + getTipoCabelo());
        System.out.println("Benefício: " + beneficio);
        System.out.println("Categoria: Produto Capilar");
        System.out.println("===========");
    }
    
    @Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço da máscara de hidatração com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

}
