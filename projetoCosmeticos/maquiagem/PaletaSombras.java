package maquiagem;

public class PaletaSombras extends Maquiagem {
    private int numeroCores;

    public PaletaSombras(String nome, double preco, String cor, int numeroCores) {
        super(nome, preco, cor);
        this.numeroCores = numeroCores;
    }
    
    public PaletaSombras() {
    	
	}

    @Override
    public void aplicar() {
        System.out.println("Aplicando sombra da paleta " + getNome());
        System.out.println("Cor: " + getCor());
        System.out.println("Número de cores: " + numeroCores);
        System.out.println("===========");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Cor: " + getCor());
        System.out.println("Número de cores: " + numeroCores);
        System.out.println("Categoria: Maquiagem");
        System.out.println("===========");
    }
    
    @Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
        double preçoComDesconto = getPreco() - desconto;
        System.out.println("Preço da máscara de cíclios com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	public int getNumeroCores() {
		return numeroCores;
	}

	public void setNumeroCores(int numeroCores) {
		this.numeroCores = numeroCores;
	}

}
