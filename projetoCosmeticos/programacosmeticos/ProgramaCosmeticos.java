package programacosmeticos;

import java.util.Scanner;

import maquiagem.Base;
import maquiagem.EstoqueMaquiagem;
import maquiagem.ChecarEstoque;

public class ProgramaCosmeticos {

	public static void main(String[] args) {
		EstoqueMaquiagem estoqueMaquiagem = new EstoqueMaquiagem();
		ChecarEstoque checarEstoque = new ChecarEstoque(estoqueMaquiagem.getBases());

		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			exibirMenu();
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				adicionarItemEstoque(estoqueMaquiagem, scanner);
				break;
			case 2:
				atualizarItem(estoqueMaquiagem, scanner);
				break;
			case 3:
				visualizarItens(estoqueMaquiagem, scanner);
				break;
			case 4:
				removerItens(estoqueMaquiagem, scanner);
				break;
			case 5:
				visualizarEstoqueMaquiagem(checarEstoque);
				break;
			case 6:
				aplicarProdutoEDesconto(estoqueMaquiagem, checarEstoque, scanner);
				break;
			case 7:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
				break;
			}
		} while (opcao != 7);
	}

	private static void exibirMenu() {
		System.out.println("---------- MENU ----------");
		System.out.println("1. Adicionar item");
		System.out.println("2. Atualizar item");
		System.out.println("3. Visualizar itens");
		System.out.println("4. Remover item");
		System.out.println("5. Visualizar todos os itens do Estoque de Maquiagem");
		System.out.println("6. Aplicar produto e desconto");
		System.out.println("7. Sair");
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
			System.out.println("5. Pincel");
			System.out.println("6. Voltar ao menu principal");

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
				scanner.nextLine();

				boolean baseExistente = estoqueMaquiagem.getBases().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nome));

				if (baseExistente) {
					System.out.println("A base já está presente no estoque.");
				} else {
					Base base = new Base(nome, marca, preco, cor, tipoBase);
					estoqueMaquiagem.adicionarBase(base);

					System.out.println("Base adicionada ao estoque.");
				}
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
		System.out.println("Digite o tipo de maquiagem (Base, Batom, MascaraCilios, PaletaSombras, Pincel): ");
		String tipoMaquiagem = scanner.nextLine();

		switch (tipoMaquiagem.toLowerCase()) {
		case "base":
			System.out.println("Digite o índice da base a ser atualizado: ");
			int indiceBase = scanner.nextInt();
			scanner.nextLine();
			if (indiceBase < 0 || indiceBase >= estoqueMaquiagem.getBases().size()) {
				System.out.println("Índice inválido!");
				return;
			}

			System.out.println("Digite o novo nome da base: ");
			String novoNomeBase = scanner.nextLine();

			System.out.println("Digite a nova marca da base: ");
			String novaMarcaBatom = scanner.nextLine();

			System.out.println("Digite o novo preço da base: ");
			double novoPrecoBatom = scanner.nextDouble();
			scanner.nextLine();

			System.out.println("Digite a nova cor da base: ");
			String novaCorBatom = scanner.nextLine();

			System.out.println("Digite o novo tipo da base: ");
			String novoTipoBase = scanner.nextLine();

			Base baseAtualizado = new Base(novoNomeBase, novaMarcaBatom, novoPrecoBatom, novaCorBatom, novoTipoBase);
			estoqueMaquiagem.atualizarBase(indiceBase, baseAtualizado);
			System.out.println("Base atualizado com sucesso!");
			break;

		case "batom":
			// Implemente a lógica para atualizar um batom
			break;

			// Implemente os casos para MascaraCilios,  PaletaSombras e Pincel

		default:
			System.out.println("Tipo de maquiagem inválido!");
			break;
		}
	}

	private static void visualizarItens(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		System.out.println("Escolha o tipo de item a visualizar:");
		System.out.println("1. Base");
		System.out.println("2. Batom");
		// Adicione outras opções de acordo com os tipos de item disponíveis

		int opcao = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer do scanner

		switch (opcao) {
		case 1:
			System.out.println("Itens de Base:");
			int indexBase = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do scanner

			if (indexBase >= 0 && indexBase < estoqueMaquiagem.getBases().size()) {
				estoqueMaquiagem.consultarBase(indexBase);
			} else {
				System.out.println("Índice inválido");
			}
			break;
		case 2:
			System.out.println("Itens de Batom:");
			int indexBatom = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do scanner

			if (indexBatom >= 0 && indexBatom < estoqueMaquiagem.getBatons().size()) {
				estoqueMaquiagem.consultarBatom(indexBatom);
			} else {
				System.out.println("Índice inválido");
			}
			break;
			// Adicione os cases correspondentes às outras opções

		default:
			System.out.println("Opção inválida");
			break;
		}
	}

	private static void removerItens(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		System.out.println("Qual tipo de maquiagem deseja remover?");
		System.out.println("1. Base");
		System.out.println("2. Batom");
		System.out.println("3. Máscara de Cílios");
		System.out.println("4. Paleta de Sombras");
		System.out.println("5. Pincel");

		int opcao = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer do scanner

		switch (opcao) {
		case 1:
			System.out.println("Informe o índice da base a ser removida:");
			int indiceBase = scanner.nextInt();
			estoqueMaquiagem.removerBase(indiceBase);
			System.out.println("Base removida com sucesso.");
			break;
		case 2:
			System.out.println("Informe o índice do batom a ser removido:");
			int indiceBatom = scanner.nextInt();
			estoqueMaquiagem.removerBatom(indiceBatom);
			System.out.println("Batom removido com sucesso.");
			break;
		case 3:
			System.out.println("Informe o índice da máscara de cílios a ser removida:");
			int indiceMascaraCilios = scanner.nextInt();
			estoqueMaquiagem.removerMascaraCilios(indiceMascaraCilios);
			System.out.println("Máscara de Cílios removido com sucesso.");
			break;
		case 4:
			System.out.println("Informe o índice da paleta de sombras a ser removida:");
			int indicePaletaSombras = scanner.nextInt();
			estoqueMaquiagem.removerPaletaSombras(indicePaletaSombras);
			System.out.println("Paleta de Sombras removido com sucesso.");
			break;
		case 5:
			System.out.println("Informe o índice do pincel a ser removido:");
			int indicePincel = scanner.nextInt();
			estoqueMaquiagem.removerPincels(indicePincel);
			System.out.println("Pincel removido com sucesso.");
			break;
		default:
			System.out.println("Opção inválida");
		}
	}

	private static void visualizarEstoqueMaquiagem(ChecarEstoque checarEstoque) {
		checarEstoque.visualizarEstoque();
	}

	private static void aplicarProdutoEDesconto(EstoqueMaquiagem estoqueMaquiagem, ChecarEstoque checarEstoque, Scanner scanner) {
		System.out.println("Digite o tipo de maquiagem (Base, Batom, MascaraCilios, PaletaSombras, Pincel): ");

		String escolhaTipo = scanner.nextLine().toLowerCase();

		if (escolhaTipo.equals("base")) {
			System.out.print("Escolha a base pelo índice: ");
			int escolhaBase = scanner.nextInt();

			if (escolhaBase >= 0 && escolhaBase < checarEstoque.getNumeroBases()) {
				Base baseEscolhida = checarEstoque.getBasePorIndice(escolhaBase);

				System.out.print("Digite o valor do desconto para a base " + baseEscolhida.getNome() + ": ");
				double desconto = scanner.nextDouble();

				baseEscolhida.calcularDesconto(desconto);
				baseEscolhida.aplicar();
			} else {
				System.out.println("Índice inválido!");
			}
		} else {
			System.out.println("Tipo de produto inválido!");
		}
	}

}
