package aluraconta;

public class OperaContas {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();

		contaCorrente.deposita(5000.0);
		contaPoupanca.deposita(10000.0);
		
		AtualizaContas atualizaContas  = new AtualizaContas(1.01);
		atualizaContas.roda(contaCorrente);
		atualizaContas.roda(contaPoupanca);
		
	}
}
