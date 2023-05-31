package projetoPOO;

public class Base extends Maquiagem {
	private String tom;

	public Base(String nome, double preco, String tom) {
		super(nome, preco);
		this.tom = tom;
	}
	
	public String getTom() {
        return tom;
    }

}
