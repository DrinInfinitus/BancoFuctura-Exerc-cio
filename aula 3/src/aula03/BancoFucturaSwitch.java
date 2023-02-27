package aula03;

import java.util.Scanner;

public class BancoFucturaSwitch {

	public static void main(String[] args) {
		// Declarar variáveis
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = input.next().toLowerCase();
		
		switch (nome) {
		case "raifdbrito":
			System.out.println("Digite o número da conta:");
			String conta = input.next();

			switch (conta) {
			case "raif717":
				System.out.println("Digite uma senha de 4 dígitos:");
				int senha = input.nextInt();
				
				switch (senha) {
				case 1701:
					float saldo = (float) 3000.00;
					
					System.out.println("Por favor, digite uma operação :"
							+ "\n1 - Consultar saldo"
							+ "\n2 - Fazer depósito"
							+ "\n3 - Fazer Saque"
							+ "\n4 - Finalizar.");
					
					int operacao = input.nextInt();
					switch (operacao) {
					case 1: 
						System.out.println("Nome do cliente: " + nome);
						System.out.println("Número da conta: " + conta);
						System.out.printf("Saldo da conta: R$ %.2f \n", saldo);
						break;
					case 2:
						// Deposito só é confirmado, se o usuário acertar a própria senha.
						System.out.println("Confirme sua senha");
						String bdsc = input.next().toLowerCase(); //Banco Dados Senha Confirmação
						switch (bdsc) {
						case "1701":
						System.out.println("Digite o valor a ser depositado:");
						double valorD = input.nextDouble();
						saldo = saldo += valorD;  // saldo = saldo + valor;
						System.out.println("Depósito realizado com sucesso!Seu saldo é: " + saldo);
						break;
						default:
							System.out.println("Senha incorreta, bloqueando sua conta, comunique seu banco!");
							break;
						}
						break;
					case 3:
						// Saque só é confirmado, se o usuário acertar a própria senha.
						System.out.println("Confirme sua senha");
						String sc = input.next().toLowerCase(); //Senha confirmação
						switch (sc) {
						case "1701":
						System.out.println("Digite o valor a ser sacado:");			
						double valorS = input.nextDouble();
						// Condicional para retirar saldo apenas se saldo >= valorS
						saldo -= valorS;  // saldo = saldo - valor;
						if (valorS <= 1000) {
							System.out.println("Saque realizado. Seu novo saldo é: " + saldo);
						} else if (valorS > 1000) {
							System.out.println("Não se pode retirar mais de R$1000");
						}
						break;
						default:
							System.out.println("Senha incorreta, bloqueando sua conta, comunique seu banco!");
							break;
						}
						break;
					case 4:
						System.out.println("Obrigado pela atenção!");
						break;
					default:
						break;
					} 
					break;
				default:
					System.out.println("Você errou, operação acabada!");
					break;
				
				}
				break;
			default:
				System.out.println("Você errou, operação acabada!");
				break;

		}
			break;
		default:
			System.out.println("Você errou, operação acabada!");
			break;
	}
	}
}