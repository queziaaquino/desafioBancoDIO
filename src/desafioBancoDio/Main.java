package desafioBancoDio;

public class Main {

	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.setNome("maria");
		
		Conta cc = new ContaCorrente(maria);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(maria);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
