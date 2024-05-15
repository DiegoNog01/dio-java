package application;

import java.util.Scanner;

import entities.ContaPessoa;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor, digite o seu nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Por favor, digite o número da Agência!: ");
		String agencia = sc.nextLine();
		
		System.out.print("Por favor, digite o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Por favor, digite o seu saldo: ");
		double saldo = sc.nextDouble();
		
		ContaPessoa pessoa = new ContaPessoa(numero, agencia, nomeCliente, saldo);
		
		System.out.println("Olá " + pessoa.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "+ pessoa.getAgencia() +", conta "+ pessoa.getNumero() +" e seu saldo "+ pessoa.getSaldo() +" já está disponível para saque.");
		
		sc.close();
	}

}
