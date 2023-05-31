package projetoPOO;

public class Pincel extends Maquiagem {
	private String tipo;

	public Pincel(String nome, double preco, String tipo) {
		super(nome, preco);
		this.tipo = tipo;
	}
	
	public String getTipo() {
        return tipo;
    }
}
