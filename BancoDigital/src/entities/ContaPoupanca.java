package entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
}
