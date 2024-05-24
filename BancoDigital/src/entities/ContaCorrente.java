package entities;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		super.agencia = Conta.AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
}
