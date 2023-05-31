package projetoPOO;

public class Batom extends Maquiagem {
	private String cor;

	public Batom(String nome, double preco, String cor) {
		super(nome, preco);
		this.cor = cor;
	}
	
	public String getCor() {
        return cor;
    }
	
}
