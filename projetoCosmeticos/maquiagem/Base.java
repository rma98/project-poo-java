package maquiagem;

public class Base extends Maquiagem {
	private String tipoBase;

	public Base(String nome, String marca, double preco, String cor, String tipoBase) {
		super(nome, marca, preco, cor);
		this.tipoBase = tipoBase;
	}
	
	public Base() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço da base com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("======================");
		System.out.println("Aplicando base: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tipo da base: " + tipoBase);
		System.out.println("======================");
	}

	public String getTipoBase() {
		return tipoBase;
	}

	public void setTipoBase(String tipoBase) {
		this.tipoBase = tipoBase;
	}
	
	public String getNome() {
        return super.getNome();
    }

}
