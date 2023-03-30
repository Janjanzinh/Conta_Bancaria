package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.util.Cores;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) throws IOException {
		ContaController contas = new ContaController();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo = 0, aniversario;
		String titular;
		float saldo, limite;

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
			System.out.println("*                     Entre com a opção Deseja:                       *");
			System.out.println("                                                                      *");
			System.out.println(
					    "***********************************************************************" + Cores.TEXT_RESET);
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do brasil com Z - Seu futuro começa aqui! ");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar conta \n\n");
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular");
				leia.skip("\\R?");
				titular = leia.nextLine();
				do {
					System.out.println("Digite o tipo da Conta(1-CC) ou (2-CP)");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);
				System.out.println("Digite o Saldo da Conta(R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite da Credito(R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));

				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));

				}
				}
				KeyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as contas\n\n");
				contas.listarTodas();
				KeyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
				KeyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
				KeyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
				KeyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
				KeyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Deposito\n\n");
				KeyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferencia entre Contas\n\n");
				KeyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opcao Inválida!\n");
			}
		}

	}

	public static void KeyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione o enter para continuar...");
			System.in.read();
		} catch (IOException e) {

			System.out.println("Voce apertou uma tecla diferente do enter!");
		}
	}
}
