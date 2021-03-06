package aluraconta;

abstract class Conta {

	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void atualiza(double taxa);
}
