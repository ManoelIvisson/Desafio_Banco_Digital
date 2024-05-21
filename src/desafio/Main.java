package desafio;

public class Main {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(001, 811);
		ContaPoupanca contaPoupanca = new ContaPoupanca(001, 155);
		
		Banco banco = new Banco("Tomé");
		banco.adicionarConta(contaPoupanca);
		banco.adicionarConta(contaCorrente);
		
		contaCorrente.depositar(64);
		contaCorrente.transferencia(55, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		
		banco.exibirContas();
	}
}
