package produtocapilar;

import cosmeticos.Cosmetico;

public abstract class ProdutoCapilar extends Cosmetico {
    private String tipoCabelo;

    public ProdutoCapilar(String nome, double preco, String tipoCabelo) {
        super(nome, preco);
        this.tipoCabelo = tipoCabelo;
    }

    public abstract void aplicar();

	public String getTipoCabelo() {
		return tipoCabelo;
	}

	public void setTipoCabelo(String tipoCabelo) {
		this.tipoCabelo = tipoCabelo;
	}

}
