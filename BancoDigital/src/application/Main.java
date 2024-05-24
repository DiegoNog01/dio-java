package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Cliente;
import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Douglas");
		Cliente c2 = new Cliente("José");
		
		Conta cc = new ContaCorrente(c1);
		Conta cp = new ContaPoupanca(c2);

		cc.depositar(100);
		cc.transferir(cp, 100);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
