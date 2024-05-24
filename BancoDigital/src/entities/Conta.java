package entities;

public class Conta {

	protected static final Integer AGENCIA_PADRAO = 1;
	protected static Integer SEQUENCIAL = 1;

	protected Integer agencia;
	protected Integer numero;
	protected Double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.saldo = 0.0;
		Conta.SEQUENCIAL = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (saldo > 0 && saldo >= valor) {
			saldo -= valor;
		} else {
			throw new Error("Saldo insuficiente");
		}
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato ===");
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Conta: " + this.numero);
		System.out.printf("Saldo: %.2f\n", this.saldo);
	}
}
