package produtocapilar;

import cosmeticos.Cosmetico;

public abstract class ProdutoCapilar extends Cosmetico {
	protected String tipoCabelo;

	public ProdutoCapilar(String nome, String marca, double preco, String tipoCabelo) {
		super(nome, marca, preco);
		this.tipoCabelo = tipoCabelo;
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

}
