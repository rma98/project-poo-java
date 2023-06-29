package maquiagem;

public class Batom extends Maquiagem {
	private String tipoBatom;

	public Batom(String nome, String marca, double preco, String cor, String tipoBatom) {
		super(nome, marca, preco, cor);
		this.tipoBatom = tipoBatom;
	}

	public Batom() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço do batom com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando batom: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tipo do batom: " + tipoBatom);
	}

	public String getTipoBatom() {
		return tipoBatom;
	}

	public void setTipoBatom(String tipoBatom) {
		this.tipoBatom = tipoBatom;
	}
	
	public String getNome() {
		return super.getNome();
	}

}
