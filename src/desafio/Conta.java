package desafio;

public abstract class Conta {
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferencia(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirExtrato() {
		System.out.println(String.format("Agencia %d", agencia));
		System.out.println(String.format("Número %d", numero));
		System.out.println(String.format("Saldo %.2f", saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
