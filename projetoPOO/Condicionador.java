package projetoPOO;

public class Condicionador extends ProdutoCabelo {
	private String tipoCabelo;

	public Condicionador(String nome, double preco, String tipoCabelo) {
		super(nome, preco);
		this.tipoCabelo = tipoCabelo;
	}
	
	public String getTipoCabelo() {
        return tipoCabelo;
    }

}
