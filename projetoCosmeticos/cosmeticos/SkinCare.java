package cosmeticos;

public class SkinCare extends Cosmetico {
    private String tipo;

    public SkinCare(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }
    
    public SkinCare() {
    	
	}

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Tipo: " + tipo);
        System.out.println("Categoria: Skin Care");
        System.out.println("===========");
    }
    
	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço da SkinCare com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
    
}
