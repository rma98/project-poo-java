package perfumaria;

import cosmeticos.Cosmetico;

public abstract class Perfumaria extends Cosmetico {
	protected String fragrancia;
	
	public Perfumaria(String nome, String marca, double preco, String fragrancia) {
		super(nome, marca, preco);
		this.fragrancia = fragrancia;
	}
	
	public Perfumaria() {
		
	}
	
	public abstract void calcularDesconto(double percentualDesconto);
	public abstract void aplicar();

	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}
	
}
