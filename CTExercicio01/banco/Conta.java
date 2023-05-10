package banco;

public abstract class Conta {
	private int numero;
	private String nome_titular;
	protected double saldo;
	
	public Conta(int numero, String nome_titular, double saldo) {
		this.numero = numero;
		this.nome_titular = nome_titular;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract boolean sacar(double valor);
}