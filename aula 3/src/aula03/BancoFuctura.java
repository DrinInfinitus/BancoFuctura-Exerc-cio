package aula03;

import java.util.Scanner;

public class BancoFuctura {

	public static void main(String[] args) {
		// Declarar variáveis
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = input.next().toLowerCase();
		String bdnome = "raifdbrito";
		
		if (nome .equals(bdnome)) {
			System.out.println("Digite o número da conta:");
			String conta = input.next();
			String bdconta = "raif7dbrito17";
			
			if (conta .equals(bdconta)) {
				System.out.println("Digite uma senha de 4 dígitos:");
				int senha = input.nextInt();
				int bdsenha = 1701;
				
				if (senha == bdsenha) {
					float saldo = (float) 3.000;
					
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
						saldo += valorD;  // saldo = saldo + valor;
						System.out.println("Depósito realizado com sucesso!");
						break;
						default:
							System.out.println("Senha incorreta, bloqueando sua conta, comunique seu banco!");
						}
					case 3:
						System.out.println("Confirme sua senha");
						String sc = input.next().toLowerCase();
						switch (sc) {
						case "1701":
						// Saque só é confirmado, se o usuário acertar a própria senha.
						System.out.println("Digite o valor a ser sacado:");			
						double valorS = input.nextDouble();
						// Condicional para retirar saldo apenas se saldo >= valorS
						saldo -= valorS;  // saldo = saldo - valor;
						System.out.println("Saque realizado, você retirou: ");
						break;
						}
						break;
						
					case 4:
						System.out.println("Obrigado pela atenção!");
						break;
					default:
						break;
					} 
				} else {
					System.out.println("Operação negada, conta bloqueada, contate seu banco!");
				}
			} else {
				System.out.println("Você errou, operação acabada!");
			}
		} else {
			System.out.println("Você errou, operação acabada!");
		}
		
	}

}