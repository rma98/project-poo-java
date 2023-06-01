package perfumaria;

public class OleoCorporal extends Perfumaria {
    private String beneficio;

    public OleoCorporal(String nome, double preco, String fragrancia, String beneficio) {
        super(nome, preco, fragrancia);
        this.beneficio = beneficio;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando óleo corporal " + getNome());
        System.out.println("Fragrância: " + getFragrancia());
        System.out.println("Benefício: " + beneficio);
        System.out.println("===========");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Fragrância: " + getFragrancia());
        System.out.println("Benefício: " + beneficio);
        System.out.println("Categoria: Perfumaria");
        System.out.println("===========");
    }
    
    @Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço do óleo corporal com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

}
