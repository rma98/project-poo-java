package projetoPOO;

public abstract class Cosmetico {
	private String nome;
    private double preco;
    
    public Cosmetico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public abstract void aplicar();

    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
}
