package perfumaria;

public class Perfume extends Perfumaria {
    private String fixacao;

    public Perfume(String nome, double preco, String fragrancia, String fixacao) {
        super(nome, preco, fragrancia);
        this.fixacao = fixacao;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando perfume " + getNome());
        System.out.println("Fragrância: " + getFragrancia());
        System.out.println("Fixação: " + fixacao);
        System.out.println("===========");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Fragrância: " + getFragrancia());
        System.out.println("Fixação: " + fixacao);
        System.out.println("Categoria: Perfumaria");
        System.out.println("===========");
    }
    
    @Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço do perfume com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getFixacao() {
		return fixacao;
	}

	public void setFixacao(String fixacao) {
		this.fixacao = fixacao;
	}

}
