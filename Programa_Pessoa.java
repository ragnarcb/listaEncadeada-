package estrutura_de_dados;

import java.util.Scanner;

public class Programa_Pessoa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String resposta = "S";
		Pessoa primeiro = null;
		Pessoa ultimo = null;
		int opcaoMenuPrincipal = 1;
		while (opcaoMenuPrincipal == 1) {
			int sw;
			System.out.println("Escolha a opção que deseja: ");
			System.out.println("1 - EXIBIR FILA");
			System.out.println("2 - ADICIONAR PESSOA A FILA");
			System.out.println("3 - REMOVER A 1 PESSOA DA FILA");
			sw = input.nextInt();
			switch (sw) {
			case 1:
				Pessoa proximo = primeiro;
				while (proximo != null) {

					System.out.println(proximo);
					proximo = proximo.getProximo();
				}
				break;
			case 2:
				int opcaoMenuSecundario = 1;
				while (opcaoMenuSecundario == 1) {
					System.out.println("Nova pessoa....");
					input.nextLine();
					Pessoa pessoa = new Pessoa();
					System.out.println("Informe o nome da pessoa: ");
					String nome = input.nextLine();
					pessoa.setNome(nome);

					System.out.println("Informe o ID da pessoa: ");
					int id = input.nextInt();
					pessoa.setId(id);

					if (primeiro == null) {
						primeiro = pessoa;
					}
					if (ultimo == null) {
						ultimo = pessoa;
					} else {
						ultimo.setProximo(pessoa);
						ultimo = pessoa;
					}
					input.nextLine();
					System.out.println("Informe se gostaria de inserir mais uma pessoa: S=1/N=0");
					opcaoMenuSecundario  = input.nextInt();
				}
				break;
			case 3:
				primeiro = primeiro.getProximo();
				break;

			default:
				System.out.println("Numero não disponivel!");
			}
			input.nextLine();
			System.out.println("Informe se gostaria de voltar ao menu principal? S=1/N=0");
			opcaoMenuPrincipal = input.nextInt();
		}
		input.close();
		System.out.println("Final do programa....");
	}

}
