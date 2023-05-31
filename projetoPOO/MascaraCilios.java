package projetoPOO;

public class MascaraCilios extends Maquiagem {
	private String cor;

	public MascaraCilios(String nome, double preco, String cor) {
		super(nome, preco);
		this.cor = cor;
	}
	
	public String getCor() {
        return cor;
    }

}
