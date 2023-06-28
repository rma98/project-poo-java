package chrcosmeticos;

import java.util.Scanner;

import maquiagem.Base;
import maquiagem.Batom;
import maquiagem.EstoqueMaquiagem;
import maquiagem.Maquiagem;
import maquiagem.MascaraCilios;
import maquiagem.PaletaSombras;
import maquiagem.Pincel;
import perfumaria.ChecarEstoquePerfumaria;
import perfumaria.Desodorante;
import perfumaria.EstoquePerfumaria;
import perfumaria.HidratacaoCorporal;
import perfumaria.OleoCorporal;
import perfumaria.Perfumaria;
import perfumaria.Perfume;
import produtocapilar.ChecarEstoqueProdutoCapilar;
import produtocapilar.Condicionador;
import produtocapilar.EstoqueProdutoCapilar;
import produtocapilar.MascaraHidratacao;
import produtocapilar.ProdutoCapilar;
import produtocapilar.Shampoo;
import maquiagem.ChecarEstoqueMaquiagem;

public class CHRCosmeticos {

	public static void main(String[] args) {
		EstoqueMaquiagem estoqueMaquiagem = new EstoqueMaquiagem();
		ChecarEstoqueMaquiagem checarEstoqueMaquiagem = new ChecarEstoqueMaquiagem(estoqueMaquiagem.getBases(), estoqueMaquiagem.getBatons(), estoqueMaquiagem.getMascarasCilios(), estoqueMaquiagem.getPaletasSombras(), estoqueMaquiagem.getPinceis());

		EstoquePerfumaria estoquePerfumaria = new EstoquePerfumaria();
		ChecarEstoquePerfumaria checarEstoquePerfumaria = new ChecarEstoquePerfumaria(estoquePerfumaria.getDesodorantes(), estoquePerfumaria.getHidratacaoCorporais(), estoquePerfumaria.getOleoCorporais(), estoquePerfumaria.getPerfumes());

		EstoqueProdutoCapilar estoqueCapilar = new EstoqueProdutoCapilar();
		ChecarEstoqueProdutoCapilar checarEstoqueProdutoCapilar = new ChecarEstoqueProdutoCapilar(estoqueCapilar.getCondicionadores(), estoqueCapilar.getMascaraHidratacaos(), estoqueCapilar.getShampoos());

		Scanner scanner = new Scanner(System.in);		
		boolean cosmeticos = true;

		while (cosmeticos) {
			boolean continuarMenu = true;
			String tipoCosmetico;

			System.out.println("---------- CHR Cosmésticos ----------");
			System.out.println("1. Maquiagem");
			System.out.println("2. Perfumaria");
			System.out.println("3. Produtos Capilares");
			System.out.println("4. Encerrar programa");
			System.out.println("------------------------------");
			tipoCosmetico = scanner.nextLine();

			switch (tipoCosmetico) {
			case "1":
				exibirMenu();
				System.out.print("Escolha uma opção: ");
				while (continuarMenu) {
					String opcao = scanner.nextLine();

					switch (opcao) {
					case "1":
						adicionarItemEstoque(estoqueMaquiagem, scanner);
						break;
					case "2":
						atualizarItem(estoqueMaquiagem, scanner);
						break;
					case "3":
						visualizarItens(estoqueMaquiagem, scanner);
						break;
					case "4":
						removerItens(estoqueMaquiagem, scanner);
						break;
					case "5":
						visualizarEstoqueMaquiagem(checarEstoqueMaquiagem);
						break;
					case "6":
						aplicarProdutoEDesconto(estoqueMaquiagem, checarEstoqueMaquiagem, scanner);
						break;
					case "7":
						continuarMenu = false;
						break;
					default:
						System.out.println("Opção inválida!");
						exibirMenu();
						System.out.print("Escolha uma opção: ");
						break;
					}
				}
				break;
			case "2":
				exibirMenu();
				System.out.print("Escolha uma opção: ");
				while (continuarMenu) {
					String opcao = scanner.nextLine();

					switch (opcao) {
					case "1":
						adicionarItemEstoque(estoquePerfumaria, scanner);
						break;
					case "2":
						atualizarItem(estoquePerfumaria, scanner);
						break;
					case "3":
						visualizarItens(estoquePerfumaria, scanner);
						break;
					case "4":
						removerItens(estoquePerfumaria, scanner);
						break;
					case "5":
						visualizarEstoquePerfumaria(checarEstoquePerfumaria);
						break;
					case "6":
						aplicarProdutoEDesconto(estoquePerfumaria, checarEstoquePerfumaria, scanner);
						break;
					case "7":
						continuarMenu = false;
						exibirMenu();
						break;
					default:
						System.out.println("Opção inválida!");
						exibirMenu();
						System.out.print("Escolha uma opção: ");
						break;
					}
				}
				break;
			case "3":
				exibirMenu();
				System.out.print("Escolha uma opção: ");
				while (continuarMenu) {
					String opcao = scanner.nextLine();

					switch (opcao) {
					case "1":
						adicionarItemEstoque(estoqueCapilar, scanner);
						break;
					case "2":
						atualizarItem(estoqueCapilar, scanner);
						break;
					case "3":
						visualizarItens(estoqueCapilar, scanner);
						break;
					case "4":
						removerItens(estoqueCapilar, scanner);
						break;
					case "5":
						visualizarEstoqueProdutoCapilar(checarEstoqueProdutoCapilar);
						break;
					case "6":
						aplicarProdutoEDesconto(estoqueCapilar, checarEstoqueProdutoCapilar, scanner);
					case "7":
						continuarMenu = false;
						break;
					default:
						System.out.println("Opção inválida!");
						exibirMenu();
						System.out.print("Escolha uma opção: ");
						break;
					}
				}
				break;
			case "4":
				cosmeticos = false;
				System.out.println("Encerrando programa...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}

	private static void exibirMenu() {
		System.out.println("---------- MENU ----------");
		System.out.println("1. Adicionar item");
		System.out.println("2. Atualizar item");
		System.out.println("3. Visualizar itens");
		System.out.println("4. Remover item");
		System.out.println("5. Visualizar Estoque");
		System.out.println("6. Aplicar produto e desconto");
		System.out.println("7. Voltar aos tipos de cosmésticos");
		System.out.println("------------------------------------------------------------");
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

			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				System.out.println("Informe o nome da base: ");
				String nomeBase = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaBase = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoBase = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a cor: ");
				String corBase = scanner.nextLine();

				System.out.println("Informe o tipo: ");
				String tipoBase = scanner.nextLine();

				boolean baseExistente = estoqueMaquiagem.getBases().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeBase));
				if (baseExistente) {
					System.out.println("A base já está presente no estoque.");
				} else {
					Maquiagem base = new Base(nomeBase, marcaBase, precoBase, corBase, tipoBase);
					estoqueMaquiagem.adicionarBase(base);
					System.out.println("Base adicionada ao estoque.");
				}
				break;

			case "2":
				System.out.println("Informe o nome do batom: ");
				String nomeBatom = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaBatom = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoBatom = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a cor: ");
				String corBatom = scanner.nextLine();

				System.out.println("Informe o tipo: ");
				String tipoBatom = scanner.nextLine();

				boolean batomExistente = estoqueMaquiagem.getBatons().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeBatom));
				if(batomExistente) {
					System.out.println("O batom já está presente no estoque.");
				} else {
					Maquiagem batom = new Batom(nomeBatom, marcaBatom, precoBatom, corBatom, tipoBatom);
					estoqueMaquiagem.adicionarBatom(batom);
					System.out.println("Batom adicionado ao estoque.");
				}
				break;
			case "3":
				System.out.println("Informe o nome da máscara de cílios: ");
				String nomeMascaraCilios = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaMascaraCilios = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoMascaraCilios = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a cor: ");
				String corMascaraCilios = scanner.nextLine();

				System.out.println("Informe o tipo: ");
				String tipoMascaraCilios = scanner.nextLine();

				boolean mascaraCiliosExistente = estoqueMaquiagem.getMascarasCilios().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeMascaraCilios));
				if (mascaraCiliosExistente) {
					System.out.println("A máscara de cílios já está presente no estoque.");
				} else {
					Maquiagem mascaraCilios = new MascaraCilios(nomeMascaraCilios, marcaMascaraCilios, precoMascaraCilios, corMascaraCilios, tipoMascaraCilios);
					estoqueMaquiagem.adicionarMascaraCilios(mascaraCilios);
					System.out.println("Máscara de cílios adicionado ao estoque.");
				}
				break;
			case "4":
				System.out.println("Informe o nome da paleta de sombras: ");
				String nomePaletaSombras = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaPaletaSombras = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoPaletaSombras = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a cor: ");
				String corPaletaSombras = scanner.nextLine();

				System.out.println("Informe o número de cores: ");
				int numeroCores = scanner.nextInt();
				scanner.nextLine();

				boolean paletaSombrasExistente = estoqueMaquiagem.getPaletasSombras().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomePaletaSombras));
				if (paletaSombrasExistente) {
					System.out.println("A paleta de sombras já está presente no estoque.");
				} else {
					Maquiagem paletaSombras = new PaletaSombras(nomePaletaSombras, marcaPaletaSombras, precoPaletaSombras, corPaletaSombras, numeroCores);
					estoqueMaquiagem.adicionarPaletaSombras(paletaSombras);
					System.out.println("Paleta de sombras adicionado ao estoque.");
				}
				break;
			case "5":
				System.out.println("Informe o nome do pincel: ");
				String nomePincel = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaPincel = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoPincel = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a cor: ");
				String corPincel = scanner.nextLine();

				System.out.println("Informe o tamanho: ");
				String tamanhoPincel = scanner.nextLine();

				boolean pincelExistente = estoqueMaquiagem.getPinceis().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomePincel));
				if (pincelExistente) {
					System.out.println("O pincel já está presente no estoque.");
				} else {
					Maquiagem pincel = new Pincel(nomePincel, marcaPincel, precoPincel, corPincel, tamanhoPincel);
					estoqueMaquiagem.adicionarPincel(pincel);
					System.out.println("Pincel adicionado ao estoque.");
				}
				break;
			case "6":
				continuarAdicionando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

	private static void adicionarItemEstoque(EstoquePerfumaria estoquePerfumaria, Scanner scanner) {
		boolean continuarAdicionando = true;

		while (continuarAdicionando) {
			System.out.println("Selecione o tipo de item que deseja adicionar:");
			System.out.println("1. Desodorante");
			System.out.println("2. Hidratação Corporal");
			System.out.println("3. Óleo Corporal");
			System.out.println("4. Perfume");
			System.out.println("5. Voltar ao menu principal");

			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				System.out.println("Informe o nome do desodorante: ");
				String nomeDesodorante = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaDesodorante = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoDesodorante = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a fragrância: ");
				String fragranciaDesodorante = scanner.nextLine();

				System.out.println("Informe o tipo: ");
				String tipoDesodorante = scanner.nextLine();

				boolean desodoranteExistente = estoquePerfumaria.getDesodorantes().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeDesodorante));
				if (desodoranteExistente) {
					System.out.println("O desodorante já está presente no estoque.");
				} else {
					Perfumaria desodorante = new Desodorante(nomeDesodorante, marcaDesodorante, precoDesodorante, fragranciaDesodorante, tipoDesodorante);
					estoquePerfumaria.adicionarDesodorante(desodorante);
					System.out.println("Desodorante adicionado ao estoque.");
				}
				break;
			case "2":
				System.out.println("Informe o nome da hidratação corporal: ");
				String nomeHidrataçaoCorporal = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaHidrataçaoCorporal = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoHidrataçaoCorporal = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a fragrância: ");
				String fragranciaHidrataçaoCorporal = scanner.nextLine();

				System.out.println("Informe o tipo de pele: ");
				String tipoPele = scanner.nextLine();

				boolean hidratacaoCorporalExistente = estoquePerfumaria.getHidratacaoCorporais().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeHidrataçaoCorporal));
				if (hidratacaoCorporalExistente) {
					System.out.println("A hidratação corporal já está presente no estoque.");
				} else {
					Perfumaria hidratacaoCorporal = new HidratacaoCorporal(nomeHidrataçaoCorporal, marcaHidrataçaoCorporal, precoHidrataçaoCorporal, fragranciaHidrataçaoCorporal, tipoPele);
					estoquePerfumaria.adicionarHidatracaoCorporal(hidratacaoCorporal);
					System.out.println("Hidratação corporal adicionado ao estoque.");
				}
				break;
			case "3":
				System.out.println("Informe o nome do óleo corporal: ");
				String nomeOleoCorporal = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaOleoCorporal = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoOleoCorporal = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a fragrância: ");
				String fragranciaOleoCorporal = scanner.nextLine();

				boolean oleoCorporalExistene = estoquePerfumaria.getOleoCorporais().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeOleoCorporal));
				if (oleoCorporalExistene) {
					System.out.println("O óleo corporal já está presente no estoque.");
				} else {
					Perfumaria oeloCorporal = new OleoCorporal(nomeOleoCorporal, marcaOleoCorporal, precoOleoCorporal, fragranciaOleoCorporal);
					estoquePerfumaria.adicionarOleoCorporal(oeloCorporal);
					System.out.println("Óleo corporal adicionado ao estoque.");
				}
				break;
			case "4":	
				System.out.println("Informe o nome do perfume: ");
				String nomeperfume = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaperfume = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoperfume = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a fragrância: ");
				String fragranciaperfume = scanner.nextLine();

				boolean perfumeExistente = estoquePerfumaria.getPerfumes().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeperfume));
				if (perfumeExistente) {
					System.out.println("O perfume já está presente no estoque.");
				} else {
					Perfumaria perfume = new Perfume(nomeperfume, marcaperfume, precoperfume, fragranciaperfume);
					estoquePerfumaria.adicionarPerfume(perfume);
					System.out.println("Perfume adicionado ao estoque.");
				}
				break;
			case "5":
				continuarAdicionando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

	private static void adicionarItemEstoque(EstoqueProdutoCapilar estoqueCapilar, Scanner scanner) {
		boolean continuarAdicionando = true;

		while (continuarAdicionando) {
			System.out.println("Selecione o tipo de item que deseja adicionar:");
			System.out.println("1. Condicionador");
			System.out.println("2. Máscara de Hidratação");
			System.out.println("3. Shampoo");
			System.out.println("4. Voltar ao menu principal");

			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				System.out.println("Informe o nome do condicionador: ");
				String nomeCondicionador = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaCondicionador = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoCondicionador = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe o tipo de cabelo: ");
				String tipoCabeloCondicionador = scanner.nextLine();

				boolean condicionadorExistente = estoqueCapilar.getCondicionadores().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeCondicionador));
				if (condicionadorExistente) {
					System.out.println("O condicionador já está presente no estoque.");
				} else {
					ProdutoCapilar condicionador = new Condicionador(nomeCondicionador, marcaCondicionador, precoCondicionador, tipoCabeloCondicionador);
					estoqueCapilar.adicionarCondicionador(condicionador);

					System.out.println("Condicionador adicionado ao estoque.");
				}
				break;
			case "2":
				System.out.println("Informe o nome da máscara de hidratação: ");
				String nomeMascaraHidratacao = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaMascaraHidratacao = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoMascaraHidratacao = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe o tipo de cabelo: ");
				String tipoCabeloMascaraHidratacao = scanner.nextLine();

				boolean mascaraHidratacaoExistente = estoqueCapilar.getMascaraHidratacaos().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeMascaraHidratacao));

				if (mascaraHidratacaoExistente) {
					System.out.println("A máscara de hidratação já está presente no estoque.");
				} else {
					ProdutoCapilar mascaraHidratacao = new MascaraHidratacao(nomeMascaraHidratacao, marcaMascaraHidratacao, precoMascaraHidratacao, tipoCabeloMascaraHidratacao);
					estoqueCapilar.adicionarMascaraHidatracao(mascaraHidratacao);

					System.out.println("Máscara de hidratação adicionado ao estoque.");
				}
				break;
			case "3":
				System.out.println("Informe o nome do shampoo: ");
				String nomeShampoo = scanner.nextLine();

				System.out.println("Informe a marca: ");
				String marcaShampoo = scanner.nextLine();

				System.out.println("Informe o preço: ");
				double precoShampoo = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe o tipo de cabelo: ");
				String tipoCabeloShampoo = scanner.nextLine();

				boolean shampooExistente = estoqueCapilar.getShampoos().stream().anyMatch(b -> b.getNome().equalsIgnoreCase(nomeShampoo));

				if (shampooExistente) {
					System.out.println("O shampoo já está presente no estoque.");
				} else {
					ProdutoCapilar shampoo = new Shampoo(nomeShampoo, marcaShampoo, precoShampoo, tipoCabeloShampoo);
					estoqueCapilar.adicionarShampoo(shampoo);

					System.out.println("Shampoo adicionado ao estoque.");
				}
				break;
			case "4":
				continuarAdicionando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

	private static void atualizarItem(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		boolean continuarAtualizando = true;

		while (continuarAtualizando) {
			System.out.println("Digite o tipo de maquiagem:");
			System.out.println("1. Base");
			System.out.println("2. Batom");
			System.out.println("3. Máscara de Cílios");
			System.out.println("4. Paleta de Sombras");
			System.out.println("5. Pincel");
			System.out.println("6. Voltar ao menu principal");

			String tipoMaquiagem = scanner.nextLine();

			switch (tipoMaquiagem) {
			case "1":
				System.out.println("Digite o índice da base a ser atualizado: ");
				int indiceBase = scanner.nextInt();
				scanner.nextLine();
				if (indiceBase < 0 || indiceBase >= estoqueMaquiagem.getBases().size()) {
					System.out.println("Índice inválido!");
					return;
				}
				System.out.println("Digite o novo nome da base: ");
				String novoNomeBase = scanner.nextLine();

				System.out.println("Digite a nova marca: ");
				String novaMarcaBase = scanner.nextLine();

				System.out.println("Digite o novo preço: ");
				double novoPrecoBase = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Digite a nova cor: ");
				String novaCorBase = scanner.nextLine();

				System.out.println("Digite o novo tipo: ");
				String novoTipoBase = scanner.nextLine();

				Maquiagem baseAtualizado = new Base(novoNomeBase, novaMarcaBase, novoPrecoBase, novaCorBase, novoTipoBase);
				estoqueMaquiagem.atualizarBase(indiceBase, baseAtualizado);
				System.out.println("Base atualizado com sucesso!");
				break;
			case "2":
				System.out.println("Digite o índice do batom a ser atualizado: ");
				int indiceBatom = scanner.nextInt();
				scanner.nextLine();
				if (indiceBatom < 0 || indiceBatom >= estoqueMaquiagem.getBatons().size()) {
					System.out.println("Índice inválido!");
					return;
				}
				System.out.println("Digite o novo nome do batom: ");
				String novoNomeBatom = scanner.nextLine();

				System.out.println("Digite a nova marca: ");
				String novaMarcaBatom = scanner.nextLine();

				System.out.println("Digite o novo preço: ");
				double novoPrecoBatom = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Digite a nova cor: ");
				String novacorBatom = scanner.nextLine();

				System.out.println("Digite o novo tipo: ");
				String novoTipoBatom = scanner.nextLine();

				Maquiagem batomAtualizado = new Batom(novoNomeBatom, novaMarcaBatom, novoPrecoBatom, novacorBatom, novoTipoBatom);
				estoqueMaquiagem.atualizarBatom(indiceBatom, batomAtualizado);
				System.out.println("Batom atualizado com sucesso!");
				break;
			case "3":
				System.out.println("Digite o índice da máscara de cílios a ser atualizado: ");
				int indiceMascaraCilios = scanner.nextInt();
				scanner.nextLine();
				if (indiceMascaraCilios < 0 || indiceMascaraCilios >= estoqueMaquiagem.getMascarasCilios().size()) {
					System.out.println("Índice inválido!");
					return;
				}

				System.out.println("Digite o novo nome da máscara de cílios: ");
				String novoNomeMascaraCilios = scanner.nextLine();

				System.out.println("Digite a nova marca: ");
				String novaMarcaMascaraCilios = scanner.nextLine();

				System.out.println("Digite o novo preço: ");
				double novoPrecoMascaraCilios = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Digite a nova cor: ");
				String novaCorMascaraCilios = scanner.nextLine();

				System.out.println("Digite o novo tipo: ");
				String novoTipoMascaraCilios = scanner.nextLine();

				Maquiagem mascaraCilios = new MascaraCilios(novoNomeMascaraCilios, novaMarcaMascaraCilios, novoPrecoMascaraCilios, novaCorMascaraCilios, novoTipoMascaraCilios);
				estoqueMaquiagem.atualizarMascaraCilios(indiceMascaraCilios, mascaraCilios);

				System.out.println("Máscara de cílios atualizado com sucesso!");
				break;
			case "4":
				System.out.println("Digite o índice da paleta de sombras a ser atualizado: ");
				int indicePaletaSombras = scanner.nextInt();
				scanner.nextLine();
				if (indicePaletaSombras < 0 || indicePaletaSombras >= estoqueMaquiagem.getPaletasSombras().size()) { 
					System.out.println("Índice inválido!");
					return;
				}

				System.out.println("Digite o novo nome da paleta de sombras: ");
				String novoNomePaletaSombras = scanner.nextLine();

				System.out.println("Digite a nova marca: ");
				String novaMarcaPaletaSombras = scanner.nextLine();

				System.out.println("Digite o novo preço: ");
				double novoPrecoPaletaSombras = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Digite a nova cor: ");
				String novaCorPaletaSombras = scanner.nextLine();

				System.out.println("Digite o novo número de cores: ");
				int novoNumeroPaletaSombras = scanner.nextInt();

				Maquiagem paletaSombras = new PaletaSombras(novoNomePaletaSombras, novaMarcaPaletaSombras, novoPrecoPaletaSombras, novaCorPaletaSombras, novoNumeroPaletaSombras);
				estoqueMaquiagem.atualizarPaletaSombras(indicePaletaSombras, paletaSombras);

				System.out.println("Máscara de cílios atualizado com sucesso!");
				break;
			case "5":
				System.out.println("Digite o índice do pincel a ser atualizado: ");
				int indicePincel = scanner.nextInt();
				scanner.nextLine();
				if (indicePincel < 0 || indicePincel >= estoqueMaquiagem.getPinceis().size()) {
					System.out.println("Índice inválido!");
					return;
				}
				System.out.println("Digite o novo nome do pincel: ");
				String novoNomePincel = scanner.nextLine();

				System.out.println("Digite a nova marca: ");
				String novaMarcaPincel = scanner.nextLine();

				System.out.println("Digite o novo preço: ");
				double novoPrecoPincel = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Digite a nova cor: ");
				String novaCorPincel = scanner.nextLine();

				System.out.println("Digite o novo tamanho: ");
				String novoTamanhoPincel = scanner.nextLine();

				Maquiagem pincel = new Pincel(novoNomePincel, novaMarcaPincel, novoPrecoPincel, novaCorPincel, novoTamanhoPincel);
				estoqueMaquiagem.atualizarPincel(indicePincel, pincel);

				System.out.println("Pincel atualizado com sucesso!");
				break;
			case "6":
				continuarAtualizando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Tipo de maquiagem inválido!");
				break;
			}
		}
	}

	private static void atualizarItem(EstoquePerfumaria estoquePerfumaria, Scanner scanner) {
		boolean continuarAtualizando = true;

		while (continuarAtualizando) {
			System.out.println("Digite o tipo de perfumarias:");
			System.out.println("1. Desodoranter");
			System.out.println("2. Hidratação corporal");
			System.out.println("3. Óleo corporal");
			System.out.println("4. Perfume");
			System.out.println("5. Voltar ao menu principal");

			String tipoDesodorante = scanner.nextLine();

			switch (tipoDesodorante) {
			case "1":
				System.out.println("Digite o índice do desodorante a ser atualizado: ");
				int indiceDesodorante = scanner.nextInt();
				scanner.nextLine();
				if (indiceDesodorante < 0 || indiceDesodorante > estoquePerfumaria.getDesodorantes().size()) {
					System.out.println("Índice inválido");
					return;
				}
				System.out.println("Informe o novo nome do desodorante: ");
				String novoNomeDesodorante = scanner.nextLine();

				System.out.println("Informe a nova marca: ");
				String novaMarcaDesodorante = scanner.nextLine();

				System.out.println("Informe o novo preço: ");
				double novoPrecoDesodorante = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a nova fragrância: ");
				String novaFragranciaDesodorante = scanner.nextLine();

				System.out.println("Informe o novo tipo: ");
				String novoTipoDesodorante = scanner.nextLine();

				Perfumaria desodoranteAtualizado = new Desodorante(novoNomeDesodorante, novaMarcaDesodorante, novoPrecoDesodorante, novaFragranciaDesodorante, novoTipoDesodorante);
				estoquePerfumaria.atualizarDesodorante(indiceDesodorante, desodoranteAtualizado);
				System.out.println("Desodorante atualizado com sucesso!");
				break;
			case "2":
				System.out.println("Digite o índice da hidratação corporal a ser atualizado: ");
				int indiceHidratacaoCorporal = scanner.nextInt();
				scanner.nextLine();
				if (indiceHidratacaoCorporal < 0 || indiceHidratacaoCorporal > estoquePerfumaria.getHidratacaoCorporais().size()) {
					System.out.println("Índice inváldio");
					return;
				}
				System.out.println("Informe o novo nome da hidratação corporal: ");
				String novoNomeHidrataçaoCorporal = scanner.nextLine();

				System.out.println("Informe a nova marca: ");
				String novaMarcaHidrataçaoCorporal = scanner.nextLine();

				System.out.println("Informe o novo preço: ");
				double novoPrecoHidrataçaoCorporal = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a nova fragrância: ");
				String novaFragranciaHidrataçaoCorporal = scanner.nextLine();

				System.out.println("Informe o novo tipo de pele: ");
				String novoTipoPele = scanner.nextLine();

				Perfumaria hidratacaoCorporalAtualizado = new HidratacaoCorporal(novoNomeHidrataçaoCorporal, novaMarcaHidrataçaoCorporal, novoPrecoHidrataçaoCorporal, novaFragranciaHidrataçaoCorporal, novoTipoPele);
				estoquePerfumaria.atualizarHidratacaoCorporal(indiceHidratacaoCorporal, hidratacaoCorporalAtualizado);
				System.out.println("Hidratação corporal atualizado com sucesso!");
				break;
			case "3":
				System.out.println("Digite o índice do óleo corporal a ser atualizado: ");
				int indiceOleoCorporal = scanner.nextInt();
				scanner.nextLine();
				if (indiceOleoCorporal < 0 || indiceOleoCorporal > estoquePerfumaria.getOleoCorporais().size()) {
					System.out.println("Índice inválido");
					return;
				}
				System.out.println("Informe o novo nome do óleo corporal: ");
				String novoNomeOleoCorporal = scanner.nextLine();

				System.out.println("Informe a nova marca: ");
				String novaMarcaOleoCorporal = scanner.nextLine();

				System.out.println("Informe o novo preço: ");
				double novoPrecoOleoCorporal = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a nova fragrância: ");
				String novaFragranciaOleoCorporal = scanner.nextLine();

				Perfumaria oleoCorporalAtualizado = new OleoCorporal(novoNomeOleoCorporal, novaMarcaOleoCorporal, novoPrecoOleoCorporal, novaFragranciaOleoCorporal);
				estoquePerfumaria.atualizarOleoCorporal(indiceOleoCorporal, oleoCorporalAtualizado);
				System.out.println("Óleo corporal atualizado com sucesso!");
				break;
			case "4":
				System.out.println("Digite o índice do perfume a ser atualizado: ");
				int indicePerfume = scanner.nextInt();
				scanner.nextLine();
				if (indicePerfume < 0 || indicePerfume > estoquePerfumaria.getPerfumes().size()) {
					System.out.println("Índice inválido");
					return;
				}
				System.out.println("Informe o novo nome do perfume: ");
				String nomeperfume = scanner.nextLine();

				System.out.println("Informe a nova marca: ");
				String marcaperfume = scanner.nextLine();

				System.out.println("Informe o novo preço: ");
				double precoperfume = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe a nova fragrância: ");
				String fragranciaperfume = scanner.nextLine();

				Perfumaria perfumeAtualizado = new Perfume(nomeperfume, marcaperfume, precoperfume, fragranciaperfume);
				estoquePerfumaria.atualizarPerfume(indicePerfume, perfumeAtualizado);
				System.out.println("Perfume atualizado com sucesso!");
				break;
			case "5":
				continuarAtualizando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Tipo de perfumaria inválido!");
				break;
			}
		}
	}

	private static void atualizarItem(EstoqueProdutoCapilar estoqueCapilar, Scanner scanner) {
		boolean continuarAtualizando = false;

		while (continuarAtualizando) {
			System.out.println("Digite o tipo de prdotos capilares:");
			System.out.println("1. Condicionador");
			System.out.println("2. Máscara de Hidratação");
			System.out.println("3. Shampoo");
			System.out.println("4. Voltar ao menu principal");

			String tipoCondicionador = scanner.nextLine();
			scanner.nextLine();

			switch (tipoCondicionador) {
			case "1":
				System.out.println("Digite o índice do condicionador a ser atualizado: ");
				int indiceCondicionador = scanner.nextInt();
				scanner.nextLine();
				if (indiceCondicionador < 0 || indiceCondicionador > estoqueCapilar.getCondicionadores().size()) {
					System.out.println("Índice inválido!");
					return;
				}
				System.out.println("Informe o novo nome do condicionador: ");
				String novoNomeCondicionador = scanner.nextLine();

				System.out.println("Informe a nova marca: ");
				String novaMarcaCondicionador = scanner.nextLine();

				System.out.println("Informe o novo preço: ");
				double novoPrecoCondicionador = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe o novo tipo de cabelo: ");
				String novoTipoCabeloCondicionador = scanner.nextLine();

				ProdutoCapilar condicionadorAtualziado = new Condicionador(novoNomeCondicionador, novaMarcaCondicionador, novoPrecoCondicionador, novoTipoCabeloCondicionador);
				estoqueCapilar.atualizarCondicionador(indiceCondicionador, condicionadorAtualziado);
				System.out.println("Condicionador atualizado com sucesso!");
				break;
			case "2":
				System.out.println("Digite o índice da máscara de hidratação a ser atualizado: ");
				int indiceMascaraHidratacao = scanner.nextInt();
				scanner.nextLine();
				if (indiceMascaraHidratacao < 0 || indiceMascaraHidratacao > estoqueCapilar.getMascaraHidratacaos().size()) {
					System.out.println("Índice inválido!");
					return;
				}
				System.out.println("Informe o novo nome da máscara de hidratação: ");
				String novoNomeMascaraHidratacao = scanner.nextLine();

				System.out.println("Informe a nova marca: ");
				String novaMarcaMascaraHidratacao = scanner.nextLine();

				System.out.println("Informe o novo preço: ");
				double novoPrecoMascaraHidratacao = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe o novo tipo de cabelo: ");
				String novoTipoCabeloMascaraHidratacao = scanner.nextLine();

				ProdutoCapilar mascaraHidratacaoAtualizado = new MascaraHidratacao(novoNomeMascaraHidratacao, novaMarcaMascaraHidratacao, novoPrecoMascaraHidratacao, novoTipoCabeloMascaraHidratacao);
				estoqueCapilar.atualizarMascaraHidatracao(indiceMascaraHidratacao, mascaraHidratacaoAtualizado);
				System.out.println("Máscara de hidratação atualizado com sucesso!");
				break;
			case "3":
				System.out.println("Digite o índice do shampoo a ser atualizado: ");
				int indiceShampoo = scanner.nextInt();
				scanner.nextLine();
				if (indiceShampoo < 0 || indiceShampoo > estoqueCapilar.getShampoos().size()) {
					System.out.println("Índice inválido!");
					return;
				}
				System.out.println("Informe o novo nome do shampoo: ");
				String novoNomeShampoo = scanner.nextLine();

				System.out.println("Informe a nova marca: ");
				String novaMarcaShampoo = scanner.nextLine();

				System.out.println("Informe o novo preço: ");
				double novoPrecoShampoo = scanner.nextDouble();
				scanner.nextLine();

				System.out.println("Informe o novo tipo de cabelo: ");
				String novoTipoCabeloShampoo = scanner.nextLine();

				ProdutoCapilar shampooAtualizado = new Shampoo(novoNomeShampoo, novaMarcaShampoo, novoPrecoShampoo, novoTipoCabeloShampoo);
				estoqueCapilar.atualizarShampoo(indiceShampoo, shampooAtualizado);
				System.out.println("Condicionador atualizado com sucesso!");
				break;
			case "4":
				continuarAtualizando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Tipo de produtos de capilares inválido!");
				break;
			}
		}
	}

	private static void visualizarItens(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		boolean continuarConsultando = true;

		while (continuarConsultando) {
			System.out.println("Escolha o tipo de item para consultar:");
			System.out.println("1. Base");
			System.out.println("2. Batom");
			System.out.println("3. Máscara de Cílios");
			System.out.println("4. Paleta de Sombras");
			System.out.println("5. Pincel");
			System.out.println("6. Voltar ao menu principal");

			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				int quantidadeBases = estoqueMaquiagem.getQuantidadeBases();
				System.out.println("Quantidade de bases: " + quantidadeBases);

				System.out.print("Informe o índice:");
				int indexBase = scanner.nextInt();
				scanner.nextLine(); // Limpar o buffer do scanner

				if (indexBase >= 0 && indexBase < estoqueMaquiagem.getBases().size()) {
					estoqueMaquiagem.consultarBase(indexBase);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "2":
				int quantidadeBatons = estoqueMaquiagem.getQuantidadeBatons();
				System.out.println("Quantidade de batons: " + quantidadeBatons);

				System.out.println("Itens de Batom:");
				int indexBatom = scanner.nextInt();
				scanner.nextLine(); // Limpar o buffer do scanner

				if (indexBatom >= 0 && indexBatom < estoqueMaquiagem.getBatons().size()) {
					estoqueMaquiagem.consultarBatom(indexBatom);
				} else {
					System.out.println("Índice inválido");
				}
				break;	
			case "3":
				int quantidadeMascaraCilios = estoqueMaquiagem.getQuantidadeMascaraCilios();
				System.out.println("Quantidade de máscara de cílios: " + quantidadeMascaraCilios);

				System.out.print("Informe o índice:");
				int indexMascaraCilios = scanner.nextInt();
				scanner.nextLine();

				if (indexMascaraCilios >= 0 && indexMascaraCilios < estoqueMaquiagem.getMascarasCilios().size()) {
					estoqueMaquiagem.consultarMascaraCilios(indexMascaraCilios);
				} else {
					System.out.println("Índice inválido");
				}
				break;	
			case "4":
				int quantidadePaletaSombras = estoqueMaquiagem.getQuantidadePaletaSombras();
				System.out.println("Quantidade de paletas de sombras: " + quantidadePaletaSombras);

				System.out.print("Informe o índice:");
				int indexPaletaSombras = scanner.nextInt();
				scanner.nextLine();

				if (indexPaletaSombras >=0 && indexPaletaSombras < estoqueMaquiagem.getPaletasSombras().size()) {
					estoqueMaquiagem.consultarPaletaSombras(indexPaletaSombras);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "5":
				int quantidadePincel = estoqueMaquiagem.getQuantidadePincels();
				System.out.println("Quantidade de pinceis: " + quantidadePincel);

				System.out.print("Informe o índice:");
				int indexPincel = scanner.nextInt();
				scanner.nextLine();

				if (indexPincel >= 0 && indexPincel < estoqueMaquiagem.getPinceis().size()) {
					estoqueMaquiagem.consultarPincel(indexPincel);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "6":
				continuarConsultando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}
	
	private static void visualizarItens(EstoquePerfumaria estoquePerfumaria, Scanner scanner) {
		boolean continuarConsultando = true;
		
		while (continuarConsultando) {
			System.out.println("Escolha o tipo de item para consultar:");
			System.out.println("1. Desodorante");
			System.out.println("2. Hidratação corporal");
			System.out.println("3. Óleo corporal");
			System.out.println("4. Perfume");
			System.out.println("5. Voltar ao menu principal");
			
			String opcao = scanner.nextLine();
			
			switch (opcao) {
			case "1":
				int quantidadeDesodorante = estoquePerfumaria.getQuantidadeDesodorante();
				System.out.println("Quantidade de desodorantes: " + quantidadeDesodorante);
				
				System.out.println("Informe o índice:");
				int indexDesodorante = scanner.nextInt();
				scanner.nextLine();
				if (indexDesodorante >= 0 && indexDesodorante < estoquePerfumaria.getDesodorantes().size()) {
					estoquePerfumaria.consultarDesodorante(indexDesodorante);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "2":
				int quantidadeHidratacaoCorporal = estoquePerfumaria.getQuantidadeHidratacaoCorporal();
				System.out.println("Quantidade de hidratações corporais: " + quantidadeHidratacaoCorporal);
				
				System.out.println("Informe o índice:");
				int indexHidratacaoCorporal = scanner.nextInt();
				scanner.nextLine();
				if (indexHidratacaoCorporal >= 0 && indexHidratacaoCorporal < estoquePerfumaria.getHidratacaoCorporais().size()) {
					estoquePerfumaria.consultarHidratacaoCorporal(indexHidratacaoCorporal);
				} else {
					System.out.println("Índicie inválido");
				}
				break;
			case "3":
				int quantidadeOleoCorporal = estoquePerfumaria.getQuantidadeOleoCorporal();
				System.out.println("Quantidade de óleos corporais: " + quantidadeOleoCorporal);
				
				System.out.println("Informe o índice:");
				int indexOleoCorporal = scanner.nextInt();
				scanner.nextLine();
				if (indexOleoCorporal >= 0 && indexOleoCorporal < estoquePerfumaria.getOleoCorporais().size()) {
					estoquePerfumaria.consultarOleoCorporal(indexOleoCorporal);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "4":
				int quantidadePerfume = estoquePerfumaria.getQuantidadePerfume();
				System.out.println("Quantidade de perfumes: " + quantidadePerfume);
				
				System.out.println("Informe o índice:");
				int indexPerfume = scanner.nextInt();
				scanner.nextLine();
				if (indexPerfume >= 0 && indexPerfume < estoquePerfumaria.getPerfumes().size()) {
					estoquePerfumaria.consultarPerfume(indexPerfume);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "5":
				continuarConsultando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	private static void visualizarItens(EstoqueProdutoCapilar estoqueCapilar, Scanner scanner) {
		boolean continuarConsultando = true;

		while (continuarConsultando) {
			System.out.println("Escolha o tipo de item para consultar:");
			System.out.println("1. Condicionador");
			System.out.println("2. Máscara de Hidratação");
			System.out.println("3. Shampoo");
			System.out.println("4. Voltar ao menu principal");

			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				int quantidadeCondicionador = estoqueCapilar.getQuantidadeCondicionador();
				System.out.println("Quantidade de condicionadores: " + quantidadeCondicionador);

				System.out.print("Informe o índice:");
				int indexCondicionador = scanner.nextInt();
				scanner.nextLine();
				if (indexCondicionador >= 0 && indexCondicionador < estoqueCapilar.getCondicionadores().size()) {
					estoqueCapilar.consultarCondicionador(indexCondicionador);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "2":
				int quantidadeMascaraHidratacao = scanner.nextInt();
				System.out.println("Quantidade de máscara de hidratação: " + quantidadeMascaraHidratacao);

				System.out.print("Informe o índice:");
				int indexMascaraHidratacao = scanner.nextInt();
				scanner.nextLine();
				if (indexMascaraHidratacao >= 0 && indexMascaraHidratacao < estoqueCapilar.getMascaraHidratacaos().size()) {
					estoqueCapilar.consultarMascaHidatracao(indexMascaraHidratacao);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "3":
				int quantidadeShampoo = estoqueCapilar.getQuantidadeShampo();
				System.out.println("Quantidade de shampoo" + quantidadeShampoo);

				System.out.print("Informe o índice:");
				int indexShampoo = scanner.nextInt();
				scanner.nextLine();
				if (indexShampoo >= 0 && indexShampoo < estoqueCapilar.getShampoos().size()) {
					estoqueCapilar.consultarShampoo(indexShampoo);
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "4":
				continuarConsultando = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	private static void removerItens(EstoqueMaquiagem estoqueMaquiagem, Scanner scanner) {
		boolean continuarRemovendo = true;

		while(continuarRemovendo) {
			System.out.println("Qual tipo de maquiagem deseja remover?");
			System.out.println("1. Base");
			System.out.println("2. Batom");
			System.out.println("3. Máscara de Cílios");
			System.out.println("4. Paleta de Sombras");
			System.out.println("5. Pincel");
			System.out.println("6. Voltar ao menu principal");

			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				System.out.println("Informe o índice da base a ser removida:");
				int indiceBase = scanner.nextInt();
				estoqueMaquiagem.removerBase(indiceBase);
				System.out.println("Base removida com sucesso.");
				break;
			case "2":
				System.out.println("Informe o índice do batom a ser removido:");
				int indiceBatom = scanner.nextInt();
				estoqueMaquiagem.removerBatom(indiceBatom);
				System.out.println("Batom removido com sucesso.");
				break;
			case "3":
				System.out.println("Informe o índice da máscara de cílios a ser removida:");
				int indiceMascaraCilios = scanner.nextInt();
				estoqueMaquiagem.removerMascaraCilios(indiceMascaraCilios);
				System.out.println("Máscara de Cílios removido com sucesso.");
				break;
			case "4":
				System.out.println("Informe o índice da paleta de sombras a ser removida:");
				int indicePaletaSombras = scanner.nextInt();
				estoqueMaquiagem.removerPaletaSombras(indicePaletaSombras);
				System.out.println("Paleta de Sombras removido com sucesso.");
				break;
			case "5":
				System.out.println("Informe o índice do pincel a ser removido:");
				int indicePincel = scanner.nextInt();
				estoqueMaquiagem.removerPinceis(indicePincel);
				System.out.println("Pincel removido com sucesso.");
				break;
			case "6":
				continuarRemovendo = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}
	
	private static void removerItens(EstoquePerfumaria estoquePerfumaria, Scanner scanner) {
		boolean continuarRemovendo = true;
		
		while (continuarRemovendo) {
			System.out.println("Qual tipo de produto capilar deseja remover?");
			System.out.println("1. Desodorante");
			System.out.println("2. Hidratação corporal");
			System.out.println("3. Óleo corporal");
			System.out.println("4. Perfume");
			System.out.println("5. Voltar ao menu principal");
			
			String opcao = scanner.nextLine();
			scanner.nextLine();
			
			switch (opcao) {
			case "1":
				System.out.println("Informe o índice do desodorante a ser removido:");
				int indiceDesodorante = scanner.nextInt();
				estoquePerfumaria.removerDesodorante(indiceDesodorante);
				System.out.println("Desodorante removido com sucesso.");
				break;
			case "2":
				System.out.println("Informe o índice da hidratação corporal a ser removido:");
				int indiceHidratacaoCorporal = scanner.nextInt();
				estoquePerfumaria.removerHidratacaoCorporal(indiceHidratacaoCorporal);
				System.out.println("Hidratação corporal removido com sucesso.");
				break;
			case "3":
				System.out.println("Informe o índice do óleo corporal a ser removido:");
				int indiceOleoCorporal = scanner.nextInt();
				estoquePerfumaria.removerOleoCorporal(indiceOleoCorporal);
				System.out.println("Óleo corporal removido com sucesso.");
				break;
			case "4":
				System.out.println("Informe o índice do perfume a ser removido:");
				int indicePerfume = scanner.nextInt();
				estoquePerfumaria.removerPerfume(indicePerfume);
				System.out.println("Perfume removido com sucesso.");
				break;
			case "5":
				continuarRemovendo = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	private static void removerItens(EstoqueProdutoCapilar estoqueCapilar, Scanner scanner) {
		boolean continuarRemovendo = true;

		while (continuarRemovendo) {
			System.out.println("Qual tipo de produto capilar deseja remover?");
			System.out.println("1. Condicionador");
			System.out.println("2. Máscara de Hidratação");
			System.out.println("3. Shampoo");
			System.out.println("4. Voltar ao menu principal");

			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				System.out.println("Informe o índice do condicionador a ser removido:");
				int indiceCondicionador = scanner.nextInt();
				estoqueCapilar.removerCondicionador(indiceCondicionador);
				System.out.println("Condicionador removido com sucesso.");
				break;
			case "2":
				System.out.println("Informe o índice da máscara de hidratação a ser removida:");
				int indiceMascaraHidratacao = scanner.nextInt();
				estoqueCapilar.removerMascaraHidatracao(indiceMascaraHidratacao);
				System.out.println("Máscara de hidatração removida com sucesso.");
				break;
			case "3":
				System.out.println("Informe o índice do shampoo a ser removido:");
				int indiceShampoo = scanner.nextInt();
				estoqueCapilar.removerShampoo(indiceShampoo);
				System.out.println("Shampoo removido com sucesso.");
				break;
			case "4":
				continuarRemovendo = false;
				exibirMenu();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}

	private static void visualizarEstoqueMaquiagem(ChecarEstoqueMaquiagem checarEstoqueMaquiagem) {
		checarEstoqueMaquiagem.visualizarEstoque();
		exibirMenu();
		System.out.print("Escolha uma opção: ");
	}
	
	private static void visualizarEstoquePerfumaria(ChecarEstoquePerfumaria checarEstoquePerfumaria) {
		checarEstoquePerfumaria.visualizarEstoque();
		exibirMenu();
		System.out.print("Escolha uma opção: ");
	}

	private static void visualizarEstoqueProdutoCapilar(ChecarEstoqueProdutoCapilar checarEstoqueProdutoCapilar) {
		checarEstoqueProdutoCapilar.visualizarEstoque();
		exibirMenu();
		System.out.print("Escolha uma opção: ");
	}

	private static void aplicarProdutoEDesconto(EstoqueMaquiagem estoqueMaquiagem, ChecarEstoqueMaquiagem checarEstoqueMaquiagem, Scanner scanner) {
		checarEstoqueMaquiagem.visualizarEstoque();
		boolean continuarAplicandoProdutoDesconto = true;

		while (continuarAplicandoProdutoDesconto) {
			System.out.println("Digite o tipo de maquiagem");
			System.out.println("1. Base");
			System.out.println("2. Batom");
			System.out.println("3. Máscara de Cílios");
			System.out.println("4. Paleta de Sombras");
			System.out.println("5. Pincel");
			System.out.println("6. Voltar ao menu principal");

			String escolhaTipo = scanner.nextLine();

			switch (escolhaTipo) {
			case "1":
				System.out.print("Escolha a base pelo índice: ");
				int escolhaBase = scanner.nextInt();
				if (escolhaBase >= 0 && escolhaBase < checarEstoqueMaquiagem.getNumeroBases()) {
					Base baseEscolhida = checarEstoqueMaquiagem.getBasePorIndice(escolhaBase);

					System.out.print("Digite o valor do desconto para a base: " + baseEscolhida.getNome() + ": ");
					double descontoBase = scanner.nextDouble();

					baseEscolhida.calcularDesconto(descontoBase);
					baseEscolhida.aplicar();
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case "2":	
				System.out.print("Escolha o batom pelo índice: ");
				int escolhaBatom = scanner.nextInt();
				if (escolhaBatom >= 0 && escolhaBatom < checarEstoqueMaquiagem.getNumeroBatons()) {
					Batom batomEscolhido = checarEstoqueMaquiagem.getBatomPorIndice(escolhaBatom);

					System.out.print("Digite o valor do desconto para o batom: " + batomEscolhido.getNome() + ": ");
					double descontoBatom = scanner.nextDouble();

					batomEscolhido.calcularDesconto(descontoBatom);
					batomEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case "3":
				System.out.print("Escolha a máscara de cílios pelo índice: ");
				int escolhaMascaraCilios = scanner.nextInt();
				if (escolhaMascaraCilios >= 0 && escolhaMascaraCilios < checarEstoqueMaquiagem.getNumeroMascarasCilios()) {
					MascaraCilios mascaraCiliosEscolhido = checarEstoqueMaquiagem.getMascaraCiliosPorIndice(escolhaMascaraCilios);

					System.out.print("Digite o valor do desconto para a máscara de cílios: " + mascaraCiliosEscolhido.getNome() + ": ");
					double descontoMascaraCilios = scanner.nextDouble();

					mascaraCiliosEscolhido.calcularDesconto(descontoMascaraCilios);
					mascaraCiliosEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case "4":	
				System.out.print("Escolha a paleta de sombras pelo índice: ");
				int escolhaPaletaSombras = scanner.nextInt();
				if (escolhaPaletaSombras >= 0 && escolhaPaletaSombras < checarEstoqueMaquiagem.getNumeroPaletasSombras()) {
					PaletaSombras paletaSombrasEscolhido = checarEstoqueMaquiagem.getPaletaSombrasPorIndice(escolhaPaletaSombras);

					System.out.print("Digite o valor do desconto para a paleta de sombras: " + paletaSombrasEscolhido.getNome() + ": ");
					double descontoPaletaSombras = scanner.nextDouble();

					paletaSombrasEscolhido.calcularDesconto(descontoPaletaSombras);
					paletaSombrasEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case "5":	
				System.out.print("Escolha o pincel pelo índice: ");
				int escolhaPincel = scanner.nextInt();
				if (escolhaPincel >= 0 && escolhaPincel < checarEstoqueMaquiagem.getNumeroPinceis()) {
					Pincel pincelEscolhido = checarEstoqueMaquiagem.getNumeroPincelPorIndice(escolhaPincel);

					System.out.print("Digite o valor do desconto para o pincel: " + pincelEscolhido.getNome() + ": ");
					double descontoPincel = scanner.nextDouble();

					pincelEscolhido.calcularDesconto(descontoPincel);
					pincelEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case "6":
				continuarAplicandoProdutoDesconto = false;
				exibirMenu();
				break;
			default:	
				System.out.println("Tipo de maquiagem inválido!");
				break;
			}
		}
	}
	
	private static void aplicarProdutoEDesconto(EstoquePerfumaria estoquePerfumaria,
			ChecarEstoquePerfumaria checarEstoquePerfumaria, Scanner scanner) {
		checarEstoquePerfumaria.visualizarEstoque();
		boolean continuarAplicandoProdutoDesconto = true;
		
		while (continuarAplicandoProdutoDesconto) {
			System.out.println("Digite o tipo de perfumaria");
			System.out.println("1. Desodorante");
			System.out.println("2. Hidratação corporal");
			System.out.println("3. Óleo corporal");
			System.out.println("4. Perfume");
			System.out.println("5. Voltar ao menu principal");
			
			String escolhaTipo = scanner.nextLine();
			
			switch (escolhaTipo) {
			case "1":
				System.out.print("Escolha o desodorante pelo índice: ");
				int escolhaDesodorante = scanner.nextInt();
				if (escolhaDesodorante >= 0 && escolhaDesodorante < checarEstoquePerfumaria.getNumeroDesodorante()) {
					Desodorante desodoranteEscolhido = checarEstoquePerfumaria.getNumeroDesodorantePorIndice(escolhaDesodorante);
					
					System.out.println("Digite o valor do desconto para o desodorante: " + desodoranteEscolhido.getNome() + ": ");
					double descontoDesodorante = scanner.nextDouble();
					
					desodoranteEscolhido.calcularDesconto(descontoDesodorante);
					desodoranteEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "2":
				System.out.print("Escolha a hidratação corporal pelo índice: ");
				int escolhaHidratacaoCorporal = scanner.nextInt();
				if (escolhaHidratacaoCorporal >= 0 && escolhaHidratacaoCorporal < checarEstoquePerfumaria.getNumeroHidratacaoCorporal()) {
					HidratacaoCorporal HidratacaocorporalEscolhido = checarEstoquePerfumaria.getNumeroHidatracaoCorporalPorIndice(escolhaHidratacaoCorporal);
					
					System.out.println("Digite o valor do desconto para a hidratação corporal: " + HidratacaocorporalEscolhido.getNome() + ": ");
					double descontoHidratacao = scanner.nextDouble();
					
					HidratacaocorporalEscolhido.calcularDesconto(descontoHidratacao);
					HidratacaocorporalEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "3":
				System.out.print("Escolha o óleo corporal pelo índice: ");
				int escolhaOleoCorporal = scanner.nextInt();
				if (escolhaOleoCorporal >= 0 && escolhaOleoCorporal < checarEstoquePerfumaria.getNumeroOleoCorporal()) {
					OleoCorporal oleoCorporalEscolhido = checarEstoquePerfumaria.getNumeroOleoCorporalPorIndice(escolhaOleoCorporal);
					
					System.out.println("Digite o valor do desconto para o óleo corporal: " + oleoCorporalEscolhido.getNome() + ": ");
					double descontoOleoCorporal = scanner.nextDouble();
					
					oleoCorporalEscolhido.calcularDesconto(descontoOleoCorporal);
					oleoCorporalEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "4":
				System.out.print("Escolha o óleo corporal pelo índice: ");
				int escolhaPerfume = scanner.nextInt();
				if (escolhaPerfume >= 0 && escolhaPerfume < checarEstoquePerfumaria.getNumeroPerfume()) {
					Perfume perfumeEscoliho = checarEstoquePerfumaria.getNumeroPerfumePorIndice(escolhaPerfume);
					
					System.out.println("Digite o valor do desconto para o perfume: " + perfumeEscoliho.getNome() + ": ");
					double descontoPerfume = scanner.nextDouble();
					
					perfumeEscoliho.calcularDesconto(descontoPerfume);
					perfumeEscoliho.aplicar();
				} else {
					System.out.println("Índice inválido");
				}
				break;
			case "5":
				continuarAplicandoProdutoDesconto = false;
				exibirMenu();
				break;
			default:
				System.out.println("Tipo de maquiagem inválido!");
				break;
			}
		}
	}

	private static void aplicarProdutoEDesconto(EstoqueProdutoCapilar estoqueCapilar,
			ChecarEstoqueProdutoCapilar checarEstoqueProdutoCapilar, Scanner scanner) {
		checarEstoqueProdutoCapilar.visualizarEstoque();
		boolean continuarAplicandoProdutoDesconto = true;

		while (continuarAplicandoProdutoDesconto) {
			System.out.println("Digite o tipo de produto capilar");
			System.out.println("1. Condicionador");
			System.out.println("2. Máscara de Hidratação");
			System.out.println("3. Shampoo");
			System.out.println("4. Voltar ao menu principal");

			String escolhaTipo = scanner.nextLine();

			switch (escolhaTipo) {
			case "1":
				System.out.print("Escolha o condicionador pelo índice: ");
				int escolhaCondicionador = scanner.nextInt();
				if (escolhaCondicionador >= 0 && escolhaCondicionador < checarEstoqueProdutoCapilar.getNumeroCondicionador()) {
					Condicionador condicionadorEscolhido = checarEstoqueProdutoCapilar.getNumeroCondicionadorPorIndice(escolhaCondicionador);

					System.out.print("Digite o valor do desconto para o condicionador: " + condicionadorEscolhido.getNome() + ": ");
					double descontoCondicionador = scanner.nextDouble();

					condicionadorEscolhido.calcularDesconto(descontoCondicionador);
					condicionadorEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case "2":
				System.out.print("Escolha a máscara de hidratação pelo índice: ");
				int escolhaMascaraHidratacao = scanner.nextInt();
				if (escolhaMascaraHidratacao >= 0 && escolhaMascaraHidratacao < checarEstoqueProdutoCapilar.getNumeroMascaraHidatracao()) {
					MascaraHidratacao mascaraHidratacaoEscolhido = checarEstoqueProdutoCapilar.getNumeroMascaraHidatracaoPorIndice(escolhaMascaraHidratacao);

					System.out.print("Digite o valor do desconto para o condicionador: " + mascaraHidratacaoEscolhido.getNome() + ": ");
					double descontoMascaraHidratacao = scanner.nextDouble();

					mascaraHidratacaoEscolhido.calcularDesconto(descontoMascaraHidratacao);
					mascaraHidratacaoEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case "3":
				System.out.print("Escolha o shampoo pelo índice: ");
				int escolhaShampoo = scanner.nextInt();
				if (escolhaShampoo >= 0 && escolhaShampoo < checarEstoqueProdutoCapilar.getNumeroShampoo()) {
					Shampoo shampooEscolhido = checarEstoqueProdutoCapilar.getNumeroShampooPorIndice(escolhaShampoo);

					System.out.print("Digite o valor do desconto para o shampoo: " + shampooEscolhido.getNome() + ": ");
					double descontoShampoo = scanner.nextDouble();

					shampooEscolhido.calcularDesconto(descontoShampoo);
					shampooEscolhido.aplicar();
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case "4":
				continuarAplicandoProdutoDesconto = false;
				exibirMenu();
				break;
			default:
				System.out.println("Tipo de produto capilar inválido!");
				break;
			}
		}
	}

}
