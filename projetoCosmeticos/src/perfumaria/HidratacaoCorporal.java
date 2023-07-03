package perfumaria;

public class HidratacaoCorporal extends Perfumaria {
	private String tipoPele;

	public HidratacaoCorporal(String nome, String marca, double preco, String fragrancia, String tipoPele) {
		super(nome, marca, preco, fragrancia);
		this.tipoPele = tipoPele;
	}
	
	public HidratacaoCorporal() {
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double preçoComDesconto = getPreco() - desconto;
		System.out.println("Preço da hidratação corporal com desconto de " + percentualDesconto + "%: R$" + preçoComDesconto);
	}

	@Override
	public void aplicar() {
		System.out.println("======================");
		System.out.println("Aplicando hidratação corporal: " + getNome());
		System.out.println("Tipo: " + tipoPele);
		System.out.println("======================");
	}

	public String getTipoPele() {
		return tipoPele;
	}

	public void setTipoPele(String tipoPele) {
		this.tipoPele = tipoPele;
	}
	
	public String getNome() {
		return super.getNome();
	}

}
