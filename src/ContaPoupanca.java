
public class ContaPoupanca extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("\n");
		System.out.println("*** Extrato conta Poupan�a ***");
		super.imprimirInformacoes();
	}

}
