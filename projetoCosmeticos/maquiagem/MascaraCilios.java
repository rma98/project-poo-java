package maquiagem;

public class MascaraCilios extends Maquiagem {
	private String tipoMascaraCilios;

	public MascaraCilios(String nome, String marca, double preco, String cor, String tipoMascaraCilios) {
		super(nome, marca, preco, cor);
		this.tipoMascaraCilios = tipoMascaraCilios;
	}

	public MascaraCilios() {
		
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
	
	public String getNome() {
		return super.getNome();
	}
}
