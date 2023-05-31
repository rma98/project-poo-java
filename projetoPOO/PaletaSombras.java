package projetoPOO;

public class PaletaSombras extends Maquiagem {
	private int quantidade;

	public PaletaSombras(String nome, double preco, int quantidade) {
		super(nome, preco);
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
        return quantidade;
    }

}
