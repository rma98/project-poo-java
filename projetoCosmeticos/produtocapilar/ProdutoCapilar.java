package produtocapilar;

import cosmeticos.Cosmetico;

public abstract class ProdutoCapilar extends Cosmetico {
	protected String tipoCabelo;
	protected String tipo;

	public ProdutoCapilar(String nome, String marca, double preco, String tipoCabelo, String tipo) {
		super(nome, marca, preco);
		this.tipoCabelo = tipoCabelo;
		this.tipo = tipo;
	}
	
	public ProdutoCapilar() {
		
	}

	public abstract void calcularDesconto(double percentualDesconto);
	public abstract void aplicar();

	public String getTipoCabelo() {
		return tipoCabelo;
	}

	public void setTipoCabelo(String tipoCabelo) {
		this.tipoCabelo = tipoCabelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
