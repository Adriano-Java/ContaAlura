package aluraconta;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void atualiza(double taxa) {
		this.saldo = this.saldo * 2;
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}
