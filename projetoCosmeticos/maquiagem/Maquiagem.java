package maquiagem;

import cosmeticos.Cosmetico;

public abstract class Maquiagem extends Cosmetico {
    private String cor;

    public Maquiagem(String nome, double preco, String cor) {
        super(nome, preco);
        this.cor = cor;
    }
    
    public Maquiagem() {
    	
	}

    public abstract void aplicar();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
