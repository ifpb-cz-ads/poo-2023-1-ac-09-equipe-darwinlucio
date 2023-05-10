package banco;

public class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial(int numero, Cliente cliente, double saldo, double limite) {
		super(numero, cliente, saldo);
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valor) {
		if(valor <= limite + saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}
}
