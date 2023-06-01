package perfumaria;

public class HidratanteCorporal extends Perfumaria {
    private String tipoPele;

    public HidratanteCorporal(String nome, double preco, String fragrancia, String tipoPele) {
        super(nome, preco, fragrancia);
        this.tipoPele = tipoPele;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando hidratante corporal " + getNome());
        System.out.println("Fragrância: " + getFragrancia());
        System.out.println("Tipo de pele: " + tipoPele);
        System.out.println("===========");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Fragrância: " + getFragrancia());
        System.out.println("Tipo de pele: " + tipoPele);
        System.out.println("Categoria: Perfumaria");
        System.out.println("===========");
    }
    
    @Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço do hidatrante corporal com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getTipoPele() {
		return tipoPele;
	}

	public void setTipoPele(String tipoPele) {
		this.tipoPele = tipoPele;
	}

}
