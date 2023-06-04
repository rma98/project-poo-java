package programacosmeticos;

import java.util.Scanner;

import maquiagem.Base;
import maquiagem.EstoqueMaquiagem;

public class ProgramaCosmeticos {

	public static void main(String[] args) {
		EstoqueMaquiagem estoqueMaquiagem = new EstoqueMaquiagem();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		
		do {
			exibirMenu();
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				adicionarItemEstoque(estoqueMaquiagem, scanner);
				break;
			case 2:
				atualizarItem(estoqueMaquiagem, scanner);
				break;
			case 3:
				visualizarItens(estoqueMaquiagem);
				break;
			case 4:
				removerItem(estoqueMaquiagem, scanner);
				break;
			case 5:
				aplicarProdutoEDesconto(estoqueMaquiagem, scanner);
				break;
			case 6:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
				break;
			}
		} while (opcao != 6);
	}

	private static void exibirMenu() {
		System.out.println("---------- MENU ----------");
		System.out.println("1. Adicionar item");
		System.out.println("2. Atualizar item");
		System.out.println("3. Visualizar itens");
		System.out.println("4. Remover item");
		System.out.println("5. Aplicar produto e desconto");
		System.out.println("6. Sair");
		System.out.print("Escolha uma opção: ");
	}

	public static void adicionarItemEstoque(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		boolean continuarAdicionando = true;

		while (continuarAdicionando) {
			System.out.println("Selecione o tipo de item que deseja adicionar:");
			System.out.println("1. Base");
			System.out.println("2. Batom");
			System.out.println("3. Máscara de Cílios");
			System.out.println("4. Paleta de Sombras");
			System.out.println("5. Voltar ao menu principal");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do scanner

			switch (opcao) {
			case 1:
				System.out.println("Informe o nome da base:");
				String nome = scanner.nextLine();

				System.out.println("Informe a marca da base:");
				String marca = scanner.nextLine();

				System.out.println("Informe o preço da base:");
				double preco = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a cor da base:");
				String cor = scanner.nextLine();

				System.out.println("Informe o tipo da base:");
				String tipoBase = scanner.nextLine();

				System.out.println("Informe a quantidade em estoque da base:");
				int quantidadeBase = scanner.nextInt();

				Base base = new Base(nome, marca, preco, cor, tipoBase);
				estoqueMaquiagem.adicionarBase(base);

				System.out.println("Base adicionada ao estoque.");
				break;
			case 2:
				// Lógica para adicionar batom
				break;
			case 3:
				// Lógica para adicionar máscara de cílios
				break;
			case 4:
				// Lógica para adicionar paleta de sombras
				break;
			case 5:
				// Lógica para adicionar pincel
				break;
			case 6:
				continuarAdicionando = false;
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

	private static void atualizarItem(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		// Lógica para atualizar um item no estoque
	}

	private static void visualizarItens(EstoqueMaquiagem estoqueMaquiagem) {
		// Lógica para visualizar os itens no estoque
	}

	private static void removerItem(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		// Lógica para remover um item do estoque
	}

	private static void aplicarProdutoEDesconto(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		// Lógica para aplicar um produto e desconto
	}
}
