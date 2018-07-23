package aluraconta;

public class AtualizaContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizaContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta conta) {
		System.out.printf("Saldo anterior: %.2f\n", conta.getSaldo());
		conta.atualiza(this.selic);
		System.out.printf("Saldo atualizado: %.2f\n", conta.getSaldo());
		this.saldoTotal += conta.getSaldo();
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}
//System.out.printf("O saldo é: %.2f\n", conta.getSaldo());