package desafio;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	public void imprimirExtrato() {
		System.out.println(" *** EXTRATO DA CONTA POUPANÇA *** ");
		super.imprimirExtrato();
	}

	@Override
	public String toString() {
		return "Conta Poupanca [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
}
