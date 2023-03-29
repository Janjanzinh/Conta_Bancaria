package conta;

import java.util.Scanner;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

//		Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Jennifer", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(1200.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

//		Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 1, "vinicius", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "***********************************************************************");
			System.out.println("*                                                                     *");
			System.out.println("*                             Banco do brazil                         *");
			System.out.println("*                                                                     *");
			System.out.println("***********************************************************************");
			System.out.println("*                                                                     *");
			System.out.println("*                                                                     *");
			System.out.println("*                         1 - Criar conta                             *");
			System.out.println("*                         2 - Listar todas as contas                  *");
			System.out.println("*                         3 - Buscar Conta por Numero                 *");
			System.out.println("*                         4 - Atualizar dados de conta                *");
			System.out.println("*                         5 - Apagar conta                            *");
			System.out.println("*                         6 - Sacar                                   *");
			System.out.println("*                         7 - Depositar                               *");
			System.out.println("*                         8 - Transferir valores entre contas         *");
			System.out.println("*                         9 - Sair                                    *");
			System.out.println("*                                                                     *");
			System.out.println("***********************************************************************");
			System.out.println("*                                                                     *");
			System.out.println(
					"***********************************************************************" + Cores.TEXT_RESET);

			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do brasil com Z - Seu futuro começa aqui! ");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar conta \n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Deposito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferencia entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opcao Inválida!\n");
			}
		}

	}

}
