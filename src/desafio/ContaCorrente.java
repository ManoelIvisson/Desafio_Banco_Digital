package desafio;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void imprimirExtrato() {
		System.out.println(" *** EXTRATO DA CONTA CORRENTE *** ");
		super.imprimirExtrato();
	}

	@Override
	public String toString() {
		return "Conta Corrente [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
}
