package cosmeticos;

public abstract class Cosmetico {
    private String nome;
    private double preco;

    public Cosmetico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public Cosmetico() {
    	
	}
    
    public abstract void calcularDesconto(double percentualDesconto);
    
    public abstract void exibirInformacoes();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
