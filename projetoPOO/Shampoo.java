package projetoPOO;

public class Shampoo extends ProdutoCabelo {
	private String tipoCabelo;

	public Shampoo(String nome, double preco, String tipoCabelo) {
		super(nome, preco);
		this.tipoCabelo = tipoCabelo;
	}
	
	public String getTipoCabelo() {
        return tipoCabelo;
    }

}
