package projetoPOO;

import java.util.Scanner;

public class ProgramaCosmeticos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean sair = false;

		while (!sair) {
			System.out.println("----- MENU -----");
			System.out.println("1. Aplicar cosmético");
			System.out.println("2. Visualizar informações");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do Scanner

			switch (opcao) {
			case 1:
				aplicarCosmetico(scanner);
				break;
			case 2:
				visualizarInformacoes(scanner);
				break;
			case 3:
				sair = true;
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
		scanner.close();
	}

	private static void aplicarCosmetico(Scanner scanner) {
		System.out.println("----- APLICAR COSMÉTICO -----");
		System.out.println("Selecione o tipo de cosmético:");
		System.out.println("1. Batom");
		System.out.println("2. Base");
		System.out.println("3. Máscara de Cílios");
		// Adicione mais opções para outros tipos de cosméticos

		int opcao = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer do Scanner

		switch (opcao) {
		case 1:
			aplicarBatom(scanner);
			break;
		case 2:
			aplicarBase(scanner);
			break;
		case 3:
			aplicarMascaraCilios(scanner);
			break;
			// Adicione mais casos para outros tipos de cosméticos
		default:
			System.out.println("Opção inválida. Tente novamente.");
			break;
		}
	}

	private static void aplicarBatom(Scanner scanner) {
		System.out.print("Digite o nome do batom: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o preço do batom: ");
		double preco = scanner.nextDouble();
		scanner.nextLine(); // Limpar o buffer do Scanner
		System.out.print("Digite a cor do batom: ");
		String cor = scanner.nextLine();

		Batom batom = new Batom(nome, preco, cor);
		batom.aplicar();
	}

	private static void aplicarBase(Scanner scanner) {
		System.out.print("Digite o nome da base: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o preço da base: ");
		double preco = scanner.nextDouble();
		scanner.nextLine(); // Limpar o buffer do Scanner
		System.out.print("Digite o tom da base: ");
		String tom = scanner.nextLine();

		Base base = new Base(nome, preco, tom);
		base.aplicar();
	}

	private static void aplicarMascaraCilios(Scanner scanner) {
		System.out.print("Digite o nome da máscara de cílios: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o preço da máscara de cílios: ");
		double preco = scanner.nextDouble();
		scanner.nextLine(); // Limpar o buffer do Scanner
		System.out.print("Digite a cor da máscara de cílios: ");
		String cor = scanner.nextLine();

		MascaraCilios mascara = new MascaraCilios(nome, preco, cor);
		mascara.aplicar();
	}

	private static void visualizarInformacoes(Scanner scanner) {
		System.out.println("----- VISUALIZAR INFORMAÇÕES -----");
		System.out.println("Selecione o tipo de cosmético:");
		System.out.println("1. Batom");
		System.out.println("2. Base");
		System.out.println("3. Máscara de Cílios");
		// Adicione mais opções para outros tipos de cosméticos

		int opcao = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer do Scanner

		switch (opcao) {
		case 1:
			visualizarInformacoesBatom(scanner);
			break;
		case 2:
			visualizarInformacoesBase(scanner);
			break;
		case 3:
			visualizarInformacoesMascaraCilios(scanner);
			break;
			// Adicione mais casos para outros tipos de cosméticos
		default:
			System.out.println("Opção inválida. Tente novamente.");
			break;
		}
	}

	private static void visualizarInformacoesBatom(Scanner scanner) {
		System.out.print("Digite o nome do batom: ");
		String nome = scanner.nextLine();

		// Buscar o batom na lista de cosméticos ou em um banco de dados, por exemplo
		// Exibir as informações do batom encontrado
	}

	private static void visualizarInformacoesBase(Scanner scanner) {
		System.out.print("Digite o nome da base: ");
		String nome = scanner.nextLine();

		// Buscar a base na lista de cosméticos ou em um banco de dados, por exemplo
		// Exibir as informações da base encontrada
	}

	private static void visualizarInformacoesMascaraCilios(Scanner scanner) {
		System.out.print("Digite o nome da máscara de cílios: ");
		String nome = scanner.nextLine();

		// Buscar a máscara de cílios na lista de cosméticos ou em um banco de dados, por exemplo
		// Exibir as informações da máscara de cílios encontrada
	}

}