package maquiagem;

public class Base extends Maquiagem {
	private String tipoBase;

	public Base(String nome, String marca, double preco, String cor, String tipoBase) {
		super(nome, marca, preco, cor);
		this.tipoBase = tipoBase;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Produto: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Cor: " + getCor());
		System.out.println("Tipo da Base: " + tipoBase);
		System.out.println("Categoria: Maquiagem");
		System.out.println("===========");
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço da base com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando base: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tipo da base: " + tipoBase);
		System.out.println("===========");
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
