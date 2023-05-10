package banco;

public abstract class Conta {
	private int numero;
	private Cliente cliente;
	protected double saldo;
	
	public Conta(int numero, Cliente cliente, double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract boolean sacar(double valor);
}