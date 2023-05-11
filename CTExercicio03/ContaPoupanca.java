package banco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, Cliente cliente, double saldo) {
		super(numero, cliente, saldo);
	}
	
	@Override
	public boolean sacar(double valor) {
		if(getSaldo() >= valor) {
			saldo -= valor;
			return true;
		} 
		return false;
	}
}
