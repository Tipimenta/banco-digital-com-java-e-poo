
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupan�a = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(20, poupan�a);
		poupan�a.pixTransferir(10, cc);
		
		
		cc.imprimirExtrato();	
		poupan�a.imprimirExtrato();
	}

}
