package aluraconta;

public class GerenciadorDeImpostoDeRenda {

	private double total;
	private double valor;

	void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);

		this.total += t.calculaTributos();
	}

	public double getTotal() {
		return this.total;
	}
	
}
