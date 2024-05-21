package desafio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void exibirContas() {
		contas.stream().forEach(conta -> System.out.println(conta));
	}
}
