package banco;

public class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial(int numero, String nome_titular, double saldo, double limite) {
		super(numero, nome_titular, saldo);
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
