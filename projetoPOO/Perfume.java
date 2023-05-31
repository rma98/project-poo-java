package projetoPOO;

public class Perfume extends Maquiagem {
	private String fragrancia;

	public Perfume(String nome, double preco, String fragrancia) {
		super(nome, preco);
		this.fragrancia = fragrancia;
	}
	
	public String getFragrancia() {
        return fragrancia;
    }

}
