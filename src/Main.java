
public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupança = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(20, poupança);
		poupança.pixTransferir(10, cc);
		
		
		cc.imprimirExtrato();	
		poupança.imprimirExtrato();
	}

}
