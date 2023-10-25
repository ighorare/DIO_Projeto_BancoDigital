package desafio_dio_banco;

import java.util.List;

public class Banco {

	private static final String NOME_BANCO = "      $ DIO BANK $      ";

	public static String getNomeBanco() {
		return NOME_BANCO;
	}

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
