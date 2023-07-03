package cosmeticos;

public abstract class Cosmetico {
	protected String nome;
	protected String marca;
	protected double preco;

	public Cosmetico(String nome, String marca, double preco) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}
	
	public Cosmetico() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
