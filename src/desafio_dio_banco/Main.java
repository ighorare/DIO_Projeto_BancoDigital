package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		System.out.println(Banco.getNomeBanco());

		Cliente ighor = new Cliente();
		ighor.setNome("Ighor");

		Conta cc = new ContaCorrente(ighor);
		Conta poupanca = new ContaPoupanca(ighor);

		cc.depositar(500);
		cc.transferir(200, poupanca);
		double valorSaque = 100;
		poupanca.sacar(valorSaque);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println("Saque no valor de " + valorSaque + " efetuado" );

	}

}
