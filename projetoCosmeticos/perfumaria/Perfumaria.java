package perfumaria;

import cosmeticos.Cosmetico;

public abstract class Perfumaria extends Cosmetico {
    private String fragrancia;

    public Perfumaria(String nome, double preco, String fragrancia) {
        super(nome, preco);
        this.fragrancia = fragrancia;
    }

    public abstract void aplicar();

	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}

}
