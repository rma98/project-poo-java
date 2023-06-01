package maquiagem;

public class MascaraCilios extends Maquiagem {
    private String tipo;

    public MascaraCilios(String nome, double preco, String cor, String tipo) {
        super(nome, preco, cor);
        this.tipo = tipo;
    }
    
    public MascaraCilios() {
    	
	}

    @Override
    public void aplicar() {
        System.out.println("Aplicando máscara de cílios " + getNome());
        System.out.println("Cor: " + getCor());
        System.out.println("Tipo: " + tipo);
        System.out.println("===========");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Cor: " + getCor());
        System.out.println("Tipo: " + tipo);
        System.out.println("Categoria: Maquiagem");
        System.out.println("===========");
    }
    
	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço da máscara de cíclios com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
    
}
