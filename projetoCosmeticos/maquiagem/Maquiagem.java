package maquiagem;

import cosmeticos.Cosmetico;

public abstract class Maquiagem extends Cosmetico {
	protected String cor;

	public Maquiagem(String nome, String marca, double preco, String cor) {
		super(nome, marca, preco);
		this.cor = cor;
	}

	public Maquiagem() {
		
	}

	public abstract void calcularDesconto(double percentualDesconto);
	public abstract void aplicar();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
