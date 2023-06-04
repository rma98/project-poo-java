package maquiagem;

public class MascaraCilios extends Maquiagem {
	private String tipoMascaraCilios;

	public MascaraCilios(String nome, String marca, double preco, String cor, String tipoMascaraCilios) {
		super(nome, marca, preco, cor);
		this.tipoMascaraCilios = tipoMascaraCilios;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Produto: " + getNome());
		System.out.println("Marca: " + getMarca());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Cor: " + getCor());
        System.out.println("Tipo da Máscara de Cílios: " + tipoMascaraCilios);
        System.out.println("Categoria: Maquiagem");
        System.out.println("===========");
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço da máscara de cílios com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando máscara de cílios: " + getNome());
        System.out.println("Cor: " + getCor());
        System.out.println("Tipo da máscara de cílios: " + tipoMascaraCilios);
        System.out.println("===========");
	}

	public String getTipoMascaraCilios() {
		return tipoMascaraCilios;
	}

	public void setTipoMascaraCilios(String tipoMascaraCilios) {
		this.tipoMascaraCilios = tipoMascaraCilios;
	}
	
}
